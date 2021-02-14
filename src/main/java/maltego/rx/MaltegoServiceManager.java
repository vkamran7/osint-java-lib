package maltego.rx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.facebook.FacebookVideoV2Response;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;

import java.util.concurrent.atomic.AtomicReference;

public final class MaltegoServiceManager {

    private static final String BASE_URL = "https://osint.rest/api/";
    private static final String API_KEY = "197e25ace2da888ca5c4f23370777d8c87d0de1cf89657e22b";

    private MaltegoAPI maltegoAPI;

    MaltegoServiceManager() {

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.addInterceptor(chain -> {
            Request request = chain.request().newBuilder().addHeader("Authorization", API_KEY).build();
            return chain.proceed(request);
        });

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient.build())
                .build();
        maltegoAPI = retrofit.create(MaltegoAPI.class);
    }

    Observable<FacebookVideoV2Response> getFacebookV2(String query, int limit) {
        return maltegoAPI.getFacebookVideoV2(query, limit);
    }

    public FacebookVideoV2Response getV2Response(String query, int limit) {
        AtomicReference<FacebookVideoV2Response> response = new AtomicReference<>(new FacebookVideoV2Response());
        try {
            getFacebookV2(query, limit).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return response.get();
    }
}
