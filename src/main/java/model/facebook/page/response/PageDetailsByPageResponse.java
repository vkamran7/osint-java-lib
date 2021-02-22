package model.facebook.page.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PageDetailsByPageResponse {

    @SerializedName("exec_time")
    @Expose
    private Double execTime;
    @SerializedName("result")
    @Expose
    private Result result;

    public Double getExecTime() {
        return execTime;
    }

    public void setExecTime(Double execTime) {
        this.execTime = execTime;
    }

    public Result getResult() {
        return result;
    }

    public void setResult(Result result) {
        this.result = result;
    }

    public static class AdminLocation {
        @SerializedName("count")
        @Expose
        private Integer count;
        @SerializedName("name")
        @Expose
        private String name;

        public Integer getCount() {
            return count;
        }

        public void setCount(Integer count) {
            this.count = count;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }

    public static class CategoryList {
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("url")
        @Expose
        private String url;

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

    public static class History {
        @SerializedName("time")
        @Expose
        private Integer time;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("type")
        @Expose
        private String type;

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Link {
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("type")
        @Expose
        private String type;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

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

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }
    }

    public static class Location {
        @SerializedName("latitude")
        @Expose
        private Double latitude;
        @SerializedName("longitude")
        @Expose
        private Double longitude;

        public Double getLatitude() {
            return latitude;
        }

        public void setLatitude(Double latitude) {
            this.latitude = latitude;
        }

        public Double getLongitude() {
            return longitude;
        }

        public void setLongitude(Double longitude) {
            this.longitude = longitude;
        }
    }

    public static class Result {
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("photo")
        @Expose
        private String photo;
        @SerializedName("link")
        @Expose
        private String link;
        @SerializedName("verified")
        @Expose
        private Boolean verified;
        @SerializedName("website")
        @Expose
        private String website;
        @SerializedName("links")
        @Expose
        private List<Link> links = null;
        @SerializedName("price_range")
        @Expose
        private String priceRange;
        @SerializedName("about")
        @Expose
        private String about;
        @SerializedName("additional_info")
        @Expose
        private String additionalInfo;
        @SerializedName("impressum")
        @Expose
        private String impressum;
        @SerializedName("privacy_policy")
        @Expose
        private String privacyPolicy;
        @SerializedName("email")
        @Expose
        private String email;
        @SerializedName("phones")
        @Expose
        private List<Object> phones = null;
        @SerializedName("whatsapp")
        @Expose
        private String whatsapp;
        @SerializedName("address")
        @Expose
        private String address;
        @SerializedName("location")
        @Expose
        private Location location;
        @SerializedName("open_hour")
        @Expose
        private String openHour;
        @SerializedName("open_hour_details")
        @Expose
        private List<Object> openHourDetails = null;
        @SerializedName("category")
        @Expose
        private String category;
        @SerializedName("category_list")
        @Expose
        private List<CategoryList> categoryList = null;
        @SerializedName("likers_count")
        @Expose
        private Integer likersCount;
        @SerializedName("checkins")
        @Expose
        private Integer checkins;
        @SerializedName("fan_count")
        @Expose
        private Integer fanCount;
        @SerializedName("cover_photo")
        @Expose
        private String coverPhoto;
        @SerializedName("history")
        @Expose
        private List<History> history = null;
        @SerializedName("admin_locations")
        @Expose
        private List<AdminLocation> adminLocations = null;

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

        public String getLink() {
            return link;
        }

        public void setLink(String link) {
            this.link = link;
        }

        public Boolean getVerified() {
            return verified;
        }

        public void setVerified(Boolean verified) {
            this.verified = verified;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        public List<Link> getLinks() {
            return links;
        }

        public void setLinks(List<Link> links) {
            this.links = links;
        }

        public String getPriceRange() {
            return priceRange;
        }

        public void setPriceRange(String priceRange) {
            this.priceRange = priceRange;
        }

        public String getAbout() {
            return about;
        }

        public void setAbout(String about) {
            this.about = about;
        }

        public String getAdditionalInfo() {
            return additionalInfo;
        }

        public void setAdditionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
        }

        public String getImpressum() {
            return impressum;
        }

        public void setImpressum(String impressum) {
            this.impressum = impressum;
        }

        public String getPrivacyPolicy() {
            return privacyPolicy;
        }

        public void setPrivacyPolicy(String privacyPolicy) {
            this.privacyPolicy = privacyPolicy;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public List<Object> getPhones() {
            return phones;
        }

        public void setPhones(List<Object> phones) {
            this.phones = phones;
        }

        public String getWhatsapp() {
            return whatsapp;
        }

        public void setWhatsapp(String whatsapp) {
            this.whatsapp = whatsapp;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getOpenHour() {
            return openHour;
        }

        public void setOpenHour(String openHour) {
            this.openHour = openHour;
        }

        public List<Object> getOpenHourDetails() {
            return openHourDetails;
        }

        public void setOpenHourDetails(List<Object> openHourDetails) {
            this.openHourDetails = openHourDetails;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public List<CategoryList> getCategoryList() {
            return categoryList;
        }

        public void setCategoryList(List<CategoryList> categoryList) {
            this.categoryList = categoryList;
        }

        public Integer getLikersCount() {
            return likersCount;
        }

        public void setLikersCount(Integer likersCount) {
            this.likersCount = likersCount;
        }

        public Integer getCheckins() {
            return checkins;
        }

        public void setCheckins(Integer checkins) {
            this.checkins = checkins;
        }

        public Integer getFanCount() {
            return fanCount;
        }

        public void setFanCount(Integer fanCount) {
            this.fanCount = fanCount;
        }

        public String getCoverPhoto() {
            return coverPhoto;
        }

        public void setCoverPhoto(String coverPhoto) {
            this.coverPhoto = coverPhoto;
        }

        public List<History> getHistory() {
            return history;
        }

        public void setHistory(List<History> history) {
            this.history = history;
        }

        public List<AdminLocation> getAdminLocations() {
            return adminLocations;
        }

        public void setAdminLocations(List<AdminLocation> adminLocations) {
            this.adminLocations = adminLocations;
        }
    }
}
