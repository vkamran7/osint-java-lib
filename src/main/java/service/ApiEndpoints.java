package service;

import model.facebook.video.response.FacebookVideoV2Response;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface ApiEndpoints {
    @GET("/facebook/search_videos/v2")
    @Headers("Authorization")
    Call<FacebookVideoV2Response> getVideos(@Query("query") String query,
                                            @Query("limit") String limit,
                                            @Query("location") String location,
                                            @Query("date") String date,
                                            @Query("timeout") String timeout);
}
