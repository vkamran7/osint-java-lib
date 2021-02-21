package model.facebook.user.request;

public class RelationsByUserIDRequest {
    private String query; // User ID
    private Integer limit;
    private Integer timeout;


    public static final class Builder {
        private String query; // User ID
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aRelationsByUserIDRequest() {
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

        public RelationsByUserIDRequest build() {
            RelationsByUserIDRequest relationsByUserIDRequest = new RelationsByUserIDRequest();
            relationsByUserIDRequest.query = this.query;
            relationsByUserIDRequest.limit = this.limit;
            relationsByUserIDRequest.timeout = this.timeout;
            return relationsByUserIDRequest;
        }
    }
}
