package model.facebook.photo.request;

public class PhotoByGeoResponse {
    private Double lat;
    private Double lon;
    private Long distance;
    private Integer limit;
    private Integer timeout;
    private Integer delayed;
    private Integer taskId;
    private Integer taskTimeout;
    private String type;

    public Double getLat() {
        return lat;
    }

    public Double getLon() {
        return lon;
    }

    public Long getDistance() {
        return distance;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public Integer getDelayed() {
        return delayed;
    }

    public Integer getTaskId() {
        return taskId;
    }

    public Integer getTaskTimeout() {
        return taskTimeout;
    }

    public String getType() {
        return type;
    }

    public static final class Builder {
        private Double lat;
        private Double lon;
        private Long distance;
        private Integer limit;
        private Integer timeout;
        private Integer delayed;
        private Integer taskId;
        private Integer taskTimeout;
        private String type;

        public Builder() {
        }

        public static Builder aPhotoByGeoResponse() {
            return new Builder();
        }

        public Builder withLat(Double lat) {
            this.lat = lat;
            return this;
        }

        public Builder withLon(Double lon) {
            this.lon = lon;
            return this;
        }

        public Builder withDistance(Long distance) {
            this.distance = distance;
            return this;
        }

        public Builder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder withTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder withDelayed(Integer delayed) {
            this.delayed = delayed;
            return this;
        }

        public Builder withTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public Builder withTaskTimeout(Integer taskTimeout) {
            this.taskTimeout = taskTimeout;
            return this;
        }

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public PhotoByGeoResponse build() {
            PhotoByGeoResponse photoByGeoResponse = new PhotoByGeoResponse();
            photoByGeoResponse.taskTimeout = this.taskTimeout;
            photoByGeoResponse.lon = this.lon;
            photoByGeoResponse.timeout = this.timeout;
            photoByGeoResponse.delayed = this.delayed;
            photoByGeoResponse.distance = this.distance;
            photoByGeoResponse.limit = this.limit;
            photoByGeoResponse.taskId = this.taskId;
            photoByGeoResponse.type = this.type;
            photoByGeoResponse.lat = this.lat;
            return photoByGeoResponse;
        }
    }

    @Override
    public String toString() {
        return "PhotoByGeoResponse{" +
                "lat=" + lat +
                ", lon=" + lon +
                ", distance=" + distance +
                ", limit=" + limit +
                ", timeout=" + timeout +
                ", delayed=" + delayed +
                ", taskId=" + taskId +
                ", taskTimeout=" + taskTimeout +
                ", type='" + type + '\'' +
                '}';
    }
}
