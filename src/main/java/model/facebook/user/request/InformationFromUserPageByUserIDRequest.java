package model.facebook.user.request;

public class InformationFromUserPageByUserIDRequest {
    private Long id;


    public static final class Builder {
        private Long id;

        public Builder() {
        }

        public static Builder anInformationFromUserPageByUserIDRequest() {
            return new Builder();
        }

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public InformationFromUserPageByUserIDRequest build() {
            InformationFromUserPageByUserIDRequest informationFromUserPageByUserIDRequest = new InformationFromUserPageByUserIDRequest();
            informationFromUserPageByUserIDRequest.id = this.id;
            return informationFromUserPageByUserIDRequest;
        }
    }
}
