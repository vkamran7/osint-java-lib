package model.facebook.post_reaction_place.request;

public class ReactionsRequest {
    private Long id;
    private Integer limit;
    private Integer isComment;

    public Long getId() {
        return id;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getIsComment() {
        return isComment;
    }

    public static final class Builder {
        private Long id;
        private Integer limit;
        private Integer isComment;

        public Builder() {
        }

        public static Builder aReactionsRequest() {
            return new Builder();
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder withIsComment(Integer isComment) {
            this.isComment = isComment;
            return this;
        }

        public ReactionsRequest build() {
            ReactionsRequest reactionsRequest = new ReactionsRequest();
            reactionsRequest.isComment = this.isComment;
            reactionsRequest.limit = this.limit;
            reactionsRequest.id = this.id;
            return reactionsRequest;
        }
    }
}
