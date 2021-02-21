package maltego.rx;

import model.facebook.page.response.*;
import model.facebook.photo.response.*;
import model.facebook.user.response.*;
import model.facebook.video.response.FacebookVideoByGeoResponse;
import model.facebook.video.response.FacebookVideoDetailsResponse;
import model.facebook.video.response.FacebookVideoV2Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MaltegoAPI {


//    facebook video STARTS
    @GET("facebook/search_videos/v2")
    Observable<FacebookVideoV2Response> getFacebookVideoV2(@Query("query") String query,
                                                           @Query("limit") Integer limit);

    @GET("facebook/graph_query_by_geo")
    Observable<FacebookVideoByGeoResponse> getFacebookVideoGeo(@Query("lat") Double lat,
                                                           @Query("lon") Double lon,
                                                           @Query("distance") Integer distance,
                                                           @Query("limit") Integer limit,
                                                           @Query("timeout") Integer timeout,
                                                           @Query("delayed") Integer delayed,
                                                           @Query("task_id") Integer taskId,
                                                           @Query("task_timeout") Integer taskTimeout,
                                                           @Query("type") String type);

    @GET("fbparser/about_video")
    Observable<FacebookVideoDetailsResponse> getFacebookVideoDetails(@Query("id") Integer id);
//    facebook video ENDS


//    facebook photo STARTS
    @GET("facebook/user_albums/v3")
    Observable<UserAlbumsResponse> getFaceBookUserAlbumsByUserID(@Query("id") String id);

    @GET("facebook/album_photos/v2")
    Observable<PhotosByAlbumResponse> getFacebookPhotosByAlbum(@Query("query") String query,
                                                               @Query("limit") Integer limit);

    @GET("facebook/search_photos/v2")
    Observable<PhotoByPhraseResponse> getPhotoByPhraseLocationDate(@Query("query") String query,
                                                                   @Query("limit") Integer limit,
                                                                   @Query("location") String location,
                                                                   @Query("date") String date,
                                                                   @Query("timeout") Integer timeout);

    @GET("facebook/graph_query_by_geo")
    Observable<PhotoByGeoResponse> getFacebookPhotoByGeo(@Query("lat") Double latitude,
                                                         @Query("lon") Double longitude,
                                                         @Query("distance") Integer distance,
                                                         @Query("limit") Integer limit,
                                                         @Query("timeout") Integer timeout,
                                                         @Query("delayed") Integer delayed,
                                                         @Query("task_id") Integer taskId,
                                                         @Query("task_timeout") Integer taskTimeout,
                                                         @Query("type") String type);

    @GET("fbparser/photo")
    Observable<PhotoDetailsResponse> getFacebookPhotoDetails(@Query("id") Integer id);
//    facebook photo ENDS


//    facebook page STARTS
    @GET("facebook/page_albums")
    Observable<AlbumsByPageResponse> getFacebookPageByPage(@Query("query") String query,
                                                           @Query("limit") Integer limit,
                                                           @Query("timeout") Integer timeout);

    @GET("facebook/page_album_photos")
    Observable<AlbumPhotosResponse> getFacebookPageAlbumPhotos(@Query("query") String query,
                                                               @Query("limit") Integer limit,
                                                               @Query("timeout") Integer timeout);

    @GET("facebook/page_photos")
    Observable<PhotosByPageResponse> getFacebookPagePhotosByPageID(@Query("query") String query,
                                                                   @Query("limit") Integer limit);

    @GET("facebook/page_employees")
    Observable<EmployeesByPageResponse> getFacebookPageEmployeeByPageID(@Query("query") String query,
                                                                        @Query("limit") Integer limit,
                                                                        @Query("timeout") Integer timeout);

    @GET("facebook/page_residents")
    Observable<ResidentsByPageResponse> getFacebookPageResidentsByPageID(@Query("query") String query,
                                                                         @Query("limit") Integer limit,
                                                                         @Query("timeout") Integer timeout);

    @GET("facebook/page_likes")
    Observable<LikedByThisPageResponse> getFacebookPagesLikedByThisPage(@Query("query") String query,
                                                                        @Query("limit") Integer limit,
                                                                        @Query("timeout") Integer timeout);

    @GET("facebook/search_pages/v2")
    Observable<PagesByNameResponse> getFacebookPagesByName(@Query("query") String query,
                                                           @Query("limit") Integer limit,
                                                           @Query("timeout") Integer timeout);

    @GET("facebook/search_events/v2")
    Observable<EventsByPageResponse> getFacebookEventsByName(@Query("query") String query,
                                                             @Query("limit") Integer limit,
                                                             @Query("timeout") Integer timeout);

    @GET("facebook/search_places")
    Observable<PlacesByNameResponse> searchFacebookPlacesByName(@Query("query") String query,
                                                                @Query("limit") Integer limit);

    @GET("fbparser/page_posts")
    Observable<PagePostsByIDResponse> getFacebookPagePostsByID(@Query("id") Integer id,
                                                               @Query("limit") Integer limit,
                                                               @Query("timeout") Integer timeout);

    @GET("facebook/places_search_gps")
    Observable<PlacesByGeoResponse> searchFacebookPlacesByGeo(@Query("lat") Double latitude,
                                                              @Query("lon") Double longitude,
                                                              @Query("distance") Integer distance,
                                                              @Query("limit") Integer limit);

    @GET("facebook/places_in")
    Observable<PlacesInByPageResponse> searchFacebookPlacesInByPage(@Query("query") String query,
                                                                    @Query("limit") Integer limit,
                                                                    @Query("timeout") Integer timeout);

    @GET("facebook/page_events")
    Observable<EventsByPageResponse> searchFacebookEventsByPage(@Query("query") String query,
                                                                @Query("type") String type,
                                                                @Query("limit") Integer limit,
                                                                @Query("timeout") Integer timeout);

    @GET("facebook/page_details")
    Observable<PageDetailsByPageResponse> getFacebookPageDetailsByPage(@Query("query") String query);

    @GET("facebook/related_pages")
    Observable<RelatedPagesByPageResponse> getFacebookRelatedPagesByPageID(@Query("query") String id,
                                                                           @Query("limit") Integer limit);
//    facebook pages ENDS


//    facebook users STARTS
    @GET("facebook/user_by_email")
    Observable<UserByEmailResponse> getFacebookUserByEmail(@Query("query") String query);

    @GET("fbparser/url_to_id")
    Observable<UserIDByProfileURLResponse> getFacebookUserIDByProfileURL(@Query("url") String url);

    @GET("facebook/user_likes/v2")
    Observable<UserLikesByUserIDResponse> getFacebookUserLikesByUserID(@Query("id1") Integer id1,
                                                                       @Query("id2") Integer di2,
                                                                       @Query("limit") Integer limit,
                                                                       @Query("timeout") Integer timeout);

    @GET("facebook/get_name_by_id")
    Observable<ProfileNameByUserIDResponse> getFacebookProfileNameByUserID(@Query("query") String query);

    @GET("fbparser/alias_to_id")
    Observable<UserIDByAliasResponse> getFacebookUserIDByAlias(@Query("query") String query);

    @GET("facebook/user/v4")
    Observable<UserProfileByUserIDResponse> getFacebookUserProfileByUserID(@Query("query") String query);

    @GET("facebook/mutual_friends")
    Observable<MutualFriendsByUserIDResponse> getFacebookMutualFriendsByUserID(@Query("id1") Integer id1,
                                                                               @Query("id2") Integer id2,
                                                                               @Query("limit") Integer limit);

    @GET("facebook/friends/v3")
    Observable<UserFriendsListByUserIDResponse> getFacebookUserFriendsListByUserIDV3(@Query("query") String query,
                                                                                     @Query("limit") Integer limit);

    @GET("user_followers/v2")
    Observable<UserFollowersListByUserIDV2Response> getFacebookUserFollowersListV2(@Query("query") String query,
                                                                                   @Query("limit") Integer limit,
                                                                                   @Query("timeout") Integer timeout);

    @GET("user_following/v3")
    Observable<UserFollowingListByUserIDV3Response> getFacebookUserFollowingListV3(@Query("query") String query,
                                                                                   @Query("limit") Integer limit,
                                                                                   @Query("timeout") Integer timeout);

    @GET("fbparser/user_info")
    Observable<InformationFromUserPageByUserIDResponse> getFacebookInfoFromUserPage(@Query("id") Integer id);

    @GET("facebook/co_workers/v2")
    Observable<UserCoWorkersByUserIDV2Response> getFacebookUserCoWorksByUserIDV2(@Query("query") String query,
                                                                                 @Query("limit") Integer limit,
                                                                                 @Query("timeout") Integer timeout,
                                                                                 @Query("delayed") Integer delayed,
                                                                                 @Query("task_timeout") Integer taskTimeout,
                                                                                 @Query("task_id") Integer taskId);

    @GET("facebook/learning_toghether/v2")
    Observable<UserLearningTogetherV2Response> getFBUserLearningTogether(@Query("query") String query,
                                                                         @Query("limit") Integer limit,
                                                                         @Query("timeout") Integer timeout,
                                                                         @Query("delayed") Integer delayed,
                                                                         @Query("task_id") Integer taskId);

    @GET("facebook/search_relations")
    Observable<RelationsByUserIDResponse> getFacebookRelationsByUserID(@Query("query") String query,
                                                                       @Query("limit") Integer limit,
                                                                       @Query("timeout") Integer timeout);

    @GET("facebook/user_relatives")
    Observable<RelativesByUserIDResponse> getFBRelativesByUserID(@Query("query") String query,
                                                                 @Query("limit") Integer limit,
                                                                 @Query("timeout") Integer timeout);

    @GET("facebook/get_last_activity")
    Observable<LastActivityDateByUserIDResponse> getFBLastActivityDate(@Query("query") String query,
                                                                       @Query("timeout") Integer timeout);

    @GET("foursquare/facebook_to_foursquare")
    Observable<ConvertToFoursquareEntitiesResponse> getFBConvertToFoursquare(@Query("query") String query);
//    facebook user ENDS
}
