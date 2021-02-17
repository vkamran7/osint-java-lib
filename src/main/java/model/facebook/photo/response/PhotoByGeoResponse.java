package model.facebook.photo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.facebook.Author;

import java.util.List;

public class PhotoByGeoResponse {

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

        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("created_time")
        @Expose
        private Integer createdTime;
        @SerializedName("photo_id")
        @Expose
        private String photoId;
        @SerializedName("thumb_url")
        @Expose
        private String thumbUrl;
        @SerializedName("author")
        @Expose
        private Author author;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public Integer getCreatedTime() {
            return createdTime;
        }

        public void setCreatedTime(Integer createdTime) {
            this.createdTime = createdTime;
        }

        public String getPhotoId() {
            return photoId;
        }

        public void setPhotoId(String photoId) {
            this.photoId = photoId;
        }

        public String getThumbUrl() {
            return thumbUrl;
        }

        public void setThumbUrl(String thumbUrl) {
            this.thumbUrl = thumbUrl;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

    }
}
