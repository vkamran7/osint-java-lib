package model.facebook.page.request;

public class RelatedPagesByPageRequest {
    private String query; // Facebook Page ID;
    private Integer limit;

    public String getQuery() {
        return query;
    }

    public Integer getLimit() {
        return limit;
    }

    public static final class Builder {
        private String query; // Facebook Page ID;
        private Integer limit;

        public Builder() {
        }

        public static Builder aRelatedPagesByPageRequest() {
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

        public RelatedPagesByPageRequest build() {
            RelatedPagesByPageRequest relatedPagesByPageRequest = new RelatedPagesByPageRequest();
            relatedPagesByPageRequest.limit = this.limit;
            relatedPagesByPageRequest.query = this.query;
            return relatedPagesByPageRequest;
        }
    }
}
