package model.facebook.user.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class ConvertToFoursquareEntitiesResponse {

    @SerializedName("result")
    @Expose
    private List<Result> result = null;

    public List<Result> getResult() {
        return result;
    }

    public void setResult(List<Result> result) {
        this.result = result;
    }


    public static class Contact {

        @SerializedName("facebook")
        @Expose
        private String facebook;

        public String getFacebook() {
            return facebook;
        }

        public void setFacebook(String facebook) {
            this.facebook = facebook;
        }
    }

    public static class Group {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("items")
        @Expose
        private List<Object> items = null;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public List<Object> getItems() {
            return items;
        }

        public void setItems(List<Object> items) {
            this.items = items;
        }
    }

    public static class Lists {

        @SerializedName("groups")
        @Expose
        private List<Group> groups = null;

        public List<Group> getGroups() {
            return groups;
        }

        public void setGroups(List<Group> groups) {
            this.groups = groups;
        }
    }

    public static class Photo {

        @SerializedName("prefix")
        @Expose
        private String prefix;
        @SerializedName("suffix")
        @Expose
        private String suffix;
        @SerializedName("default")
        @Expose
        private Boolean _default;

        public String getPrefix() {
            return prefix;
        }

        public void setPrefix(String prefix) {
            this.prefix = prefix;
        }

        public String getSuffix() {
            return suffix;
        }

        public void setSuffix(String suffix) {
            this.suffix = suffix;
        }

        public Boolean getDefault() {
            return _default;
        }

        public void setDefault(Boolean _default) {
            this._default = _default;
        }
    }

    public static class Result {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("photo")
        @Expose
        private Photo photo;
        @SerializedName("tips")
        @Expose
        private Tips tips;
        @SerializedName("lists")
        @Expose
        private Lists lists;
        @SerializedName("homeCity")
        @Expose
        private String homeCity;
        @SerializedName("bio")
        @Expose
        private String bio;
        @SerializedName("contact")
        @Expose
        private Contact contact;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Photo getPhoto() {
            return photo;
        }

        public void setPhoto(Photo photo) {
            this.photo = photo;
        }

        public Tips getTips() {
            return tips;
        }

        public void setTips(Tips tips) {
            this.tips = tips;
        }

        public Lists getLists() {
            return lists;
        }

        public void setLists(Lists lists) {
            this.lists = lists;
        }

        public String getHomeCity() {
            return homeCity;
        }

        public void setHomeCity(String homeCity) {
            this.homeCity = homeCity;
        }

        public String getBio() {
            return bio;
        }

        public void setBio(String bio) {
            this.bio = bio;
        }

        public Contact getContact() {
            return contact;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
        }
    }

    public static class Tips {

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
}
