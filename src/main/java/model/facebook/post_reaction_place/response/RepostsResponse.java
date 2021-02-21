package model.facebook.post_reaction_place.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class RepostsResponse {
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public static class PostAuthor {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public static class Result {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("post_id")
        @Expose
        private String postId;
        @SerializedName("original_post_id")
        @Expose
        private String originalPostId;
        @SerializedName("time")
        @Expose
        private Integer time;
        @SerializedName("comments_count")
        @Expose
        private Integer commentsCount;
        @SerializedName("shares_count")
        @Expose
        private Integer sharesCount;
        @SerializedName("likes_count")
        @Expose
        private Integer likesCount;
        @SerializedName("comments")
        @Expose
        private List<Object> comments = null;
        @SerializedName("post_author")
        @Expose
        private PostAuthor postAuthor;
        @SerializedName("photo")
        @Expose
        private String photo;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPostId() {
            return postId;
        }

        public void setPostId(String postId) {
            this.postId = postId;
        }

        public String getOriginalPostId() {
            return originalPostId;
        }

        public void setOriginalPostId(String originalPostId) {
            this.originalPostId = originalPostId;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Integer getCommentsCount() {
            return commentsCount;
        }

        public void setCommentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
        }

        public Integer getSharesCount() {
            return sharesCount;
        }

        public void setSharesCount(Integer sharesCount) {
            this.sharesCount = sharesCount;
        }

        public Integer getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
        }

        public List<Object> getComments() {
            return comments;
        }

        public void setComments(List<Object> comments) {
            this.comments = comments;
        }

        public PostAuthor getPostAuthor() {
            return postAuthor;
        }

        public void setPostAuthor(PostAuthor postAuthor) {
            this.postAuthor = postAuthor;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

    }
}
