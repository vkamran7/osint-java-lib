package model.facebook.graph.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlacesGraphSearchResponse {

    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("exec_time")
    @Expose
    private Double execTime;
    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("retries")
    @Expose
    private Integer retries;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Double getExecTime() {
        return execTime;
    }

    public void setExecTime(Double execTime) {
        this.execTime = execTime;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Integer getRetries() {
        return retries;
    }

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    public static class Result {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("lat")
        @Expose
        private Double lat;
        @SerializedName("lng")
        @Expose
        private Double lng;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("rating")
        @Expose
        private Integer rating;
        @SerializedName("rating_count")
        @Expose
        private Integer ratingCount;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Double getLat() {
            return lat;
        }

        public void setLat(Double lat) {
            this.lat = lat;
        }

        public Double getLng() {
            return lng;
        }

        public void setLng(Double lng) {
            this.lng = lng;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getRating() {
            return rating;
        }

        public void setRating(Integer rating) {
            this.rating = rating;
        }

        public Integer getRatingCount() {
            return ratingCount;
        }

        public void setRatingCount(Integer ratingCount) {
            this.ratingCount = ratingCount;
        }

    }

}
