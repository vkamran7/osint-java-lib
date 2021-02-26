package model.facebook.user.request;

public class UserLikesByUserIDRequest {
    private Long id1; // User ID
    private Long id2; // User ID2 - Fill if you looking for mutual user likes, otherwise empty
    private Integer limit;
    private Integer timeout;

    public Long getId1() {
        return id1;
    }

    public Long getId2() {
        return id2;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public static final class Builder {
        private Long id1; // User ID
        private Long id2; // User ID2 - Fill if you looking for mutual user likes, otherwise empty
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder anUserLikesByUserIDRequest() {
            return new Builder();
        }

        public Builder withId1(Long id1) {
            this.id1 = id1;
            return this;
        }

        public Builder withId2(Long id2) {
            this.id2 = id2;
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

        public UserLikesByUserIDRequest build() {
            UserLikesByUserIDRequest userLikesByUserIDRequest = new UserLikesByUserIDRequest();
            userLikesByUserIDRequest.id2 = this.id2;
            userLikesByUserIDRequest.timeout = this.timeout;
            userLikesByUserIDRequest.id1 = this.id1;
            userLikesByUserIDRequest.limit = this.limit;
            return userLikesByUserIDRequest;
        }
    }
}
