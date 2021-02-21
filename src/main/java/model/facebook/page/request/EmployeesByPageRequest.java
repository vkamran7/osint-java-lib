package model.facebook.page.request;

public class EmployeesByPageRequest {
    private String query; // Facebook User Id
    private Integer limit;
    private Integer timeout;


    public static final class Builder {
        private String query; // Facebook User Id
        private Integer limit;
        private Integer timeout;

        private Builder() {
        }

        public static Builder anEmployeesByPageRequest() {
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


        public EmployeesByPageRequest build() {
            EmployeesByPageRequest employeesByPageRequest = new EmployeesByPageRequest();
            employeesByPageRequest.query = this.query;
            employeesByPageRequest.limit = this.limit;
            employeesByPageRequest.timeout = this.timeout;
            return employeesByPageRequest;
        }
    }
}
