package model.facebook.page.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PhotosByPageResponse {

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

        @SerializedName("photo_id")
        @Expose
        private String photoId;
        @SerializedName("album")
        @Expose
        private String album;
        @SerializedName("album_id")
        @Expose
        private String albumId;
        @SerializedName("album_name")
        @Expose
        private String albumName;
        @SerializedName("album_type")
        @Expose
        private String albumType;
        @SerializedName("likes_count")
        @Expose
        private String likesCount;
        @SerializedName("comments_count")
        @Expose
        private String commentsCount;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("owner_id")
        @Expose
        private String ownerId;
        @SerializedName("owner_type")
        @Expose
        private String ownerType;

        public String getPhotoId() {
            return photoId;
        }

        public void setPhotoId(String photoId) {
            this.photoId = photoId;
        }

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

        public String getAlbumType() {
            return albumType;
        }

        public void setAlbumType(String albumType) {
            this.albumType = albumType;
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

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
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

    }
}
