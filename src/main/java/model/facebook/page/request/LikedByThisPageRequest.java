package model.facebook.page.request;

public class LikedByThisPageRequest {
    private String query; // Facebook Page ID
    private Integer limit;
    private Integer timeout;


    public static final class Builder {
        private String query; // Facebook Page ID
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aLikedByThisPageRequest() {
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

        public LikedByThisPageRequest build() {
            LikedByThisPageRequest likedByThisPageRequest = new LikedByThisPageRequest();
            likedByThisPageRequest.timeout = this.timeout;
            likedByThisPageRequest.query = this.query;
            likedByThisPageRequest.limit = this.limit;
            return likedByThisPageRequest;
        }
    }
}
