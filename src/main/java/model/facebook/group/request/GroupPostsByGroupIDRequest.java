package model.facebook.group.request;

public class GroupPostsByGroupIDRequest {
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

        public static Builder aGroupPostsByGroupIDRequest() {
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

        public GroupPostsByGroupIDRequest build() {
            GroupPostsByGroupIDRequest groupPostsByGroupIDRequest = new GroupPostsByGroupIDRequest();
            groupPostsByGroupIDRequest.limit = this.limit;
            groupPostsByGroupIDRequest.query = this.query;
            return groupPostsByGroupIDRequest;
        }
    }
}
