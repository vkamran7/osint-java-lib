package dto.facebook.video;

import java.util.List;

public class VideoDetailsResponse {
    private String id;
    private String time;
    private Author author;
    private List<Link> links;
    private String description;
    public List<Object> with;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public List<Link> getLinks() {
        return links;
    }

    public void setLinks(List<Link> links) {
        this.links = links;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Object> getWith() {
        return with;
    }

    public void setWith(List<Object> with) {
        this.with = with;
    }
}
