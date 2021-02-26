package model.facebook.user.request;

public class UserIDByProfileURLRequest {
    private String url;  // Facebook Profile URL

    public String getUrl() {
        return url;
    }

    public static final class Builder {
        private String url;  // Facebook Profile URL

        public Builder() {
        }

        public static Builder anUserIDByProfileURLRequest() {
            return new Builder();
        }

        public Builder withUrl(String url) {
            this.url = url;
            return this;
        }

        public UserIDByProfileURLRequest build() {
            UserIDByProfileURLRequest userIDByProfileURLRequest = new UserIDByProfileURLRequest();
            userIDByProfileURLRequest.url = this.url;
            return userIDByProfileURLRequest;
        }
    }
}
