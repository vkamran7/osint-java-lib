package model.facebook.page.request;

public class AlbumPhotosRequest {
    private String query;
    private Integer limit;
    private Integer timeout;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public static final class Builder {
        private String query;
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder anAlbumPhotosRequest() {
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

        public AlbumPhotosRequest build() {
            AlbumPhotosRequest albumPhotosRequest = new AlbumPhotosRequest();
            albumPhotosRequest.timeout = this.timeout;
            albumPhotosRequest.limit = this.limit;
            albumPhotosRequest.query = this.query;
            return albumPhotosRequest;
        }
    }
}
