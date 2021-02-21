package model.facebook.user.request;

public class ConvertToFoursquareEntitiesRequest {
    private String query; // facebook user id


    public static final class Builder {
        private String query; // facebook user id

        public Builder() {
        }

        public static Builder aConvertToFoursquareEntitiesRequest() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public ConvertToFoursquareEntitiesRequest build() {
            ConvertToFoursquareEntitiesRequest convertToFoursquareEntitiesRequest = new ConvertToFoursquareEntitiesRequest();
            convertToFoursquareEntitiesRequest.query = this.query;
            return convertToFoursquareEntitiesRequest;
        }
    }
}
