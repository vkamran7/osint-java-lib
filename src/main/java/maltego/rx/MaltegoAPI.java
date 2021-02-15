package maltego.rx;

import model.facebook.video.FacebookVideoByGeoResponse;
import model.facebook.video.FacebookVideoV2Response;
import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

public interface MaltegoAPI {

    @GET("facebook/search_videos/v2")
    Observable<FacebookVideoV2Response> getFacebookVideoV2(@Query("query") String query,
                                                           @Query("limit") int limit);

    @GET("facebook/graph_query_by_geo")
    Observable<FacebookVideoByGeoResponse> getFacebookVideoGeo();

}
