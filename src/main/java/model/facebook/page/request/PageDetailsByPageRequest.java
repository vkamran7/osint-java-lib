package model.facebook.page.request;

public class PageDetailsByPageRequest {
    private String query; // Page ID

    public String getQuery() {
        return query;
    }

    public static final class Builder {
        private String query; // Page ID

        public Builder() {
        }

        public static Builder aPageDetailsByPageRequest() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public PageDetailsByPageRequest build() {
            PageDetailsByPageRequest pageDetailsByPageRequest = new PageDetailsByPageRequest();
            pageDetailsByPageRequest.query = this.query;
            return pageDetailsByPageRequest;
        }
    }
}
