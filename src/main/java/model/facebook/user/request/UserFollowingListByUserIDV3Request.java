package model.facebook.user.request;

public class UserFollowingListByUserIDV3Request {
    private String query; // Facebook User ID
    private Integer limit;
    private Integer timeout;


    public static final class Builder {
        private String query; // Facebook User ID
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder anUserFollowingListByUserIDV3Request() {
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

        public UserFollowingListByUserIDV3Request build() {
            UserFollowingListByUserIDV3Request userFollowingListByUserIDV3Request = new UserFollowingListByUserIDV3Request();
            userFollowingListByUserIDV3Request.timeout = this.timeout;
            userFollowingListByUserIDV3Request.query = this.query;
            userFollowingListByUserIDV3Request.limit = this.limit;
            return userFollowingListByUserIDV3Request;
        }
    }
}
