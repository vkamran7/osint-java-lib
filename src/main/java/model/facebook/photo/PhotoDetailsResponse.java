package model.facebook.photo;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.facebook.Author;

import java.util.List;

public class PhotoDetailsResponse {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("post_id")
    @Expose
    private String postId;
    @SerializedName("album")
    @Expose
    private String album;
    @SerializedName("likes_count")
    @Expose
    private String likesCount;
    @SerializedName("comments_count")
    @Expose
    private String commentsCount;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("location")
    @Expose
    private List<Object> location = null;
    @SerializedName("image_url")
    @Expose
    private String imageUrl;
    @SerializedName("owner_id")
    @Expose
    private String ownerId;
    @SerializedName("owner_type")
    @Expose
    private String ownerType;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("instagram_url")
    @Expose
    private String instagramUrl;
    @SerializedName("with")
    @Expose
    private List<Object> with = null;
    @SerializedName("at")
    @Expose
    private List<Object> at = null;
    @SerializedName("in")
    @Expose
    private List<Object> in = null;
    @SerializedName("from")
    @Expose
    private List<Object> from = null;
    @SerializedName("drinking")
    @Expose
    private List<Object> drinking = null;
    @SerializedName("comments")
    @Expose
    private List<Comment> comments = null;
    @SerializedName("other_photos")
    @Expose
    private List<Object> otherPhotos = null;
    @SerializedName("published_in")
    @Expose
    private PublishedIn publishedIn;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(String likesCount) {
        this.likesCount = likesCount;
    }

    public String getCommentsCount() {
        return commentsCount;
    }

    public void setCommentsCount(String commentsCount) {
        this.commentsCount = commentsCount;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Object> getLocation() {
        return location;
    }

    public void setLocation(List<Object> location) {
        this.location = location;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(String instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public List<Object> getWith() {
        return with;
    }

    public void setWith(List<Object> with) {
        this.with = with;
    }

    public List<Object> getAt() {
        return at;
    }

    public void setAt(List<Object> at) {
        this.at = at;
    }

    public List<Object> getIn() {
        return in;
    }

    public void setIn(List<Object> in) {
        this.in = in;
    }

    public List<Object> getFrom() {
        return from;
    }

    public void setFrom(List<Object> from) {
        this.from = from;
    }

    public List<Object> getDrinking() {
        return drinking;
    }

    public void setDrinking(List<Object> drinking) {
        this.drinking = drinking;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<Object> getOtherPhotos() {
        return otherPhotos;
    }

    public void setOtherPhotos(List<Object> otherPhotos) {
        this.otherPhotos = otherPhotos;
    }

    public PublishedIn getPublishedIn() {
        return publishedIn;
    }

    public void setPublishedIn(PublishedIn publishedIn) {
        this.publishedIn = publishedIn;
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
        private Author author;
        @SerializedName("is_friend")
        @Expose
        private String isFriend;
        @SerializedName("time")
        @Expose
        private String time;
        @SerializedName("is_female")
        @Expose
        private String isFemale;
        @SerializedName("likes_count")
        @Expose
        private String likesCount;
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

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public String getIsFriend() {
            return isFriend;
        }

        public void setIsFriend(String isFriend) {
            this.isFriend = isFriend;
        }

        public String getTime() {
            return time;
        }

        public void setTime(String time) {
            this.time = time;
        }

        public String getIsFemale() {
            return isFemale;
        }

        public void setIsFemale(String isFemale) {
            this.isFemale = isFemale;
        }

        public String getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(String likesCount) {
            this.likesCount = likesCount;
        }

        public List<Object> getEntity() {
            return entity;
        }

        public void setEntity(List<Object> entity) {
            this.entity = entity;
        }

    }

    public static class PublishedIn {

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
}
