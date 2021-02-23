package model.facebook.page.request;

public class PhotosByPageRequest {
    private String query; // Facebook Page ID
    private Integer limit;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }

    public static final class Builder {
        private String query;
        private Integer limit;

        public Builder() {
        }

        public static Builder aPhotosByPageRequest() {
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

        public PhotosByPageRequest build() {
            PhotosByPageRequest photosByPageRequest = new PhotosByPageRequest();
            photosByPageRequest.query = this.query;
            photosByPageRequest.limit = this.limit;
            return photosByPageRequest;
        }
    }
}
