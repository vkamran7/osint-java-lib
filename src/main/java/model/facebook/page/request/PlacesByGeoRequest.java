package model.facebook.page.request;

public class PlacesByGeoRequest {
    private Double lat;
    private Double lon;
    private Integer distance;
    private Integer limit;

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

    public static final class Builder {
        private Double lat;
        private Double lon;
        private Integer distance;
        private Integer limit;

        public Builder() {
        }

        public static Builder aPlacesByGeoRequest() {
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

        public Builder withDistance(Integer distance) {
            this.distance = distance;
            return this;
        }

        public Builder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public PlacesByGeoRequest build() {
            PlacesByGeoRequest placesByGeoRequest = new PlacesByGeoRequest();
            placesByGeoRequest.distance = this.distance;
            placesByGeoRequest.limit = this.limit;
            placesByGeoRequest.lat = this.lat;
            placesByGeoRequest.lon = this.lon;
            return placesByGeoRequest;
        }
    }
}
