package model.facebook.graph.request;

public class PhotoPostFBGraphSearchByDateRequest {
    private String query;
    private String type;
    private String dateFrom;
    private String dateTo;
    private Integer timeout;
    private Integer limit;
    private Integer delayed;
    private Integer taskID;
    private Integer taskTimeout;

    public String getQuery() {
        return query;
    }

    public String getType() {
        return type;
    }

    public String getDateFrom() {
        return dateFrom;
    }

    public String getDateTo() {
        return dateTo;
    }

    public Integer getTimeout() {
        return timeout;
    }

    public Integer getLimit() {
        return limit;
    }

    public Integer getDelayed() {
        return delayed;
    }

    public Integer getTaskID() {
        return taskID;
    }

    public Integer getTaskTimeout() {
        return taskTimeout;
    }


    public static final class Builder {
        private String query;
        private String type;
        private String dateFrom;
        private String dateTo;
        private Integer timeout;
        private Integer limit;
        private Integer delayed;
        private Integer taskID;
        private Integer taskTimeout;

        public Builder() {
        }

        public static Builder aPhotoPostFBGraphSearchByDateRequest() {
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

        public Builder withDateFrom(String dateFrom) {
            this.dateFrom = dateFrom;
            return this;
        }

        public Builder withDateTo(String dateTo) {
            this.dateTo = dateTo;
            return this;
        }

        public Builder withTimeout(Integer timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public Builder withDelayed(Integer delayed) {
            this.delayed = delayed;
            return this;
        }

        public Builder withTaskID(Integer taskID) {
            this.taskID = taskID;
            return this;
        }

        public Builder withTaskTimeout(Integer taskTimeout) {
            this.taskTimeout = taskTimeout;
            return this;
        }

        public PhotoPostFBGraphSearchByDateRequest build() {
            PhotoPostFBGraphSearchByDateRequest photoPostFBGraphSearchByDateRequest = new PhotoPostFBGraphSearchByDateRequest();
            photoPostFBGraphSearchByDateRequest.dateFrom = this.dateFrom;
            photoPostFBGraphSearchByDateRequest.query = this.query;
            photoPostFBGraphSearchByDateRequest.type = this.type;
            photoPostFBGraphSearchByDateRequest.limit = this.limit;
            photoPostFBGraphSearchByDateRequest.dateTo = this.dateTo;
            photoPostFBGraphSearchByDateRequest.timeout = this.timeout;
            photoPostFBGraphSearchByDateRequest.taskID = this.taskID;
            photoPostFBGraphSearchByDateRequest.taskTimeout = this.taskTimeout;
            photoPostFBGraphSearchByDateRequest.delayed = this.delayed;
            return photoPostFBGraphSearchByDateRequest;
        }
    }
}
