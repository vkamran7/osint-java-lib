import maltego.rx.MaltegoServiceManager;
import model.facebook.video.request.FacebookVideoByGeoRequest;
import model.facebook.video.request.FacebookVideoV2Request;
import model.facebook.video.response.FacebookVideoByGeoResponse;
import model.facebook.video.response.FacebookVideoV2Response;

public class MaltegoApp {
    public static void main(String[] args) {
        MaltegoServiceManager manager = MaltegoServiceManager.getInstance();
//        FacebookVideoV2Request request =
//                new FacebookVideoV2Request.Builder()
//                .query("ronaldo")
//                .limit(50)
//                .location("portugal")
//                .build();
//
//        FacebookVideoV2Response response;
//
//        response = manager.getV2Response(request);
//        System.out.println(response);

        FacebookVideoByGeoRequest request =
                new FacebookVideoByGeoRequest.Builder()
                .lat(40.757847)
                .lon(-73.989105)
                .distance(1000)
                .limit(2)
                .timeout(11000)
                .delayed(0)
                .taskTimeout(354000)
                .type("videos")
                .build();

        FacebookVideoByGeoResponse response = manager.getFbGeo(request);
        System.out.println(response);
    }
}