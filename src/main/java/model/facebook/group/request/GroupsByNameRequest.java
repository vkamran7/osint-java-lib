package model.facebook.group.request;

public class GroupsByNameRequest {
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

        public static Builder aGroupsByNameRequest() {
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

        public GroupsByNameRequest build() {
            GroupsByNameRequest groupsByNameRequest = new GroupsByNameRequest();
            groupsByNameRequest.limit = this.limit;
            groupsByNameRequest.timeout = this.timeout;
            groupsByNameRequest.query = this.query;
            return groupsByNameRequest;
        }
    }
}
