import maltego.rx.MaltegoServiceManager;
import model.facebook.video.request.FacebookVideoV2Request;
import model.facebook.video.response.FacebookVideoV2Response;

public class MaltegoApp {
    public static void main(String[] args) {
        MaltegoServiceManager manager = MaltegoServiceManager.getInstance();
        FacebookVideoV2Request request =
                new FacebookVideoV2Request.Builder()
                .query("ronaldo")
                .limit(50)
                .location("portugal")
                .build();

        FacebookVideoV2Response response;

        response = manager.getV2Response(request);
        System.out.println(response);
    }
}