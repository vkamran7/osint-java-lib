package model.facebook.user.request;

public class UserFriendsListByUserIDRequest {
    private String query; // Facebook User ID
    private Integer limit;


    public static final class Builder {
        private String query; // Facebook User ID
        private Integer limit;

        public Builder() {
        }

        public static Builder anUserFriendsListByUserIDRequest() {
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

        public UserFriendsListByUserIDRequest build() {
            UserFriendsListByUserIDRequest userFriendsListByUserIDRequest = new UserFriendsListByUserIDRequest();
            userFriendsListByUserIDRequest.query = this.query;
            userFriendsListByUserIDRequest.limit = this.limit;
            return userFriendsListByUserIDRequest;
        }
    }
}
