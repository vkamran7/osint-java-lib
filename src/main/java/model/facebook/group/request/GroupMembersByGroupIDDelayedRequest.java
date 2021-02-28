package model.facebook.group.request;

public class GroupMembersByGroupIDDelayedRequest {
    private String query;
    private Integer limit;
    private Integer timeout;
    private Integer taskID;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public Integer getTaskID() {
        return taskID;
    }


    public static final class Builder {
        private String query;
        private Integer limit;
        private Integer timeout;
        private Integer taskID;

        public Builder() {
        }

        public static Builder aGroupMembersByGroupIDDelayedRequest() {
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

        public Builder withTaskID(Integer taskID) {
            this.taskID = taskID;
            return this;
        }

        public GroupMembersByGroupIDDelayedRequest build() {
            GroupMembersByGroupIDDelayedRequest groupMembersByGroupIDDelayedRequest = new GroupMembersByGroupIDDelayedRequest();
            groupMembersByGroupIDDelayedRequest.taskID = this.taskID;
            groupMembersByGroupIDDelayedRequest.timeout = this.timeout;
            groupMembersByGroupIDDelayedRequest.limit = this.limit;
            groupMembersByGroupIDDelayedRequest.query = this.query;
            return groupMembersByGroupIDDelayedRequest;
        }
    }
}
