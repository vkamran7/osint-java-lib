package maltego.prototype;

import model.facebook.FacebookVideoV2Response;

public interface CustomCallback {
    void onSuccess(FacebookVideoV2Response response);
    void onFailure(Throwable throwable);
}
