package model.facebook.page.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AlbumsByPageResponse {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;
    @SerializedName("count")
    @Expose
    private Integer count;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public static class Result {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("can_upload")
        @Expose
        private Boolean canUpload;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("album_cover_photo")
        @Expose
        private AlbumCoverPhoto albumCoverPhoto;
        @SerializedName("media")
        @Expose
        private Media media;
        @SerializedName("__typename")
        @Expose
        private String typename;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public Boolean getCanUpload() {
            return canUpload;
        }

        public void setCanUpload(Boolean canUpload) {
            this.canUpload = canUpload;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public AlbumCoverPhoto getAlbumCoverPhoto() {
            return albumCoverPhoto;
        }

        public void setAlbumCoverPhoto(AlbumCoverPhoto albumCoverPhoto) {
            this.albumCoverPhoto = albumCoverPhoto;
        }

        public Media getMedia() {
            return media;
        }

        public void setMedia(Media media) {
            this.media = media;
        }

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

    }

    public static class Image {
        @SerializedName("uri")
        @Expose
        private String uri;

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }
    }

    public static class Media {
        @SerializedName("count")
        @Expose
        private Integer count;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }
    }

    public static class AlbumCoverPhoto {
        @SerializedName("image")
        @Expose
        private Image image;
        @SerializedName("id")
        @Expose
        private String id;

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }
}
