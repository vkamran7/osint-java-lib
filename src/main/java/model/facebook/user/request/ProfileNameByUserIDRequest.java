package model.facebook.user.request;

public class ProfileNameByUserIDRequest {
    private String query;


    public static final class Builder {
        private String query;

        public Builder() {
        }

        public static Builder aProfileNameByUserIDRequest() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public ProfileNameByUserIDRequest build() {
            ProfileNameByUserIDRequest profileNameByUserIDRequest = new ProfileNameByUserIDRequest();
            profileNameByUserIDRequest.query = this.query;
            return profileNameByUserIDRequest;
        }
    }
}
