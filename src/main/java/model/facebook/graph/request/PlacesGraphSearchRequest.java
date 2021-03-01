package model.facebook.graph.request;

public class PlacesGraphSearchRequest {
    private String query;
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
        private String query;
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aGetPlacesGraphSearchRequest() {
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

        public PlacesGraphSearchRequest build() {
            PlacesGraphSearchRequest getPlacesGraphSearchRequest = new PlacesGraphSearchRequest();
            getPlacesGraphSearchRequest.limit = this.limit;
            getPlacesGraphSearchRequest.timeout = this.timeout;
            getPlacesGraphSearchRequest.query = this.query;
            return getPlacesGraphSearchRequest;
        }
    }
}
