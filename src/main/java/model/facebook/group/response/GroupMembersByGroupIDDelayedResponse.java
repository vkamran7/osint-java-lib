package model.facebook.group.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GroupMembersByGroupIDDelayedResponse {
    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public static class Result {

        @SerializedName("facebook_id")
        @Expose
        private String facebookId;
        @SerializedName("facebook_alias")
        @Expose
        private String facebookAlias;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("photo")
        @Expose
        private String photo;
        @SerializedName("person")
        @Expose
        private String person;
        @SerializedName("join_time")
        @Expose
        private Integer joinTime;
        @SerializedName("info")
        @Expose
        private List<String> info = null;
        @SerializedName("company")
        @Expose
        private String company;

        public String getFacebookId() {
            return facebookId;
        }

        public void setFacebookId(String facebookId) {
            this.facebookId = facebookId;
        }

        public String getFacebookAlias() {
            return facebookAlias;
        }

        public void setFacebookAlias(String facebookAlias) {
            this.facebookAlias = facebookAlias;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getPerson() {
            return person;
        }

        public void setPerson(String person) {
            this.person = person;
        }

        public Integer getJoinTime() {
            return joinTime;
        }

        public void setJoinTime(Integer joinTime) {
            this.joinTime = joinTime;
        }

        public List<String> getInfo() {
            return info;
        }

        public void setInfo(List<String> info) {
            this.info = info;
        }

        public String getCompany() {
            return company;
        }

        public void setCompany(String company) {
            this.company = company;
        }

    }
}
