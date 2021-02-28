package model.facebook.group.request;

public class GroupMembersByGroupIDRequest {
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

        public static Builder aGroupMembersByGroupIDRequest() {
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

        public GroupMembersByGroupIDRequest build() {
            GroupMembersByGroupIDRequest groupMembersByGroupIDRequest = new GroupMembersByGroupIDRequest();
            groupMembersByGroupIDRequest.timeout = this.timeout;
            groupMembersByGroupIDRequest.query = this.query;
            groupMembersByGroupIDRequest.limit = this.limit;
            return groupMembersByGroupIDRequest;
        }
    }
}
