package model.facebook.post_reaction_place.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserPostsByUserIDResponse {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public static class Result {

        @SerializedName("post_id")
        @Expose
        private String postId;
        @SerializedName("photo_id")
        @Expose
        private String photoId;
        @SerializedName("album")
        @Expose
        private String album;
        @SerializedName("is_video")
        @Expose
        private String isVideo;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("image_descr")
        @Expose
        private String imageDescr;
        @SerializedName("author")
        @Expose
        private Author author;
        @SerializedName("publish_time")
        @Expose
        private Integer publishTime;
        @SerializedName("location")
        @Expose
        private Location location;
        @SerializedName("instagram_url")
        @Expose
        private String instagramUrl;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("post_content")
        @Expose
        private String postContent;
        @SerializedName("likes_count")
        @Expose
        private Integer likesCount;
        @SerializedName("comments_count")
        @Expose
        private Integer commentsCount;
        @SerializedName("shares_count")
        @Expose
        private Integer sharesCount;
        @SerializedName("comments")
        @Expose
        private List<Comment> comments = null;
        @SerializedName("sorry_count")
        @Expose
        private Integer sorryCount;
        @SerializedName("haha_count")
        @Expose
        private Integer hahaCount;
        @SerializedName("anger_count")
        @Expose
        private Integer angerCount;

        public String getPostId() {
            return postId;
        }

        public void setPostId(String postId) {
            this.postId = postId;
        }

        public String getPhotoId() {
            return photoId;
        }

        public void setPhotoId(String photoId) {
            this.photoId = photoId;
        }

        public String getAlbum() {
            return album;
        }

        public void setAlbum(String album) {
            this.album = album;
        }

        public String getIsVideo() {
            return isVideo;
        }

        public void setIsVideo(String isVideo) {
            this.isVideo = isVideo;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getImageDescr() {
            return imageDescr;
        }

        public void setImageDescr(String imageDescr) {
            this.imageDescr = imageDescr;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public Integer getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(Integer publishTime) {
            this.publishTime = publishTime;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getInstagramUrl() {
            return instagramUrl;
        }

        public void setInstagramUrl(String instagramUrl) {
            this.instagramUrl = instagramUrl;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public String getPostContent() {
            return postContent;
        }

        public void setPostContent(String postContent) {
            this.postContent = postContent;
        }

        public Integer getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
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

        public List<Comment> getComments() {
            return comments;
        }

        public void setComments(List<Comment> comments) {
            this.comments = comments;
        }

        public Integer getSorryCount() {
            return sorryCount;
        }

        public void setSorryCount(Integer sorryCount) {
            this.sorryCount = sorryCount;
        }

        public Integer getHahaCount() {
            return hahaCount;
        }

        public void setHahaCount(Integer hahaCount) {
            this.hahaCount = hahaCount;
        }

        public Integer getAngerCount() {
            return angerCount;
        }

        public void setAngerCount(Integer angerCount) {
            this.angerCount = angerCount;
        }

    }

    public static class Location {

    }

    public static class Author {

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

    public static class Author_ {

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

    public static class Comment {

        @SerializedName("comment_id")
        @Expose
        private String commentId;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("author")
        @Expose
        private Author_ author;
        @SerializedName("time")
        @Expose
        private Integer time;
        @SerializedName("is_female")
        @Expose
        private Boolean isFemale;
        @SerializedName("reactions_count")
        @Expose
        private Integer reactionsCount;
        @SerializedName("likes_count")
        @Expose
        private Integer likesCount;
        @SerializedName("replies_count")
        @Expose
        private Integer repliesCount;
        @SerializedName("entity")
        @Expose
        private List<Object> entity = null;

        public String getCommentId() {
            return commentId;
        }

        public void setCommentId(String commentId) {
            this.commentId = commentId;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Author_ getAuthor() {
            return author;
        }

        public void setAuthor(Author_ author) {
            this.author = author;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Boolean getIsFemale() {
            return isFemale;
        }

        public void setIsFemale(Boolean isFemale) {
            this.isFemale = isFemale;
        }

        public Integer getReactionsCount() {
            return reactionsCount;
        }

        public void setReactionsCount(Integer reactionsCount) {
            this.reactionsCount = reactionsCount;
        }

        public Integer getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
        }

        public Integer getRepliesCount() {
            return repliesCount;
        }

        public void setRepliesCount(Integer repliesCount) {
            this.repliesCount = repliesCount;
        }

        public List<Object> getEntity() {
            return entity;
        }

        public void setEntity(List<Object> entity) {
            this.entity = entity;
        }

    }
}
