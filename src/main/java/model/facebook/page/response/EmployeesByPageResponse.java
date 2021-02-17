package model.facebook.page.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class EmployeesByPageResponse {

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
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("photo")
        @Expose
        private String photo;
        @SerializedName("photo_id")
        @Expose
        private String photoId;
        @SerializedName("entities")
        @Expose
        private Entities entities;
        @SerializedName("entities_text")
        @Expose
        private EntitiesText entitiesText;

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

        public Entities getEntities() {
            return entities;
        }

        public void setEntities(Entities entities) {
            this.entities = entities;
        }

        public EntitiesText getEntitiesText() {
            return entitiesText;
        }

        public void setEntitiesText(EntitiesText entitiesText) {
            this.entitiesText = entitiesText;
        }

    }

    public static class Entities {

        @SerializedName("worked")
        @Expose
        private List<Worked> worked = null;
        @SerializedName("unknown_links")
        @Expose
        private List<UnknownLink> unknownLinks = null;
        @SerializedName("studied")
        @Expose
        private List<Studied> studied = null;
        @SerializedName("works")
        @Expose
        private List<Work> works = null;

        public List<Worked> getWorked() {
            return worked;
        }

        public void setWorked(List<Worked> worked) {
            this.worked = worked;
        }

        public List<UnknownLink> getUnknownLinks() {
            return unknownLinks;
        }

        public void setUnknownLinks(List<UnknownLink> unknownLinks) {
            this.unknownLinks = unknownLinks;
        }

        public List<Studied> getStudied() {
            return studied;
        }

        public void setStudied(List<Studied> studied) {
            this.studied = studied;
        }

        public List<Work> getWorks() {
            return works;
        }

        public void setWorks(List<Work> works) {
            this.works = works;
        }

    }

    public static class EntitiesText {

        @SerializedName("worked")
        @Expose
        private List<String> worked = null;
        @SerializedName("unknown_links")
        @Expose
        private List<String> unknownLinks = null;
        @SerializedName("studied")
        @Expose
        private List<String> studied = null;
        @SerializedName("works")
        @Expose
        private List<String> works = null;

        public List<String> getWorked() {
            return worked;
        }

        public void setWorked(List<String> worked) {
            this.worked = worked;
        }

        public List<String> getUnknownLinks() {
            return unknownLinks;
        }

        public void setUnknownLinks(List<String> unknownLinks) {
            this.unknownLinks = unknownLinks;
        }

        public List<String> getStudied() {
            return studied;
        }

        public void setStudied(List<String> studied) {
            this.studied = studied;
        }

        public List<String> getWorks() {
            return works;
        }

        public void setWorks(List<String> works) {
            this.works = works;
        }
    }

    public static class Studied {

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

    public static class UnknownLink {

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

    public static class Work {

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

    public static class Worked {

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
        @SerializedName("info")
        @Expose
        private String info;

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

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

    }
}
