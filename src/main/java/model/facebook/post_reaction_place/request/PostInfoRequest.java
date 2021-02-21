package model.facebook.post_reaction_place.request;

public class PostInfoRequest {
    private Long ownerID; // Facebook User ID Owner
    private Long postID; // Facebook Post ID


    public static final class Builder {
        private Long ownerID; // Facebook User ID Owner
        private Long postID; // Facebook Post ID

        public Builder() {
        }

        public static Builder aPostInfoRequest() {
            return new Builder();
        }

        public Builder withOwnerID(Long ownerID) {
            this.ownerID = ownerID;
            return this;
        }

        public Builder withPostID(Long postID) {
            this.postID = postID;
            return this;
        }

        public PostInfoRequest build() {
            PostInfoRequest postInfoRequest = new PostInfoRequest();
            postInfoRequest.postID = this.postID;
            postInfoRequest.ownerID = this.ownerID;
            return postInfoRequest;
        }
    }
}
