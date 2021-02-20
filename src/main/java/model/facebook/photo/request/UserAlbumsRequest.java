package model.facebook.photo.request;

public class UserAlbumsRequest {
    private String id;

    public String getId() {
        return id;
    }

    public static final class Builder {
        private String id;

        public Builder() {
        }

        public static Builder anUserAlbumsRequest() {
            return new Builder();
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public UserAlbumsRequest build() {
            UserAlbumsRequest userAlbumsRequest = new UserAlbumsRequest();
            userAlbumsRequest.id = this.id;
            return userAlbumsRequest;
        }
    }
}
