package model.facebook.graph.request;

public class PhotoProfilePostGraphSearchRequest {

    private String query;
    private Integer limit;
    private String type;
    private Integer timeout;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getType() {
        return type;
    }

    public Integer getTimeout() {
        return timeout;
    }


    public static final class Builder {
        private String query;
        private Integer limit;
        private String type;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aPhotoProfilePostGraphSearchRequest() {
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

        public Builder withType(String type) {
            this.type = type;
            return this;
        }

        public Builder withTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public PhotoProfilePostGraphSearchRequest build() {
            PhotoProfilePostGraphSearchRequest photoProfilePostGraphSearchRequest = new PhotoProfilePostGraphSearchRequest();
            photoProfilePostGraphSearchRequest.query = this.query;
            photoProfilePostGraphSearchRequest.limit = this.limit;
            photoProfilePostGraphSearchRequest.timeout = this.timeout;
            photoProfilePostGraphSearchRequest.type = this.type;
            return photoProfilePostGraphSearchRequest;
        }
    }
}
