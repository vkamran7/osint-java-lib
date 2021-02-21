package model.facebook.user.request;

public class MutualFriendsByUserIDRequest {
    private Long id1; // Facebook User ID#1
    private Long id2; // Facebook User ID#2
    private Integer limit; // User List limit


    public static final class Builder {
        private Long id1; // Facebook User ID#1
        private Long id2; // Facebook User ID#2
        private Integer limit; // User List limit

        public Builder() {
        }

        public static Builder aMutualFriendsByUserIDRequest() {
            return new Builder();
        }

        public Builder withId1(Long id1) {
            this.id1 = id1;
            return this;
        }

        public Builder withId2(Long id2) {
            this.id2 = id2;
            return this;
        }

        public Builder withLimit(Integer limit) {
            this.limit = limit;
            return this;
        }

        public MutualFriendsByUserIDRequest build() {
            MutualFriendsByUserIDRequest mutualFriendsByUserIDRequest = new MutualFriendsByUserIDRequest();
            mutualFriendsByUserIDRequest.id1 = this.id1;
            mutualFriendsByUserIDRequest.limit = this.limit;
            mutualFriendsByUserIDRequest.id2 = this.id2;
            return mutualFriendsByUserIDRequest;
        }
    }
}
