package model.facebook.page.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PagePostsByIdResponse {
    @SerializedName("page_id")
    @Expose
    private String pageId;
    @SerializedName("post_id")
    @Expose
    private String postId;
    @SerializedName("likes_count")
    @Expose
    private String likesCount;
    @SerializedName("comments_count")
    @Expose
    private String commentsCount;
    @SerializedName("shares_count")
    @Expose
    private String sharesCount;
    @SerializedName("publish_time")
    @Expose
    private String publishTime;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("post_content")
    @Expose
    private String postContent;
    @SerializedName("comments")
    @Expose
    private List<Object> comments = null;

    public String getPageId() {
        return pageId;
    }

    public void setPageId(String pageId) {
        this.pageId = pageId;
    }

    public String getPostId() {
        return postId;
    }

    public void setPostId(String postId) {
        this.postId = postId;
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

    public String getSharesCount() {
        return sharesCount;
    }

    public void setSharesCount(String sharesCount) {
        this.sharesCount = sharesCount;
    }

    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
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

    public List<Object> getComments() {
        return comments;
    }

    public void setComments(List<Object> comments) {
        this.comments = comments;
    }
}
