package model.facebook.video;

public class FacebookVideoV2Request {
    private String query;
    private Integer limit;
    private String location;
    private String date;
    private String timeout;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public String getTimeout() {
        return timeout;
    }

    public static class Builder {

        private String query;
        private Integer limit;
        private String location;
        private String date;
        private String timeout;

        public Builder() {
        }

        Builder(String query, Integer limit, String location, String date, String timeout) {
            this.query = query;
            this.limit = limit;
            this.location = location;
            this.date = date;
            this.timeout = timeout;
        }

        public Builder query(String query){
            this.query = query;
            return Builder.this;
        }

        public Builder limit(Integer limit){
            this.limit = limit;
            return Builder.this;
        }

        public Builder location(String location){
            this.location = location;
            return Builder.this;
        }

        public Builder date(String date){
            this.date = date;
            return Builder.this;
        }

        public Builder timeout(String timeout){
            this.timeout = timeout;
            return Builder.this;
        }

        public FacebookVideoV2Request build() {
            if(this.query == null){
                throw new NullPointerException("The property \"query\" is null. "
                        + "Please set the value by \"query()\". "
                        + "The properties \"query\", \"limit\" are required.");
            }
            if(this.limit == null){
                throw new NullPointerException("The property \"limit\" is null. "
                        + "Please set the value by \"limit()\". "
                        + "The properties \"query\", \"limit\" are required.");
            }

            return new FacebookVideoV2Request(this);
        }
    }

    private FacebookVideoV2Request(Builder builder) {
        this.query = builder.query;
        this.limit = builder.limit;
        this.location = builder.location;
        this.date = builder.date;
        this.timeout = builder.timeout;
    }

    public void doSomething() {
        // do something
    }
}
