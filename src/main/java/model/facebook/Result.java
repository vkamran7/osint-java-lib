package model.facebook;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result {
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("duration")
    @Expose
    private String duration;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("publish_time")
    @Expose
    private Integer publishTime;
    @SerializedName("views_count")
    @Expose
    private Integer viewsCount;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("descr")
    @Expose
    private String descr;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public Integer getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(Integer viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    @Override
    public String toString() {
        return "Result{" +
                "id='" + id + '\'' +
                ", duration='" + duration + '\'' +
                ", photo='" + photo + '\'' +
                ", author=" + author +
                ", publishTime=" + publishTime +
                ", viewsCount=" + viewsCount +
                ", title='" + title + '\'' +
                ", descr='" + descr + '\'' +
                '}';
    }
}
