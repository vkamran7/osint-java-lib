package maltego.rx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.facebook.page.request.*;
import model.facebook.page.response.*;
import model.facebook.photo.request.*;
import model.facebook.photo.response.*;
import model.facebook.user.request.ConvertToFoursquareEntitiesRequest;
import model.facebook.user.response.ConvertToFoursquareEntitiesResponse;
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

import java.util.List;
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

    public Observable<PhotoByPhraseResponse> searchFBPhotoByPhraseObs(PhotoByPhraseRequest request) {
        return maltegoAPI.getPhotoByPhraseLocationDate(
                request.getQuery(),
                request.getLimit(),
                request.getLocation(),
                request.getDate(),
                request.getTimeout()
        );
    }

    public PhotoByPhraseResponse searchFBPhotoByPhrase(PhotoByPhraseRequest request) {
        AtomicReference<PhotoByPhraseResponse> response = new AtomicReference<>();
        try {
            searchFBPhotoByPhraseObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<PhotoDetailsResponse> getFBPhotoDetailsObs(PhotoDetailsRequest request) {
        return maltegoAPI.getFacebookPhotoDetails(request.getId());
    }

    public PhotoDetailsResponse getFBPhotoDetails(PhotoDetailsRequest request) {
        AtomicReference<PhotoDetailsResponse> response = new AtomicReference<>();
        try {
            getFBPhotoDetailsObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<List<PhotosByAlbumResponse>> getFBPhotosByAlbumObs(PhotosByAlbumRequest request) {
        return maltegoAPI.getFacebookPhotosByAlbum(
                request.getQuery(),
                request.getLimit()
        );
    }

    public List<PhotosByAlbumResponse> getFBPhotosByAlbums(PhotosByAlbumRequest request) {
        AtomicReference<List<PhotosByAlbumResponse>> response = new AtomicReference<>();
        try {
            getFBPhotosByAlbumObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<AlbumPhotosResponse> getFBPageAlbumPhotosObs(AlbumPhotosRequest request) {
        return maltegoAPI.getFacebookPageAlbumPhotos(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public AlbumPhotosResponse getFBPageAlbumPhotos(AlbumPhotosRequest request) {
        AtomicReference<AlbumPhotosResponse> response = new AtomicReference<>();
        try {
            getFBPageAlbumPhotosObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<AlbumsByPageResponse> getFBAlbumsByPageIDObs(AlbumsByPageRequest request) {
        return maltegoAPI.getFacebookPageAlbumsByPage(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public AlbumsByPageResponse getFBAlbumsByPageID(AlbumsByPageRequest request) {
        AtomicReference<AlbumsByPageResponse> response = new AtomicReference<>();
        try {
            getFBAlbumsByPageIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<EmployeesByPageResponse> getFBPageEmployeesByPageIDObs(EmployeesByPageRequest request) {
        return maltegoAPI.getFacebookPageEmployeeByPageID(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public EmployeesByPageResponse getFBPageEmployeesByPageID(EmployeesByPageRequest request) {
        AtomicReference<EmployeesByPageResponse> response = new AtomicReference<>();
        try {
            getFBPageEmployeesByPageIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<EventsByPageResponse> searchFBEventsByPageIDObs(EventsByPageRequest request) {
        return maltegoAPI.searchFacebookEventsByPage(
                request.getQuery(),
                request.getType(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public EventsByPageResponse searchFBEventsByPageID(EventsByPageRequest request) {
        AtomicReference<EventsByPageResponse> response = new AtomicReference<>();
        try {
            searchFBEventsByPageIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<LikedByThisPageResponse> getFBPagesLikedByThisPageObs(LikedByThisPageRequest request) {
        return maltegoAPI.getFacebookPagesLikedByThisPage(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public LikedByThisPageResponse getFBPagesLikedByThisPage(LikedByThisPageRequest request) {
        AtomicReference<LikedByThisPageResponse> response = new AtomicReference<>();
        try {
            getFBPagesLikedByThisPageObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<PageDetailsByPageResponse> getFbPageDetailsByPageIDObs(PageDetailsByPageRequest request) {
        return maltegoAPI.getFacebookPageDetailsByPage(request.getQuery());
    }

    public PageDetailsByPageResponse getFbPageDetailsByPageID(PageDetailsByPageRequest request) {
        AtomicReference<PageDetailsByPageResponse> response = new AtomicReference<>();
        try {
            getFbPageDetailsByPageIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<PagesByNameResponse> getFBPageByNameObs(PagesByNameRequest request) {
        return maltegoAPI.getFacebookPagesByName(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public PagesByNameResponse getFBPageByName(PagesByNameRequest request) {
        AtomicReference<PagesByNameResponse> response = new AtomicReference<>();
        try {
            getFBPageByNameObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<PhotosByPageResponse> getFBPagePhotosByPageIDObs(PhotosByPageRequest request) {
        return maltegoAPI.getFacebookPagePhotosByPageID(
                request.getQuery(),
                request.getLimit()
        );
    }

    public PhotosByPageResponse getFBPagePhotosByPageID(PhotosByPageRequest request) {
        AtomicReference<PhotosByPageResponse> response = new AtomicReference<>();
        try {
            getFBPagePhotosByPageIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<PlacesByGeoResponse> searchFBPlacesByGeoObs(PlacesByGeoRequest request) {
        return maltegoAPI.searchFacebookPlacesByGeo(
                request.getLat(),
                request.getLon(),
                request.getDistance(),
                request.getLimit()
        );
    }

    public PlacesByGeoResponse searchFBPlacesByGeo(PlacesByGeoRequest request) {
        AtomicReference<PlacesByGeoResponse> response = new AtomicReference<>();
        try {
            searchFBPlacesByGeoObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<PlacesByNameResponse> searchFacebookPlacesByNameObs(PlacesByNameRequest request) {
        return maltegoAPI.searchFacebookPlacesByName(
                request.getQuery(),
                request.getLimit()
        );
    }

    public PlacesByNameResponse searchFacebookPlacesByName(PlacesByNameRequest request) {
        AtomicReference<PlacesByNameResponse> response = new AtomicReference<>();
        try {
            searchFacebookPlacesByNameObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<PlacesInByPageResponse> searchFBPlacesInByPageIDObs(PlacesInByPageRequest request) {
        return maltegoAPI.searchFacebookPlacesInByPage(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public PlacesInByPageResponse searchFBPlacesInByPageID(PlacesInByPageRequest request) {
        AtomicReference<PlacesInByPageResponse> response = new AtomicReference<>();
        try {
            searchFBPlacesInByPageIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<RelatedPagesByPageResponse> getFBRelatedPagesByPageIDObs(RelatedPagesByPageRequest request) {
        return maltegoAPI.getFacebookRelatedPagesByPageID(
                request.getQuery(),
                request.getLimit()
        );
    }

    public RelatedPagesByPageResponse getFBRelatedPagesByPageID(RelatedPagesByPageRequest request) {
        AtomicReference<RelatedPagesByPageResponse> response = new AtomicReference<>();
        try {
            getFBRelatedPagesByPageIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<ResidentsByPageResponse> getFBPageResidentsByPageIDObs(ResidentsByPageRequest request) {
        return maltegoAPI.getFacebookPageResidentsByPageID(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public ResidentsByPageResponse getFBPageResidentsByPageID(ResidentsByPageRequest request) {
        AtomicReference<ResidentsByPageResponse> response = new AtomicReference<>();
        try {
            getFBPageResidentsByPageIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<EventsByNameResponse> getFacebookEventsByNameObs(EventsByNameRequest request) {
        return maltegoAPI.getFacebookEventsByName(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public EventsByNameResponse getFacebookEventsByName(EventsByNameRequest request) {
        AtomicReference<EventsByNameResponse> response = new AtomicReference<>();
        try {
            getFacebookEventsByNameObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<List<PagePostsByIDResponse>> getFacebookPagePostsByIDObs(PagePostsByIDRequest request) {
        return maltegoAPI.getFacebookPagePostsByID(
                request.getId(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public List<PagePostsByIDResponse> getFacebookPagePostsByID(PagePostsByIDRequest request) {
        AtomicReference<List<PagePostsByIDResponse>> response = new AtomicReference<>();
        try {
            getFacebookPagePostsByIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    // Facebook Users Starts
    public Observable<ConvertToFoursquareEntitiesResponse> convertToFoursquareEntitiesObs(ConvertToFoursquareEntitiesRequest request) {
        return maltegoAPI.getFBConvertToFoursquare(
                request.getQuery()
        );
    }

    public ConvertToFoursquareEntitiesResponse convertToFoursquareEntities(ConvertToFoursquareEntitiesRequest request) {
        AtomicReference<ConvertToFoursquareEntitiesResponse> response = new AtomicReference<>();
        try {
            convertToFoursquareEntitiesObs(request).subscribe(response::set);
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
