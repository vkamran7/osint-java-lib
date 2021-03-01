package model.facebook.graph.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PhotoPostFBGraphSearchByDateResponse {

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

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("owner_id")
        @Expose
        private String ownerId;
        @SerializedName("author")
        @Expose
        private Author author;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("publish_time")
        @Expose
        private Integer publishTime;
        @SerializedName("reactions")
        @Expose
        private Integer reactions;
        @SerializedName("likes")
        @Expose
        private Integer likes;
        @SerializedName("reshares")
        @Expose
        private Integer reshares;
        @SerializedName("comments")
        @Expose
        private Integer comments;
        @SerializedName("images")
        @Expose
        private List<String> images = null;
        @SerializedName("links")
        @Expose
        private List<Link> links = null;
        @SerializedName("post_content")
        @Expose
        private String postContent;

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

        public String getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(String ownerId) {
            this.ownerId = ownerId;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Integer getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(Integer publishTime) {
            this.publishTime = publishTime;
        }

        public Integer getReactions() {
            return reactions;
        }

        public void setReactions(Integer reactions) {
            this.reactions = reactions;
        }

        public Integer getLikes() {
            return likes;
        }

        public void setLikes(Integer likes) {
            this.likes = likes;
        }

        public Integer getReshares() {
            return reshares;
        }

        public void setReshares(Integer reshares) {
            this.reshares = reshares;
        }

        public Integer getComments() {
            return comments;
        }

        public void setComments(Integer comments) {
            this.comments = comments;
        }

        public List<String> getImages() {
            return images;
        }

        public void setImages(List<String> images) {
            this.images = images;
        }

        public List<Link> getLinks() {
            return links;
        }

        public void setLinks(List<Link> links) {
            this.links = links;
        }

        public String getPostContent() {
            return postContent;
        }

        public void setPostContent(String postContent) {
            this.postContent = postContent;
        }

    }

    public static class Link {

        @SerializedName("url")
        @Expose
        private String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

    }

    public static class Author {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("photo")
        @Expose
        private String photo;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
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

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

    }
}
