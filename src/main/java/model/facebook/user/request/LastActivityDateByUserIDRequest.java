package model.facebook.user.request;

public class LastActivityDateByUserIDRequest {
    private String query; // facebook user id
    private Integer timeout;

    public String getQuery() {
        return query;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public static final class Builder {
        private String query; // facebook user id
        private Integer timeout;

        public Builder() {
        }

        public static Builder aLastActivityDateByUserIDRequest() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder withTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public LastActivityDateByUserIDRequest build() {
            LastActivityDateByUserIDRequest lastActivityDateByUserIDRequest = new LastActivityDateByUserIDRequest();
            lastActivityDateByUserIDRequest.timeout = this.timeout;
            lastActivityDateByUserIDRequest.query = this.query;
            return lastActivityDateByUserIDRequest;
        }
    }
}
