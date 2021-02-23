package model.facebook.page.request;

public class PlacesByNameRequest {
    private String query;
    private Integer limit;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }

    public static final class Builder {
        private String query;
        private Integer limit;

        public Builder() {
        }

        public static Builder aPlacesByNameRequest() {
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

        public PlacesByNameRequest build() {
            PlacesByNameRequest placesByNameRequest = new PlacesByNameRequest();
            placesByNameRequest.query = this.query;
            placesByNameRequest.limit = this.limit;
            return placesByNameRequest;
        }
    }
}
