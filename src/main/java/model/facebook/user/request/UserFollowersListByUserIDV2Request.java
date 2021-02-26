package model.facebook.user.request;

public class UserFollowersListByUserIDV2Request {
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

        public static Builder anUserFollowersListByUserIDV2Request() {
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

        public UserFollowersListByUserIDV2Request build() {
            UserFollowersListByUserIDV2Request userFollowersListByUserIDV2Request = new UserFollowersListByUserIDV2Request();
            userFollowersListByUserIDV2Request.timeout = this.timeout;
            userFollowersListByUserIDV2Request.limit = this.limit;
            userFollowersListByUserIDV2Request.query = this.query;
            return userFollowersListByUserIDV2Request;
        }
    }
}
