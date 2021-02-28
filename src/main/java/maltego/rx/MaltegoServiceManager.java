package maltego.rx;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import model.facebook.page.request.*;
import model.facebook.page.response.*;
import model.facebook.photo.request.*;
import model.facebook.photo.response.*;
import model.facebook.post_reaction_place.request.ReactionsRequest;
import model.facebook.post_reaction_place.response.ReactionsResponse;
import model.facebook.user.request.*;
import model.facebook.user.response.*;
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
        .readTimeout(60, TimeUnit.SECONDS);

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

    public Observable<InformationFromUserPageByUserIDResponse> getFBInfoFromUserPageByUserIDObs(InformationFromUserPageByUserIDRequest request) {
        return maltegoAPI.getFacebookInfoFromUserPage(request.getId());
    }

    public InformationFromUserPageByUserIDResponse getFBInfoFromUserPageByUserID(InformationFromUserPageByUserIDRequest request) {
        AtomicReference<InformationFromUserPageByUserIDResponse> response = new AtomicReference<>();
        try {
            getFBInfoFromUserPageByUserIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<LastActivityDateByUserIDResponse> getLastActivityDateByUserIDObs(LastActivityDateByUserIDRequest request) {
        return maltegoAPI.getFBLastActivityDate(
                request.getQuery(),
                request.getTimeout()
        );
    }

    public LastActivityDateByUserIDResponse getLastActivityDateByUserID(LastActivityDateByUserIDRequest request) {
        AtomicReference<LastActivityDateByUserIDResponse> response = new AtomicReference<>();
        try {
            getLastActivityDateByUserIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<List<MutualFriendsByUserIDResponse>> getFBMutualFriendsByUserIDObs(MutualFriendsByUserIDRequest request) {
        return maltegoAPI.getFacebookMutualFriendsByUserID(
                request.getId1(),
                request.getId2(),
                request.getLimit()
        );
    }

    public List<MutualFriendsByUserIDResponse> getFBMutualFriendsByUserID(MutualFriendsByUserIDRequest request) {
        AtomicReference<List<MutualFriendsByUserIDResponse>> response = new AtomicReference<>();
        try {
            getFBMutualFriendsByUserIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<ProfileNameByUserIDResponse> getFBProfileNameByIDObs(ProfileNameByUserIDRequest request) {
        return maltegoAPI.getFacebookProfileNameByUserID(request.getQuery());
    }

    public ProfileNameByUserIDResponse getFBProfileNameByID(ProfileNameByUserIDRequest request) {
        AtomicReference<ProfileNameByUserIDResponse> response = new AtomicReference<>();
        try {
            getFBProfileNameByIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<RelationsByUserIDResponse> getFBRelationsByUserIDObs(RelationsByUserIDRequest request) {
        return maltegoAPI.getFacebookRelationsByUserID(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public RelationsByUserIDResponse getFBRelationsByUserID(RelationsByUserIDRequest request) {
        AtomicReference<RelationsByUserIDResponse> response = new AtomicReference<>();
        try {
            getFBRelationsByUserIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<RelativesByUserIDResponse> getFBRelativesByUserIDObs(RelativesByUserIDRequest request) {
        return maltegoAPI.getFBRelativesByUserID(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public RelativesByUserIDResponse getFBRelativesByUserID(RelativesByUserIDRequest request) {
        AtomicReference<RelativesByUserIDResponse> response = new AtomicReference<>();
        try {
            getFBRelativesByUserIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserByEmailResponse> getFBUserByEmailObs(UserByEmailRequest request) {
        return maltegoAPI.getFacebookUserByEmail(request.getQuery());
    }

    public UserByEmailResponse getFBUserByEmail(UserByEmailRequest request) {
        AtomicReference<UserByEmailResponse> response = new AtomicReference<>();
        try {
            getFBUserByEmailObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserCoWorkersByUserIDV2Response> getFBUserCoWorkersByUserIDV2Obs(UserCoWorkersByUserIDV2Request request) {
        return maltegoAPI.getFacebookUserCoWorksByUserIDV2(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout(),
                request.getDelayed(),
                request.getTaskTimeout(),
                request.getTaskID()
        );
    }

    public UserCoWorkersByUserIDV2Response getFBUserCoWorkersByUserIDV2(UserCoWorkersByUserIDV2Request request) {
        AtomicReference<UserCoWorkersByUserIDV2Response> response = new AtomicReference<>();
        try {
            getFBUserCoWorkersByUserIDV2Obs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserFollowersListByUserIDV2Response> getFBUserFollowersListByUserIDV2Obs(UserFollowersListByUserIDV2Request request) {
        return maltegoAPI.getFacebookUserFollowersListV2(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public UserFollowersListByUserIDV2Response getFBUserFollowersListByUserIDV2(UserFollowersListByUserIDV2Request request) {
        AtomicReference<UserFollowersListByUserIDV2Response> response = new AtomicReference<>();
        try {
            getFBUserFollowersListByUserIDV2Obs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserFollowingListByUserIDV3Response> getFBUserFollowingListByUserIDV3Obs(UserFollowingListByUserIDV3Request request) {
        return maltegoAPI.getFacebookUserFollowingListV3(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public UserFollowingListByUserIDV3Response getFBUserFollowingListByUserIDV3(UserFollowingListByUserIDV3Request request) {
        AtomicReference<UserFollowingListByUserIDV3Response> response = new AtomicReference<>();
        try {
            getFBUserFollowingListByUserIDV3Obs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserFriendsListByUserIDResponse> getFBUserFriendsListByUserIDV3Obs(UserFriendsListByUserIDRequest request) {
        return maltegoAPI.getFacebookUserFriendsListByUserIDV3(
                request.getQuery(),
                request.getLimit()
        );
    }

    public UserFriendsListByUserIDResponse getFBUserFriendsListByUserIDV3(UserFriendsListByUserIDRequest request) {
        AtomicReference<UserFriendsListByUserIDResponse> response = new AtomicReference<>();
        try {
            getFBUserFriendsListByUserIDV3Obs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserIDByAliasResponse> getFBUserIDByAliasObs(UserIDByAliasRequest request) {
        return maltegoAPI.getFacebookUserIDByAlias(request.getAlias());
    }

    public UserIDByAliasResponse getFBUserIDByAlias(UserIDByAliasRequest request) {
        AtomicReference<UserIDByAliasResponse> response = new AtomicReference<>();
        try {
            getFBUserIDByAliasObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserIDByProfileURLResponse> getFBUserIDByProfileURLObs(UserIDByProfileURLRequest request) {
        return maltegoAPI.getFacebookUserIDByProfileURL(request.getUrl());
    }

    public UserIDByProfileURLResponse getFBUserIDByProfileURL(UserIDByProfileURLRequest request) {
        AtomicReference<UserIDByProfileURLResponse> response = new AtomicReference<>();
        try {
            getFBUserIDByProfileURLObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserLearningTogetherV2Response> getFBUserLearningTogetherByUserIDV2Obs(UserLearningTogetherV2Request request) {
        return maltegoAPI.getFBUserLearningTogether(
                request.getQuery(),
                request.getLimit(),
                request.getTimeout(),
                request.getDelayed(),
                request.getTaskTimeout(),
                request.getTaskId()
        );
    }

    public UserLearningTogetherV2Response getFBUserLearningTogetherByUserIDV2(UserLearningTogetherV2Request request) {
        AtomicReference<UserLearningTogetherV2Response> response = new AtomicReference<>();
        try {
            getFBUserLearningTogetherByUserIDV2Obs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserLikesByUserIDResponse> getFBUserLikesByUserIDObs(UserLikesByUserIDRequest request) {
        return maltegoAPI.getFacebookUserLikesByUserID(
                request.getId1(),
                request.getId2(),
                request.getLimit(),
                request.getTimeout()
        );
    }

    public UserLikesByUserIDResponse getFBUserLikesByUserID(UserLikesByUserIDRequest request) {
        AtomicReference<UserLikesByUserIDResponse> response = new AtomicReference<>();
        try {
            getFBUserLikesByUserIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }

    public Observable<UserProfileByUserIDResponse> getFBUserProfileUserIDObs(UserProfileByUserIDRequest request) {
        return maltegoAPI.getFacebookUserProfileByUserID(request.getQuery());
    }

    public UserProfileByUserIDResponse getFBUserProfileUserID(UserProfileByUserIDRequest request) {
        AtomicReference<UserProfileByUserIDResponse> response = new AtomicReference<>();
        try {
            getFBUserProfileUserIDObs(request).subscribe(response::set);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        return response.get();
    }
    // Facebook Users ENDS

    // Facebook post & reactions & places STARTS
    public Observable<ReactionsResponse> getFBReactionsOfPhotoVideoPostCommentObs(ReactionsRequest request) {
        return maltegoAPI.getFacebookReactionsOfPhotoVideoPostComment(
                request.getId(),
                request.getLimit(),
                request.getIsComment());
    }

    public ReactionsResponse getFBReactionsOfPhotoVideoPostComment(ReactionsRequest request) {
        AtomicReference<ReactionsResponse> response = new AtomicReference<>();
        try {
            getFBReactionsOfPhotoVideoPostCommentObs(request).subscribe(response::set);
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
