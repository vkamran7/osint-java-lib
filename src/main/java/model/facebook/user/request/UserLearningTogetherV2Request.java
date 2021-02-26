package model.facebook.user.request;

public class UserLearningTogetherV2Request {
    private String query;  // Facebook User ID
    private Integer limit;
    private Integer timeout;
    private Integer delayed;
    private Integer taskTimeout;
    private Integer taskId;

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

    public Integer getTaskId() {
        return taskId;
    }

    public static final class Builder {
        private String query;  // Facebook User ID
        private Integer limit;
        private Integer timeout;
        private Integer delayed;
        private Integer taskTimeout;
        private Integer taskId;

        public Builder() {
        }

        public static Builder anUserLearningTogetherV2Request() {
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

        public Builder withTaskId(Integer taskId) {
            this.taskId = taskId;
            return this;
        }

        public UserLearningTogetherV2Request build() {
            UserLearningTogetherV2Request userLearningTogetherV2Request = new UserLearningTogetherV2Request();
            userLearningTogetherV2Request.taskId = this.taskId;
            userLearningTogetherV2Request.delayed = this.delayed;
            userLearningTogetherV2Request.taskTimeout = this.taskTimeout;
            userLearningTogetherV2Request.timeout = this.timeout;
            userLearningTogetherV2Request.limit = this.limit;
            userLearningTogetherV2Request.query = this.query;
            return userLearningTogetherV2Request;
        }
    }
}
