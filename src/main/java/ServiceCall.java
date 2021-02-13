import maltego.prototype.CustomCallback;
import model.facebook.FacebookVideoV2Response;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ServiceCall implements Callback<FacebookVideoV2Response>{

    void get(CustomCallback callback) {

    }

    @Override
    public void onResponse(Call<FacebookVideoV2Response> call, Response<FacebookVideoV2Response> response) {

    }

    @Override
    public void onFailure(Call<FacebookVideoV2Response> call, Throwable throwable) {

    }
}
