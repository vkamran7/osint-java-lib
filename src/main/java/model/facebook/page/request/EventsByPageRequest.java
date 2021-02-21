package model.facebook.page.request;

public class EventsByPageRequest {
    private String query; // Facebook Page ID
    private String type;
    private Integer limit;
    private Integer timeout;


    public static final class Builder {
        private String query; // Facebook Page ID
        private String type;
        private Integer limit;
        private Integer timeout;

        public Builder() {
        }

        public static Builder anEventsByPageRequest() {
            return new Builder();
        }

        public Builder withQuery(String query) {
            this.query = query;
            return this;
        }

        public Builder withType(String type) {
            this.type = type;
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

        public EventsByPageRequest build() {
            EventsByPageRequest eventsByPageRequest = new EventsByPageRequest();
            eventsByPageRequest.limit = this.limit;
            eventsByPageRequest.timeout = this.timeout;
            eventsByPageRequest.query = this.query;
            eventsByPageRequest.type = this.type;
            return eventsByPageRequest;
        }
    }
}
