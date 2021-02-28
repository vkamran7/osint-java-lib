package model.facebook.group.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GroupPostsByGroupIDResponse {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public static class Target {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("privacy")
        @Expose
        private String privacy;
        @SerializedName("version")
        @Expose
        private Integer version;
        @SerializedName("id")
        @Expose
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPrivacy() {
            return privacy;
        }

        public void setPrivacy(String privacy) {
            this.privacy = privacy;
        }

        public Integer getVersion() {
            return version;
        }

        public void setVersion(Integer version) {
            this.version = version;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public static class Result {

        @SerializedName("from")
        @Expose
        private From from;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("message")
        @Expose
        private String message;
        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("created_time")
        @Expose
        private String createdTime;
        @SerializedName("object_id")
        @Expose
        private String objectId;
        @SerializedName("permalink_url")
        @Expose
        private String permalinkUrl;
        @SerializedName("target")
        @Expose
        private Target target;
        @SerializedName("full_picture")
        @Expose
        private String fullPicture;
        @SerializedName("id")
        @Expose
        private String id;

        public From getFrom() {
            return from;
        }

        public void setFrom(From from) {
            this.from = from;
        }

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
        }

        public String getObjectId() {
            return objectId;
        }

        public void setObjectId(String objectId) {
            this.objectId = objectId;
        }

        public String getPermalinkUrl() {
            return permalinkUrl;
        }

        public void setPermalinkUrl(String permalinkUrl) {
            this.permalinkUrl = permalinkUrl;
        }

        public Target getTarget() {
            return target;
        }

        public void setTarget(Target target) {
            this.target = target;
        }

        public String getFullPicture() {
            return fullPicture;
        }

        public void setFullPicture(String fullPicture) {
            this.fullPicture = fullPicture;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public static class Data {

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("is_silhouette")
        @Expose
        private Boolean isSilhouette;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Boolean getIsSilhouette() {
            return isSilhouette;
        }

        public void setIsSilhouette(Boolean isSilhouette) {
            this.isSilhouette = isSilhouette;
        }

    }

    public static class From {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("picture")
        @Expose
        private Picture picture;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Picture getPicture() {
            return picture;
        }

        public void setPicture(Picture picture) {
            this.picture = picture;
        }

    }

    public static class Picture {

        @SerializedName("data")
        @Expose
        private Data data;

        public Data getData() {
            return data;
        }

        public void setData(Data data) {
            this.data = data;
        }

    }
}
