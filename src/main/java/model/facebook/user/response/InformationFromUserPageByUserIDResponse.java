package model.facebook.user.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class InformationFromUserPageByUserIDResponse {
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("photo_id")
    @Expose
    private String photoId;
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
    @SerializedName("items")
    @Expose
    private List<Item> items = null;

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

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
    public static class Item {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("info")
        @Expose
        private String info;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("year_from")
        @Expose
        private String yearFrom;
        @SerializedName("year_to")
        @Expose
        private String yearTo;
        @SerializedName("alias")
        @Expose
        private String alias;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getYearFrom() {
            return yearFrom;
        }

        public void setYearFrom(String yearFrom) {
            this.yearFrom = yearFrom;
        }

        public String getYearTo() {
            return yearTo;
        }

        public void setYearTo(String yearTo) {
            this.yearTo = yearTo;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

    }
}
