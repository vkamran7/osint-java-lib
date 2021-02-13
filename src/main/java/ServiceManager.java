import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import retrofit2.Converter;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public final class ServiceManager {

    private static final String API_KEY = "197e25ace2da888ca5c4f23370777d8c87d0de1cf89657e22b";

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
                .addInterceptor(chain -> {
                    Request request = chain.request().newBuilder().addHeader("Authorization", API_KEY).build();
                    return chain.proceed(request);
                }).build();
    }

//    private static final String prefixURL = "https://osint.rest/api";

}
