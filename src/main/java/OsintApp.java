import maltego.prototype.CustomCallback;
import maltego.prototype.MaltegoController;
import model.facebook.FacebookVideoV2Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class OsintApp {



    public static void main(String[] args) {
        MaltegoController controller = new MaltegoController();
        controller.start(new CustomCallback() {
            @Override
            public void onSuccess(FacebookVideoV2Response response) {

            }

            @Override
            public void onFailure(Throwable throwable) {

            }
        });
        while (controller.getResponse() == null) {
            if (controller.getResponse() != null)
                break;
        }
        FacebookVideoV2Response response = controller.getResponse();
        System.out.println();
    }
}
