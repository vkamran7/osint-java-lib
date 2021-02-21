import maltego.rx.MaltegoServiceManager;
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
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class FacebookApiTest {
    private static MaltegoServiceManager manager;

    @BeforeAll
    static void before() {
        manager = MaltegoServiceManager.getInstance();
    }

    @Test
    void testFBVideoV2() {
        FacebookVideoV2Request request =
                new FacebookVideoV2Request.Builder()
                        .query("ronaldo")
                        .limit(50)
                        .location("portugal")
                        .build();

        FacebookVideoV2Response response;
        response = manager.getV2Response(request);
        Assertions.assertEquals(50, response.getResult().size());
    }

    @Test
    void testFBVideoByGeo() {
        FacebookVideoByGeoRequest request =
                new FacebookVideoByGeoRequest.Builder()
                        .lat(40.757847)
                        .lon(-73.989105)
                        .distance(1000)
                        .limit(2)
                        .timeout(1100)
                        .delayed(0)
                        .taskTimeout(354000)
                        .type("videos")
                        .build();

        FacebookVideoByGeoResponse response = manager.getFbGeo(request);
        Assertions.assertEquals(2, response.getResult().size());
    }

    @Test
    void testFBVideoDetails() {
        FacebookVideoDetailsRequest request = new FacebookVideoDetailsRequest();
        request.setId(15);

        FacebookVideoDetailsResponse response = manager.getFBVideoDetails(request);
        Assertions.assertNotNull(response.getAuthor());
    }

    @Test
    void testFBAlbumsByUserID() {
        UserAlbumsRequest request = new UserAlbumsRequest.Builder()
                .withId("100005173955397")
                .build();
        UserAlbumsResponse response = manager.getFBUserAlbumsByUserID(request);
        Assertions.assertNotNull(response);
    }

    @Test
    void testSearchPhotoByGeo() {
        PhotoByGeoRequest request = new PhotoByGeoRequest.Builder()
                .withLat(40.757847)
                .withLon(-73.989105)
                .withDistance(1000)
                .withLimit(2)
                .withTimeout(110)
                .withDelayed(0)
                .withTaskTimeout(3540)
                .withType("photos")
                .build();
        PhotoByGeoResponse response = manager.searchFBPhotosByGeo(request);
        Assertions.assertEquals(2, response.getResult().size());
    }

}
