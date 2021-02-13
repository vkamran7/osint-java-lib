package maltego.prototype;

import model.facebook.FacebookVideoV2Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MaltegoApi {
    @GET("facebook/search_videos/v2")
    Call<FacebookVideoV2Response> getVideoV2(@Query("query") String query,
                                             @Query("limit") int limit);
}
