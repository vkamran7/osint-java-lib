package maltego.rx;

import model.facebook.graph.response.PhotoPostFBGraphSearchByDateResponse;
import model.facebook.graph.response.PhotoProfilePostGraphSearchResponse;
import model.facebook.graph.response.PlacesGraphSearchResponse;
import model.facebook.graph.response.ProfilesFBGraphSearchV2Response;
import model.facebook.group.response.*;
import model.facebook.page.response.*;
import model.facebook.photo.response.*;
import model.facebook.post_reaction_place.response.*;
import model.facebook.user.response.*;
import model.facebook.video.response.FacebookVideoByGeoResponse;
import model.facebook.video.response.FacebookVideoDetailsResponse;
import model.facebook.video.response.FacebookVideoV2Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

import java.util.List;

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
    Observable<List<PhotosByAlbumResponse>> getFacebookPhotosByAlbum(@Query("query") String query,
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
    Observable<PhotoDetailsResponse> getFacebookPhotoDetails(@Query("id") String id);
//    facebook photo ENDS


//    facebook page STARTS
    @GET("facebook/page_albums")
    Observable<AlbumsByPageResponse> getFacebookPageAlbumsByPage(@Query("query") String query,
                                                           @Query("limit") Integer limit,
                                                           @Query("timeout") Integer timeout);

    @GET("facebook/page_album_photos/v2")
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
    Observable<EventsByNameResponse> getFacebookEventsByName(@Query("query") String query,
                                                             @Query("limit") Integer limit,
                                                             @Query("timeout") Integer timeout);

    @GET("facebook/search_places")
    Observable<PlacesByNameResponse> searchFacebookPlacesByName(@Query("query") String query,
                                                                @Query("limit") Integer limit);

    @GET("fbparser/page_posts")
    Observable<List<PagePostsByIDResponse>> getFacebookPagePostsByID(@Query("id") Long id,
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
    Observable<UserLikesByUserIDResponse> getFacebookUserLikesByUserID(@Query("id1") Long id1,
                                                                       @Query("id2") Long di2,
                                                                       @Query("limit") Integer limit,
                                                                       @Query("timeout") Integer timeout);

    @GET("facebook/get_name_by_id")
    Observable<ProfileNameByUserIDResponse> getFacebookProfileNameByUserID(@Query("query") String query);

    @GET("fbparser/alias_to_id")
    Observable<UserIDByAliasResponse> getFacebookUserIDByAlias(@Query("alias") String query);

    @GET("facebook/user/v4")
    Observable<UserProfileByUserIDResponse> getFacebookUserProfileByUserID(@Query("query") String query);

    @GET("facebook/mutual_friends")
    Observable<List<MutualFriendsByUserIDResponse>> getFacebookMutualFriendsByUserID(@Query("id1") Long id1,
                                                                               @Query("id2") Long id2,
                                                                               @Query("limit") Integer limit);

    @GET("facebook/friends/v3")
    Observable<UserFriendsListByUserIDResponse> getFacebookUserFriendsListByUserIDV3(@Query("query") String query,
                                                                                     @Query("limit") Integer limit);

    @GET("facebook/user_followers/v2")
    Observable<UserFollowersListByUserIDV2Response> getFacebookUserFollowersListV2(@Query("query") String query,
                                                                                   @Query("limit") Integer limit,
                                                                                   @Query("timeout") Integer timeout);

    @GET("facebook/user_following/v3")
    Observable<UserFollowingListByUserIDV3Response> getFacebookUserFollowingListV3(@Query("query") String query,
                                                                                   @Query("limit") Integer limit,
                                                                                   @Query("timeout") Integer timeout);

    @GET("fbparser/user_info")
    Observable<InformationFromUserPageByUserIDResponse> getFacebookInfoFromUserPage(@Query("id") Long id);

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
                                                                         @Query("task_timeout") Integer taskTimeout,
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



//    facebook post & reactions & places STARTS
    @GET("facebook/reactions")
    Observable<List<ReactionsResponse>> getFacebookReactionsOfPhotoVideoPostComment(@Query("id") Long id,
                                                                              @Query("limit") Integer limit,
                                                                              @Query("is_comment") Integer isComment);

    @GET("facebook/reposts")
    Observable<RepostsResponse> getFacebookRepostsOfPhotoVideoPost(@Query("query") String query,
                                                                   @Query("timeout") Integer timeout,
                                                                   @Query("limit") Integer limit);

    @GET("facebook/user_posts/v2")
    Observable<UserPostsByUserIDResponse> getFacebookUserPostsByUserID(@Query("query") String query,
                                                                       @Query("limit") Integer limit,
                                                                       @Query("timeout") Integer timeout);

    @GET("delayed/facebook/user_posts")
    Observable<UserPostsByUserIDDelayedResponse> getFacebookUserPostsByUserIDDelayed(@Query("query") String query,
                                                                                     @Query("limit") Integer limit,
                                                                                     @Query("task_id") Integer taskID,
                                                                                     @Query("timeout") Integer timeout);

    @GET("facebook/search_posts/v2")
    Observable<PostsByPhraseResponse> searchFacebookPostsByPhraseLocationDate(@Query("query") String query,
                                                                              @Query("limit") Integer limit,
                                                                              @Query("location") String location,
                                                                              @Query("date") String date,
                                                                              @Query("timeout") Integer timeout);

    @GET("facebook/post_detail")
    Observable<PostInfoResponse> getFacebookPostInfoByOwnerIDPostID(@Query("owner_id") Long ownerID,
                                                                    @Query("post_id") Long postID);

    @GET("facebook/post_media")
    Observable<PostMediaResponse> getFacebookPostMedia(@Query("query") String query,
                                                       @Query("owner_id") Long ownerID,
                                                       @Query("wall_owner") Long wallOwner,
                                                       @Query("limit") Integer limit);
//    facebook post & reactions & places ENDS


//    Facebook Groups STARTS
    @GET("facebook/search_groups/v2")
    Observable<GroupsByNameResponse> searchFacebookGroupsByName(@Query("query") String query,
                                                                @Query("limit") Integer limit,
                                                                @Query("timeout") Integer timeout);

    @GET("facebook/group_members")
    Observable<GroupMembersByGroupIDResponse> getFacebookGroupMembersByGroupID(@Query("query") String query,
                                                                               @Query("limit") Integer limit,
                                                                               @Query("timeout") Integer timeout);

    @GET("delayed/facebook/group_members")
    Observable<GroupMembersByGroupIDDelayedResponse> getFacebookGroupMembersByGroupIDDelayed(@Query("query") String query,
                                                                                             @Query("limit") Integer limit,
                                                                                             @Query("timeout") Integer timeout,
                                                                                             @Query("task_id") Integer taskID);

    @GET("facebook/group_posts")
    Observable<GroupPostsByGroupIDResponse> getFacebookGroupPostsByGroupID(@Query("query") String query,
                                                                           @Query("limit") Integer limit);

    @GET("facebook/group_detail")
    Observable<GroupDetailsByGroupIDResponse> getFacebookGroupDetailsByGroupID(@Query("query") String query,
                                                                               @Query("limit") Integer limit);
//    Facebook Groups ENDS

//    Facebook Graph STARTS
    @GET("facebook/graph_query_by_date")
    Observable<PhotoPostFBGraphSearchByDateResponse> getPhotoPostFBGraphByDate(@Query("query") String query,
                                                                               @Query("type") String type,
                                                                               @Query("date_from") String dateFrom,
                                                                               @Query("date_to") String dateTo,
                                                                               @Query("timeout") Integer timeout,
                                                                               @Query("limit") Integer limit,
                                                                               @Query("delayed") Integer delayed,
                                                                               @Query("task_id") Integer taskID,
                                                                               @Query("task_timeout") Integer taskTimeout);

    @GET("facebook/graph_query")
    Observable<PhotoProfilePostGraphSearchResponse> getPhotoProfileFBUsingGraph(@Query("query") String query,
                                                                                @Query("limit") Integer limit,
                                                                                @Query("type") String type,
                                                                                @Query("timeout") Integer timeout);

    @GET("facebook/query_places_na")
    Observable<PlacesGraphSearchResponse> getPlaceFromFBUsingGraph(@Query("query") String query,
                                                                   @Query("limit") Integer limit,
                                                                   @Query("timeout") Integer timeout);

    @GET("facebook/graph_query/v2")
    Observable<ProfilesFBGraphSearchV2Response> getProfilesFromFBUsingGraph(@Query("query") String query,
                                                                            @Query("type") String type,
                                                                            @Query("timeout") Integer timeout,
                                                                            @Query("limit") Integer limit,
                                                                            @Query("delayed") Integer delayed,
                                                                            @Query("task_timeout") Integer taskTimeout,
                                                                            @Query("task_id") Integer taskID);
//    Facebook Graph ENDS
}
