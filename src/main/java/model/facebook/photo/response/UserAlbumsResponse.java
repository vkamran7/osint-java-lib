package model.facebook.photo.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserAlbumsResponse {

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

        @SerializedName("album")
        @Expose
        private String album;
        @SerializedName("album_id")
        @Expose
        private String albumId;
        @SerializedName("album_name")
        @Expose
        private String albumName;
        @SerializedName("album_photos_count")
        @Expose
        private Integer albumPhotosCount;
        @SerializedName("album_posts_count")
        @Expose
        private Object albumPostsCount;
        @SerializedName("album_photo")
        @Expose
        private String albumPhoto;

        public String getAlbum() {
            return album;
        }

        public void setAlbum(String album) {
            this.album = album;
        }

        public String getAlbumId() {
            return albumId;
        }

        public void setAlbumId(String albumId) {
            this.albumId = albumId;
        }

        public String getAlbumName() {
            return albumName;
        }

        public void setAlbumName(String albumName) {
            this.albumName = albumName;
        }

        public Integer getAlbumPhotosCount() {
            return albumPhotosCount;
        }

        public void setAlbumPhotosCount(Integer albumPhotosCount) {
            this.albumPhotosCount = albumPhotosCount;
        }

        public Object getAlbumPostsCount() {
            return albumPostsCount;
        }

        public void setAlbumPostsCount(Object albumPostsCount) {
            this.albumPostsCount = albumPostsCount;
        }

        public String getAlbumPhoto() {
            return albumPhoto;
        }

        public void setAlbumPhoto(String albumPhoto) {
            this.albumPhoto = albumPhoto;
        }

    }
}
