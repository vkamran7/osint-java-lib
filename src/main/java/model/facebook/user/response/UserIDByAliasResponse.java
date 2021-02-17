package model.facebook.user.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class UserIDByAliasResponse {
    @SerializedName("id")
    @Expose
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
