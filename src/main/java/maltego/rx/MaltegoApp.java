package maltego.rx;

import model.facebook.video.FacebookVideoV2Request;
import model.facebook.video.FacebookVideoV2Response;

public class MaltegoApp {
    public static void main(String[] args) {
        MaltegoServiceManager manager = new MaltegoServiceManager();
        FacebookVideoV2Request request =
                new FacebookVideoV2Request.Builder()
                .query("ronaldo")
                .limit(500)
                .location("portugal")
                .build();

        FacebookVideoV2Response response;

        response = manager.getV2Response(request);
        System.out.println(response);
    }
}