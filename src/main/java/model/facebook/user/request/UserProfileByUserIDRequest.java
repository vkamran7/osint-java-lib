package model.facebook.user.request;

public class UserProfileByUserIDRequest {
    private String query; // Facebook User ID

    public String getQuery() {
        return query;
    }

    public static final class Builder {
        private String query; // Facebook User ID

        public Builder() {
        }

        public static Builder anUserProfileByUserIDRequest() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public UserProfileByUserIDRequest build() {
            UserProfileByUserIDRequest userProfileByUserIDRequest = new UserProfileByUserIDRequest();
            userProfileByUserIDRequest.query = this.query;
            return userProfileByUserIDRequest;
        }
    }
}
