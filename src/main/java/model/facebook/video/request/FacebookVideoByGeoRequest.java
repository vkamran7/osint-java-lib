package model.facebook.video.request;

public class FacebookVideoByGeoRequest {
    private Double lat;
    private Double lon;
    private Integer distance;
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

    public Integer getDistance() {
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

    public static class Builder {

        private Double lat;
        private Double lon;
        private Integer distance;
        private Integer limit;
        private Integer timeout;
        private Integer delayed;
        private Integer taskId;
        private Integer taskTimeout;
        private String type;

        public Builder() {
        }

        Builder(Double lat, Double lon, Integer distance, Integer limit, Integer timeout, Integer delayed, Integer taskId, Integer taskTimeout, String type) {
            this.lat = lat;
            this.lon = lon;
            this.distance = distance;
            this.limit = limit;
            this.timeout = timeout;
            this.delayed = delayed;
            this.taskId = taskId;
            this.taskTimeout = taskTimeout;
            this.type = type;
        }

        public Builder lat(Double lat){
            this.lat = lat;
            return Builder.this;
        }

        public Builder lon(Double lon){
            this.lon = lon;
            return Builder.this;
        }

        public Builder distance(Integer distance){
            this.distance = distance;
            return Builder.this;
        }

        public Builder limit(Integer limit){
            this.limit = limit;
            return Builder.this;
        }

        public Builder timeout(Integer timeout){
            this.timeout = timeout;
            return Builder.this;
        }

        public Builder delayed(Integer delayed){
            this.delayed = delayed;
            return Builder.this;
        }

        public Builder taskId(Integer taskId){
            this.taskId = taskId;
            return Builder.this;
        }

        public Builder taskTimeout(Integer taskTimeout){
            this.taskTimeout = taskTimeout;
            return Builder.this;
        }

        public Builder type(String type){
            this.type = type;
            return Builder.this;
        }

        public FacebookVideoByGeoRequest build() {
            if(this.lat == null){
                throw new NullPointerException("The property \"lat\" is null. "
                        + "Please set the value by \"lat()\". "
                        + "The properties \"lat\", \"lon\" and \"type\" are required.");
            }
            if(this.lon == null){
                throw new NullPointerException("The property \"lon\" is null. "
                        + "Please set the value by \"lon()\". "
                        + "The properties \"lat\", \"lon\" and \"type\" are required.");
            }
            if(this.type == null){
                throw new NullPointerException("The property \"type\" is null. "
                        + "Please set the value by \"type()\". "
                        + "The properties \"lat\", \"lon\" and \"type\" are required.");
            }

            return new FacebookVideoByGeoRequest(this);
        }
    }

    private FacebookVideoByGeoRequest(Builder builder) {
        this.lat = builder.lat;
        this.lon = builder.lon;
        this.distance = builder.distance;
        this.limit = builder.limit;
        this.timeout = builder.timeout;
        this.delayed = builder.delayed;
        this.taskId = builder.taskId;
        this.taskTimeout = builder.taskTimeout;
        this.type = builder.type;
    }

    public void doSomething() {
        // do something
    }

}
