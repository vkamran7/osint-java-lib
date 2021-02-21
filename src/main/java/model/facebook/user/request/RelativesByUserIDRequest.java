package model.facebook.user.request;

public class RelativesByUserIDRequest {
    private String query; // Facebook User ID
    private Integer limit;
    private Integer timeout;


    public static final class Builder {
        private String query; // Facebook User ID
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aRelativesByUserIDRequest() {
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

        public RelativesByUserIDRequest build() {
            RelativesByUserIDRequest relativesByUserIDRequest = new RelativesByUserIDRequest();
            relativesByUserIDRequest.query = this.query;
            relativesByUserIDRequest.timeout = this.timeout;
            relativesByUserIDRequest.limit = this.limit;
            return relativesByUserIDRequest;
        }
    }
}
