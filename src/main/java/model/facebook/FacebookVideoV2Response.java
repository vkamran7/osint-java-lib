package model.facebook;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FacebookVideoV2Response {
    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    @Override
    public String toString() {
        return "FacebookVideoV2Response{" +
                "result=" + result +
                '}';
    }
}
