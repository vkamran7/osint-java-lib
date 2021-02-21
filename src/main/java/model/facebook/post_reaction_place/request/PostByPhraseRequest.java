package model.facebook.post_reaction_place.request;

public class PostByPhraseRequest {
    private String query;
    private Integer limit;
    private String location;
    private String date;
    private Integer timeout;


    public static final class Builder {
        private String query;
        private Integer limit;
        private String location;
        private String date;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aPostByPhraseRequest() {
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

        public Builder withLocation(String location) {
            this.location = location;
            return this;
        }

        public Builder withDate(String date) {
            this.date = date;
            return this;
        }

        public Builder withTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public PostByPhraseRequest build() {
            PostByPhraseRequest postByPhraseRequest = new PostByPhraseRequest();
            postByPhraseRequest.limit = this.limit;
            postByPhraseRequest.location = this.location;
            postByPhraseRequest.timeout = this.timeout;
            postByPhraseRequest.date = this.date;
            postByPhraseRequest.query = this.query;
            return postByPhraseRequest;
        }
    }
}
