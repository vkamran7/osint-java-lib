package model.facebook.page.request;

public class PlacesInByPageRequest {
    private String query; // Facebook Page ID
    private Integer limit;
    private Integer timeout;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public static final class Builder {
        private String query; // Facebook Page ID
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aPlacesInByPageRequest() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
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

        public PlacesInByPageRequest build() {
            PlacesInByPageRequest placesInByPageRequest = new PlacesInByPageRequest();
            placesInByPageRequest.limit = this.limit;
            placesInByPageRequest.timeout = this.timeout;
            placesInByPageRequest.query = this.query;
            return placesInByPageRequest;
        }
    }
}
