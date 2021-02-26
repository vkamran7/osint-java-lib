package model.facebook.user.request;

public class UserIDByAliasRequest {
    private String alias; // User alias

    public String getAlias() {
        return alias;
    }

    public static final class Builder {
        private String alias; // User alias

        public Builder() {
        }

        public static Builder anUserIDByAliasRequest() {
            return new Builder();
        }

        public Builder withAlias(String alias) {
            this.alias = alias;
            return this;
        }

        public UserIDByAliasRequest build() {
            UserIDByAliasRequest userIDByAliasRequest = new UserIDByAliasRequest();
            userIDByAliasRequest.alias = this.alias;
            return userIDByAliasRequest;
        }
    }
}
