package model.facebook.user.request;

public class UserCoWorkersByUserIDV2Request {
    private String query; // Facebook User ID
    private Integer limit;
    private Integer timeout;
    private Integer delayed;
    private Integer taskTimeout;
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
        private String query; // Facebook User ID
        private Integer limit;
        private Integer timeout;
        private Integer delayed;
        private Integer taskTimeout;
        private Integer taskID;

        public Builder() {
        }

        public static Builder anUserCoWorkersByUserIDV2Request() {
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

        public UserCoWorkersByUserIDV2Request build() {
            UserCoWorkersByUserIDV2Request userCoWorkersByUserIDV2Request = new UserCoWorkersByUserIDV2Request();
            userCoWorkersByUserIDV2Request.limit = this.limit;
            userCoWorkersByUserIDV2Request.taskTimeout = this.taskTimeout;
            userCoWorkersByUserIDV2Request.delayed = this.delayed;
            userCoWorkersByUserIDV2Request.taskID = this.taskID;
            userCoWorkersByUserIDV2Request.query = this.query;
            userCoWorkersByUserIDV2Request.timeout = this.timeout;
            return userCoWorkersByUserIDV2Request;
        }
    }
}
