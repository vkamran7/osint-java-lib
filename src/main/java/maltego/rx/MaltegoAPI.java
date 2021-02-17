package maltego.rx;

import model.facebook.photo.response.*;
import model.facebook.video.response.FacebookVideoByGeoResponse;
import model.facebook.video.response.FacebookVideoDetailsResponse;
import model.facebook.video.response.FacebookVideoV2Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MaltegoAPI {

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

//    facebook photo
    @GET("facebook/user_albums/v3")
    Observable<UserAlbumsResponse> getFaceBookUserAlbumsByUserID(@Query("id") Integer id);

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
}
