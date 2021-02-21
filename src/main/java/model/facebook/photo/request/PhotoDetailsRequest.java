package model.facebook.photo.request;

public class PhotoDetailsRequest {
    private String id;


    public static final class Builder {
        private String id;

        public Builder() {
        }

        public static Builder aPhotoDetailsRequest() {
            return new Builder();
        }

        public Builder withId(String id) {
            this.id = id;
            return this;
        }

        public PhotoDetailsRequest build() {
            PhotoDetailsRequest photoDetailsRequest = new PhotoDetailsRequest();
            photoDetailsRequest.id = this.id;
            return photoDetailsRequest;
        }
    }
}
