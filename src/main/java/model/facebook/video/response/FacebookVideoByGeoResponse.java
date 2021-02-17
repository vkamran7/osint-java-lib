package model.facebook.video.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.facebook.Author;

import java.util.List;

public class FacebookVideoByGeoResponse {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    private static class Result {
        @Override
        public String toString() {
            return "Result{" +
                    "id='" + id + '\'' +
                    ", url='" + url + '\'' +
                    ", photo='" + photo + '\'' +
                    ", publishTime=" + publishTime +
                    ", title='" + title + '\'' +
                    ", author=" + author +
                    ", viewsCount=" + viewsCount +
                    ", duration=" + duration +
                    ", descr='" + descr + '\'' +
                    '}';
        }

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("photo")
        @Expose
        private String photo;
        @SerializedName("publish_time")
        @Expose
        private Integer publishTime;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("author")
        @Expose
        private Author author;
        @SerializedName("views_count")
        @Expose
        private Integer viewsCount;
        @SerializedName("duration")
        @Expose
        private Integer duration;
        @SerializedName("descr")
        @Expose
        private String descr;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public Integer getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(Integer publishTime) {
            this.publishTime = publishTime;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public Integer getViewsCount() {
            return viewsCount;
        }

        public void setViewsCount(Integer viewsCount) {
            this.viewsCount = viewsCount;
        }

        public Integer getDuration() {
            return duration;
        }

        public void setDuration(Integer duration) {
            this.duration = duration;
        }

        public String getDescr() {
            return descr;
        }

        public void setDescr(String descr) {
            this.descr = descr;
        }
    }

    @Override
    public String toString() {
        return "FacebookVideoByGeoResponse{" +
                "result=" + result +
                '}';
    }
}
