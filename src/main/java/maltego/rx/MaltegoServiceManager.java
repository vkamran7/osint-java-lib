package maltego.rx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.facebook.photo.request.PhotoByGeoRequest;
import model.facebook.photo.request.UserAlbumsRequest;
import model.facebook.photo.response.PhotoByGeoResponse;
import model.facebook.photo.response.UserAlbumsResponse;
import model.facebook.video.request.FacebookVideoByGeoRequest;
import model.facebook.video.request.FacebookVideoDetailsRequest;
import model.facebook.video.request.FacebookVideoV2Request;
import model.facebook.video.response.FacebookVideoByGeoResponse;
import model.facebook.video.response.FacebookVideoDetailsResponse;
import model.facebook.video.response.FacebookVideoV2Response;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import rx.Observable;
import rx.Single;

import java.util.concurrent.TimeUnit;
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
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        OkHttpClient.Builder okHttpClient = new OkHttpClient.Builder();
        okHttpClient.addInterceptor(chain -> {
            Request request = chain.request().newBuilder().addHeader("Authorization", API_KEY).build();
            return chain.proceed(request);
        }).addInterceptor(logging)
        .connectTimeout(20, TimeUnit.SECONDS)
        .writeTimeout(20, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS);

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .addCallAdapterFactory(RxJavaCallAdapterFactory.create())
                .client(okHttpClient.build())
//                .client(client)
                .build();
        maltegoAPI = retrofit.create(MaltegoAPI.class);
    }

    public Observable<FacebookVideoV2Response> getFacebookV2(String query, int limit) {
        return maltegoAPI.getFacebookVideoV2(query, limit);
    }

    public Observable<FacebookVideoByGeoResponse> getFacebookByGeo(FacebookVideoByGeoRequest request) {
        return maltegoAPI.getFacebookVideoGeo(
                request.getLat(),
                request.getLon(),
                request.getDistance(),
                request.getLimit(),
                request.getTimeout(),
                request.getDelayed(),
                request.getTaskId(),
                request.getTaskTimeout(),
                request.getType()
        );
    }

    public Observable<FacebookVideoDetailsResponse> getFBVideoDetailsObs(FacebookVideoDetailsRequest request) {
        return maltegoAPI.getFacebookVideoDetails(request.getId());
    }

    public Observable<UserAlbumsResponse> getFBUserAlbumsByUserIDObs(UserAlbumsRequest request) {
        return maltegoAPI.getFaceBookUserAlbumsByUserID(request.getId());
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

    public FacebookVideoByGeoResponse getFbGeo(FacebookVideoByGeoRequest request) {
        AtomicReference<FacebookVideoByGeoResponse> response = new AtomicReference<>(new FacebookVideoByGeoResponse());
        try {
            getFacebookByGeo(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public FacebookVideoDetailsResponse getFBVideoDetails(FacebookVideoDetailsRequest request) {
        AtomicReference<FacebookVideoDetailsResponse> response = new AtomicReference<>();
        try {
            getFBVideoDetailsObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public UserAlbumsResponse getFBUserAlbumsByUserID(UserAlbumsRequest request) {
        AtomicReference<UserAlbumsResponse> response = new AtomicReference<>();
        try {
            getFBUserAlbumsByUserIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<PhotoByGeoResponse> searchFBPhotosByGeoObs(PhotoByGeoRequest request) {
        return maltegoAPI.getFacebookPhotoByGeo(
                request.getLat(),
                request.getLon(),
                request.getDistance(),
                request.getLimit(),
                request.getTimeout(),
                request.getDelayed(),
                request.getTaskId(),
                request.getTaskTimeout(),
                request.getType()
        );
    }

    public PhotoByGeoResponse searchFBPhotosByGeo(PhotoByGeoRequest request) {
        AtomicReference<PhotoByGeoResponse> response = new AtomicReference<>();
        try {
            searchFBPhotosByGeoObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }


//    private static OkHttpClient client = new OkHttpClient.Builder()
//            .addInterceptor(chain -> {
//                Request request = chain.request().newBuilder().addHeader("Authorization", API_KEY).build();
//                return chain.proceed(request);
//            })
//            .retryOnConnectionFailure(true)
//            .build();
}
