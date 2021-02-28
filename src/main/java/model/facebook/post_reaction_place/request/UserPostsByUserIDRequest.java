package model.facebook.post_reaction_place.request;

public class UserPostsByUserIDRequest {
    private String query; // Facebook User ID
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
        private String query; // Facebook User ID
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder anUserPostsByUserIDRequest() {
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

        public UserPostsByUserIDRequest build() {
            UserPostsByUserIDRequest userPostsByUserIDRequest = new UserPostsByUserIDRequest();
            userPostsByUserIDRequest.timeout = this.timeout;
            userPostsByUserIDRequest.limit = this.limit;
            userPostsByUserIDRequest.query = this.query;
            return userPostsByUserIDRequest;
        }
    }
}
