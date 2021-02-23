package model.facebook.page.request;

public class PagesByNameRequest {
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

        public static Builder aPagesByNameRequest() {
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

        public PagesByNameRequest build() {
            PagesByNameRequest pagesByNameRequest = new PagesByNameRequest();
            pagesByNameRequest.query = this.query;
            pagesByNameRequest.timeout = this.timeout;
            pagesByNameRequest.limit = this.limit;
            return pagesByNameRequest;
        }
    }
}
