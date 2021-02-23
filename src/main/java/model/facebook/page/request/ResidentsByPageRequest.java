package model.facebook.page.request;

public class ResidentsByPageRequest {
    private String query; // Facebook Page ID
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
        private String query; // Facebook Page ID
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aResidentsByPageRequest() {
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

        public ResidentsByPageRequest build() {
            ResidentsByPageRequest residentsByPageRequest = new ResidentsByPageRequest();
            residentsByPageRequest.query = this.query;
            residentsByPageRequest.limit = this.limit;
            residentsByPageRequest.timeout = this.timeout;
            return residentsByPageRequest;
        }
    }
}
