package model.facebook.page.request;

public class PagePostsByIDRequest {
    private Long id; // Facebook Page ID
    private Integer limit;
    private Integer timeout;


    public static final class Builder {
        private Long id; // Facebook Page ID
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder aPagePostsByIDRequest() {
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

        public Builder withTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public PagePostsByIDRequest build() {
            PagePostsByIDRequest pagePostsByIDRequest = new PagePostsByIDRequest();
            pagePostsByIDRequest.limit = this.limit;
            pagePostsByIDRequest.timeout = this.timeout;
            pagePostsByIDRequest.id = this.id;
            return pagePostsByIDRequest;
        }
    }
}
