package model.facebook.post_reaction_place.request;

public class PostMediaRequest {
    private String query; // Post/Photo/Video ID
    private Long ownerID; // Owner of media
    private Long wallOwner;
    private Integer limit;

    public String getQuery() {
        return query;
    }

    public Long getOwnerID() {
        return ownerID;
    }

    public Long getWallOwner() {
        return wallOwner;
    }

    public Integer getLimit() {
        return limit;
    }

    public static final class Builder {
        private String query; // Post/Photo/Video ID
        private Long ownerID; // Owner of media
        private Long wallOwner;
        private Integer limit;

        public Builder() {
        }

        public static Builder aPostMediaRequest() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder withOwnerID(Long ownerID) {
            this.ownerID = ownerID;
            return this;
        }

        public Builder withWallOwner(Long wallOwner) {
            this.wallOwner = wallOwner;
            return this;
        }

        public Builder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public PostMediaRequest build() {
            PostMediaRequest postMediaRequest = new PostMediaRequest();
            postMediaRequest.wallOwner = this.wallOwner;
            postMediaRequest.query = this.query;
            postMediaRequest.ownerID = this.ownerID;
            postMediaRequest.limit = this.limit;
            return postMediaRequest;
        }
    }
}
