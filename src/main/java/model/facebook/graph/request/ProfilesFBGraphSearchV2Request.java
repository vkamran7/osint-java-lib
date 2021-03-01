package model.facebook.graph.request;

public class ProfilesFBGraphSearchV2Request {
    private String query;
    private String type;
    private Integer timeout;
    private Integer limit;
    private Integer delayed;
    private Integer taskTimeout;
    private Integer taskID;

    public String getQuery() {
        return query;
    }

    public String getType() {
        return type;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getDelayed() {
        return delayed;
    }

    public Integer getTaskTimeout() {
        return taskTimeout;
    }

    public Integer getTaskID() {
        return taskID;
    }


    public static final class Builder {
        private String query;
        private String type;
        private Integer timeout;
        private Integer limit;
        private Integer delayed;
        private Integer taskTimeout;
        private Integer taskID;

        public Builder() {
        }

        public static Builder aProfilesFBGraphSearchV2Request() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
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

        public Builder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder withDelayed(Integer delayed) {
            this.delayed = delayed;
            return this;
        }

        public Builder withTaskTimeout(Integer taskTimeout) {
            this.taskTimeout = taskTimeout;
            return this;
        }

        public Builder withTaskID(Integer taskID) {
            this.taskID = taskID;
            return this;
        }

        public ProfilesFBGraphSearchV2Request build() {
            ProfilesFBGraphSearchV2Request profilesFBGraphSearchV2Request = new ProfilesFBGraphSearchV2Request();
            profilesFBGraphSearchV2Request.taskID = this.taskID;
            profilesFBGraphSearchV2Request.delayed = this.delayed;
            profilesFBGraphSearchV2Request.timeout = this.timeout;
            profilesFBGraphSearchV2Request.limit = this.limit;
            profilesFBGraphSearchV2Request.taskTimeout = this.taskTimeout;
            profilesFBGraphSearchV2Request.type = this.type;
            profilesFBGraphSearchV2Request.query = this.query;
            return profilesFBGraphSearchV2Request;
        }
    }
}
