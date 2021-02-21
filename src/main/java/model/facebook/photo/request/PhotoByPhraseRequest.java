package model.facebook.photo.request;

public class PhotoByPhraseRequest {
    private String query;
    private Integer limit;
    private String location;
    private String date;
    private Integer timeout;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public static final class Builder {
        private String query;
        private Integer limit;
        private String location;
        private String date;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aPhotoByPhraseRequest() {
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

        public PhotoByPhraseRequest build() {
            PhotoByPhraseRequest photoByPhraseRequest = new PhotoByPhraseRequest();
            photoByPhraseRequest.limit = this.limit;
            photoByPhraseRequest.date = this.date;
            photoByPhraseRequest.query = this.query;
            photoByPhraseRequest.location = this.location;
            photoByPhraseRequest.timeout = this.timeout;
            return photoByPhraseRequest;
        }
    }
}
