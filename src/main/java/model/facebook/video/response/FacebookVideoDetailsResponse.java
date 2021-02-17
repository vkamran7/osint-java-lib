package model.facebook.video.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import model.facebook.Author;

import java.util.List;

public class FacebookVideoDetailsResponse {

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("time")
    @Expose
    private String time;
    @SerializedName("author")
    @Expose
    private Author author;
    @SerializedName("links")
    @Expose
    private List<Link> links = null;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("with")
    @Expose
    private List<Object> with = null;

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

    public static class Link {

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

        @Override
        public String toString() {
            return "Link{" +
                    "id='" + id + '\'' +
                    ", alias='" + alias + '\'' +
                    ", name='" + name + '\'' +
                    ", url='" + url + '\'' +
                    '}';
        }
    }


}
