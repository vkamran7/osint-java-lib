import model.facebook.FacebookVideoV2Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface APIService {
    String GET_FACEBOOK_VIDEO_V2 = "facebook/search_videos/v2";

    @GET(GET_FACEBOOK_VIDEO_V2)
    Call<FacebookVideoV2Response> getVideo(@Query("query") String query,
                                           @Query("limit") int limit);
}
