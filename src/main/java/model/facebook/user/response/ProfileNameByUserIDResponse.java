package model.facebook.user.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ProfileNameByUserIDResponse {
    @SerializedName("name")
    @Expose
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
