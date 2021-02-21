package model.facebook.post_reaction_place.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PostInfoResponse {
    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public static class Author {
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("photo")
        @Expose
        private String photo;
        @SerializedName("photo_id")
        @Expose
        private String photoId;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getPhotoId() {
            return photoId;
        }

        public void setPhotoId(String photoId) {
            this.photoId = photoId;
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
        private List<Entity> entity = null;
        @SerializedName("love_count")
        @Expose
        private Integer loveCount;
        @SerializedName("haha_count")
        @Expose
        private Integer hahaCount;
        @SerializedName("sorry_count")
        @Expose
        private Integer sorryCount;
        @SerializedName("wow_count")
        @Expose
        private Integer wowCount;
        @SerializedName("anger_count")
        @Expose
        private Integer angerCount;

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

        public List<Entity> getEntity() {
            return entity;
        }

        public void setEntity(List<Entity> entity) {
            this.entity = entity;
        }

        public Integer getLoveCount() {
            return loveCount;
        }

        public void setLoveCount(Integer loveCount) {
            this.loveCount = loveCount;
        }

        public Integer getHahaCount() {
            return hahaCount;
        }

        public void setHahaCount(Integer hahaCount) {
            this.hahaCount = hahaCount;
        }

        public Integer getSorryCount() {
            return sorryCount;
        }

        public void setSorryCount(Integer sorryCount) {
            this.sorryCount = sorryCount;
        }

        public Integer getWowCount() {
            return wowCount;
        }

        public void setWowCount(Integer wowCount) {
            this.wowCount = wowCount;
        }

        public Integer getAngerCount() {
            return angerCount;
        }

        public void setAngerCount(Integer angerCount) {
            this.angerCount = angerCount;
        }
    }

    public static class Entity {
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("type")
        @Expose
        private String type;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Link {
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("name")
        @Expose
        private String name;

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

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class Photo {
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("album")
        @Expose
        private String album;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }

        public String getAlbum() {
            return album;
        }

        public void setAlbum(String album) {
            this.album = album;
        }
    }

    public static class Result {
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("author")
        @Expose
        private Author author;
        @SerializedName("publish_time")
        @Expose
        private Integer publishTime;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("post_content")
        @Expose
        private String postContent;
        @SerializedName("links")
        @Expose
        private List<Link> links = null;
        @SerializedName("photos")
        @Expose
        private List<Photo> photos = null;
        @SerializedName("comments_count")
        @Expose
        private Integer commentsCount;
        @SerializedName("likes_count")
        @Expose
        private Integer likesCount;
        @SerializedName("shares_count")
        @Expose
        private Integer sharesCount;
        @SerializedName("comments")
        @Expose
        private List<Comment> comments = null;
        @SerializedName("love_count")
        @Expose
        private Integer loveCount;
        @SerializedName("wow_count")
        @Expose
        private Integer wowCount;
        @SerializedName("haha_count")
        @Expose
        private Integer hahaCount;
        @SerializedName("anger_count")
        @Expose
        private Integer angerCount;
        @SerializedName("sorry_count")
        @Expose
        private Integer sorryCount;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public List<Link> getLinks() {
            return links;
        }

        public void setLinks(List<Link> links) {
            this.links = links;
        }

        public List<Photo> getPhotos() {
            return photos;
        }

        public void setPhotos(List<Photo> photos) {
            this.photos = photos;
        }

        public Integer getCommentsCount() {
            return commentsCount;
        }

        public void setCommentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
        }

        public Integer getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
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

        public Integer getLoveCount() {
            return loveCount;
        }

        public void setLoveCount(Integer loveCount) {
            this.loveCount = loveCount;
        }

        public Integer getWowCount() {
            return wowCount;
        }

        public void setWowCount(Integer wowCount) {
            this.wowCount = wowCount;
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

        public Integer getSorryCount() {
            return sorryCount;
        }

        public void setSorryCount(Integer sorryCount) {
            this.sorryCount = sorryCount;
        }
    }
}
