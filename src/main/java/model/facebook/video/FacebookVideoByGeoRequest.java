package model.facebook.video;

public class FacebookVideoByGeoRequest {

    private Double lat;
    private Double lon;
    private Double distance;
    private Integer limit;
    private String timeout;
    private String delayed;
    private String task_id;
    private String task_timeout;
    private String type;

    public static class Builder {

        private Double lat;
        private Double lon;
        private Double distance;
        private Integer limit;
        private String timeout;
        private String delayed;
        private String task_id;
        private String task_timeout;
        private String type;

        public Builder() {
        }

        Builder(Double lat, Double lon, Double distance, Integer limit, String timeout, String delayed, String task_id, String task_timeout, String type) {
            this.lat = lat;
            this.lon = lon;
            this.distance = distance;
            this.limit = limit;
            this.timeout = timeout;
            this.delayed = delayed;
            this.task_id = task_id;
            this.task_timeout = task_timeout;
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

        public Builder distance(Double distance){
            this.distance = distance;
            return Builder.this;
        }

        public Builder limit(Integer limit){
            this.limit = limit;
            return Builder.this;
        }

        public Builder timeout(String timeout){
            this.timeout = timeout;
            return Builder.this;
        }

        public Builder delayed(String delayed){
            this.delayed = delayed;
            return Builder.this;
        }

        public Builder task_id(String task_id){
            this.task_id = task_id;
            return Builder.this;
        }

        public Builder task_timeout(String task_timeout){
            this.task_timeout = task_timeout;
            return Builder.this;
        }

        public Builder type(String type){
            this.type = type;
            return Builder.this;
        }

        public FacebookVideoByGeoRequest build() {
            if(this.limit == null){
                throw new NullPointerException("The property \"limit\" is null. "
                        + "Please set the value by \"limit()\". "
                        + "The property \"limit\" is required.");
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
        this.task_id = builder.task_id;
        this.task_timeout = builder.task_timeout;
        this.type = builder.type;
    }

    public void doSomething() {
        // do something
    }

}
