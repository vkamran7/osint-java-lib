package model.facebook.page.request;

public class EventsByNameRequest {
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

        public static Builder anEventsByNameRequest() {
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

        public EventsByNameRequest build() {
            EventsByNameRequest eventsByNameRequest = new EventsByNameRequest();
            eventsByNameRequest.limit = this.limit;
            eventsByNameRequest.timeout = this.timeout;
            eventsByNameRequest.query = this.query;
            return eventsByNameRequest;
        }
    }
}
