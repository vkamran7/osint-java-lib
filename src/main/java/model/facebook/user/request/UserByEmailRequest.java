package model.facebook.user.request;

public class UserByEmailRequest {
    private String query; // email

    public String getQuery() {
        return query;
    }

    public static final class Builder {
        private String query; // email

        public Builder() {
        }

        public static Builder anUserByEmailRequest() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public UserByEmailRequest build() {
            UserByEmailRequest userByEmailRequest = new UserByEmailRequest();
            userByEmailRequest.query = this.query;
            return userByEmailRequest;
        }
    }
}
