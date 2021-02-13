package maltego.prototype;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.facebook.FacebookVideoV2Response;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MaltegoController implements Callback<FacebookVideoV2Response> {

    private static final String BASE_URL = "https://osint.rest/api/";
    private static final String API_KEY = "197e25ace2da888ca5c4f23370777d8c87d0de1cf89657e22b";
    CustomCallback callback;
    FacebookVideoV2Response facebookVideoV2Response;

    public void start(CustomCallback customCallback) {
        callback = customCallback;

        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        builder.addInterceptor(chain -> {
            Request request = chain.request().newBuilder().addHeader("Authorization", API_KEY).build();
            return chain.proceed(request);
        });

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = null;

        try {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .client(builder.build())
                    .build();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        assert retrofit != null;
        MaltegoApi maltegoAPI = retrofit.create(MaltegoApi.class);
        Call<FacebookVideoV2Response> call = maltegoAPI.getVideoV2("ronaldo",5);
        call.enqueue(this);
    }

    @Override
    public void onResponse(Call<FacebookVideoV2Response> call, Response<FacebookVideoV2Response> response) {
        if (response.isSuccessful()) {
            FacebookVideoV2Response videoV2Response = response.body();
            assert videoV2Response != null;
            videoV2Response.getResult().forEach(System.out::println);
            setResponse(videoV2Response);
            if (callback != null) {
                callback.onSuccess(videoV2Response);
            }
        } else {
            System.out.println(response.errorBody());
        }
    }

    @Override
    public void onFailure(Call<FacebookVideoV2Response> call, Throwable throwable) {
        throwable.printStackTrace();
        if (callback != null) {
            callback.onFailure(throwable);
        }
    }

    public void setResponse(FacebookVideoV2Response response) {
        this.facebookVideoV2Response = response;
    }

    public FacebookVideoV2Response getResponse() {
        return facebookVideoV2Response;
    }
}
