package model.facebook.group.request;

public class GroupDetailsByGroupIDRequest {
    private String query;
    private Integer limit;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }


    public static final class Builder {
        private String query;
        private Integer limit;

        public Builder() {
        }

        public static Builder aGroupDetailsByGroupIDRequest() {
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

        public GroupDetailsByGroupIDRequest build() {
            GroupDetailsByGroupIDRequest groupDetailsByGroupIDRequest = new GroupDetailsByGroupIDRequest();
            groupDetailsByGroupIDRequest.limit = this.limit;
            groupDetailsByGroupIDRequest.query = this.query;
            return groupDetailsByGroupIDRequest;
        }
    }
}
