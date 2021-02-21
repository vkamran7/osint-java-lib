package model.facebook.photo.request;

public class PhotosByAlbumRequest {
    private String query;
    private Integer limit;


    public static final class Builder {
        private String query;
        private Integer limit;

        public Builder() {
        }

        public static Builder aPhotosByAlbumRequest() {
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

        public PhotosByAlbumRequest build() {
            PhotosByAlbumRequest photosByAlbumRequest = new PhotosByAlbumRequest();
            photosByAlbumRequest.limit = this.limit;
            photosByAlbumRequest.query = this.query;
            return photosByAlbumRequest;
        }
    }
}
