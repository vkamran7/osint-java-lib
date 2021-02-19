import maltego.rx.MaltegoServiceManager;
import model.facebook.video.request.FacebookVideoV2Request;
import model.facebook.video.response.FacebookVideoV2Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MaltegoApiTest {

    @Test
    void testFBVideoV2() {
        MaltegoServiceManager manager = MaltegoServiceManager.getInstance();
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


}
