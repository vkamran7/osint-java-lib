package model.facebook.post_reaction_place.request;

public class UserPostsByUserIDDelayedRequest {
    private String query;
    private Integer limit;
    private Integer taskID;
    private Integer timeout;


    public static final class Builder {
        private String query;
        private Integer limit;
        private Integer taskID;
        private Integer timeout;

        public Builder() {
        }

        public static Builder anUserPostsByUserIDDelayedRequest() {
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

        public Builder withTaskID(Integer taskID) {
            this.taskID = taskID;
            return this;
        }

        public Builder withTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public UserPostsByUserIDDelayedRequest build() {
            UserPostsByUserIDDelayedRequest userPostsByUserIDDelayedRequest = new UserPostsByUserIDDelayedRequest();
            userPostsByUserIDDelayedRequest.taskID = this.taskID;
            userPostsByUserIDDelayedRequest.query = this.query;
            userPostsByUserIDDelayedRequest.limit = this.limit;
            userPostsByUserIDDelayedRequest.timeout = this.timeout;
            return userPostsByUserIDDelayedRequest;
        }
    }
}
