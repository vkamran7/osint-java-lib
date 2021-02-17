package model.facebook.video.request;

public class FacebookVideoDetailsRequest {
    private int id;

    public static class Builder {
        private int id;

        public Builder() {

        }

        Builder(int id) {
            this.id = id;
        }

        public Builder id(int id) {
            this.id = id;
            return Builder.this;
        }

        public FacebookVideoDetailsRequest build() {
            return new FacebookVideoDetailsRequest(this);
        }
    }

    private FacebookVideoDetailsRequest(Builder builder) {
        this.id = builder.id;
    }
}
