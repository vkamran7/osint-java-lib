package model.facebook.user.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class LastActivityDateByUserIDResponse {
    @SerializedName("result")
    @Expose
    private Integer result;

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
