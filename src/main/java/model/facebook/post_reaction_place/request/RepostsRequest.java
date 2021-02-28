package model.facebook.post_reaction_place.request;

public class RepostsRequest {
    private String query;
    private Integer timeout;
    private Integer limit;

    public String getQuery() {
        return query;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public Integer getLimit() {
        return limit;
    }

    public static final class Builder {
        private String query;
        private Integer timeout;
        private Integer limit;

        public Builder() {
        }

        public static Builder aRepostsRequest() {
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

        public Builder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public RepostsRequest build() {
            RepostsRequest repostsRequest = new RepostsRequest();
            repostsRequest.timeout = this.timeout;
            repostsRequest.limit = this.limit;
            repostsRequest.query = this.query;
            return repostsRequest;
        }
    }
}
