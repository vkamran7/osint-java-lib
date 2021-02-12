import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class ServiceManager {
    private static ServiceManager sServiceManager;
    public static ServiceManager getInstance() {
        if (sServiceManager == null) {
            sServiceManager = new ServiceManager();
        }
        return sServiceManager;
    }

    public <T> T createService(Class<T> clazz) {
        return createService(clazz, HttpUrl.parse(ServiceApiEndpoints.SERVICE_ENDPOINT));
    }

    public <T> T createService(Class<T> clazz, HttpUrl httpUrl) {
        Retrofit retrofit = getRetrofit(httpUrl);
        return retrofit.create(clazz);
    }

    public <T> T createService(Class<T> clazz, Retrofit retrofit) {
        return retrofit.create(clazz);
    }

    private Retrofit getRetrofit(HttpUrl httpUrl) {
        return new Retrofit.Builder()
                .baseUrl(httpUrl)
                .client(createClient())
                .addConverterFactory(getConverter())
                .build();
    }

    private Converter.Factory getConverter() {
        return GsonConverterFactory.create();
    }

    private OkHttpClient createClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(new RequestInter)
    }

//    private static final String prefixURL = "https://osint.rest/api";

}
