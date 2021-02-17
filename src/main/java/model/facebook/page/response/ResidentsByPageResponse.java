package model.facebook.page.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ResidentsByPageResponse {

    public static class Result {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("photo")
        @Expose
        private String photo;
        @SerializedName("photo_id")
        @Expose
        private String photoId;
        @SerializedName("entities")
        @Expose
        private Entities entities;
        @SerializedName("entities_text")
        @Expose
        private EntitiesText entitiesText;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
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

        public String getPhotoId() {
            return photoId;
        }

        public void setPhotoId(String photoId) {
            this.photoId = photoId;
        }

        public Entities getEntities() {
            return entities;
        }

        public void setEntities(Entities entities) {
            this.entities = entities;
        }

        public EntitiesText getEntitiesText() {
            return entitiesText;
        }

        public void setEntitiesText(EntitiesText entitiesText) {
            this.entitiesText = entitiesText;
        }

    }

    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public static class Entities {
        @SerializedName("worked")
        @Expose
        private List<Worked> worked = null;

        public List<Worked> getWorked() {
            return worked;
        }

        public void setWorked(List<Worked> worked) {
            this.worked = worked;
        }
    }

    public static class EntitiesText {

        @SerializedName("worked")
        @Expose
        private List<String> worked = null;

        public List<String> getWorked() {
            return worked;
        }

        public void setWorked(List<String> worked) {
            this.worked = worked;
        }
    }

    public static class Worked {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("info")
        @Expose
        private String info;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

    }
}
