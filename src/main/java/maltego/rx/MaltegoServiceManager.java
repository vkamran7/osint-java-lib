package maltego.rx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.facebook.video.FacebookVideoV2Request;
import model.facebook.video.FacebookVideoV2Response;
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

    private static final Object lock = new Object();
    private static volatile MaltegoServiceManager instance;

    private MaltegoAPI maltegoAPI;


    public static synchronized MaltegoServiceManager getInstance() {
        MaltegoServiceManager  r = instance;
        if (instance == null) {
            synchronized (lock) {
                r = instance;
                if (r == null) {
                    r = new MaltegoServiceManager();
                    instance = r;
                }
            }
        }
        return r;
    }

    private MaltegoServiceManager() {

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
            getFacebookV2(query, limit).toBlocking().subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

        return response.get();
    }

    public FacebookVideoV2Response getV2Response(FacebookVideoV2Request request) {
        AtomicReference<FacebookVideoV2Response> responseAtomicReference = new AtomicReference<>(new FacebookVideoV2Response());
        try {
            getFacebookV2(request.getQuery(), request.getLimit()).toBlocking().subscribe(responseAtomicReference::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return responseAtomicReference.get();
    }
}
