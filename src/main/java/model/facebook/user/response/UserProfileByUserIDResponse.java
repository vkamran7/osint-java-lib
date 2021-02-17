package model.facebook.user.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class UserProfileByUserIDResponse {

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
    @SerializedName("headline")
    @Expose
    private String headline;
    @SerializedName("followed_count")
    @Expose
    private Integer followedCount;
    @SerializedName("photo")
    @Expose
    private String photo;
    @SerializedName("photo_id")
    @Expose
    private String photoId;
    @SerializedName("skype")
    @Expose
    private String skype;
    @SerializedName("photos")
    @Expose
    private List<Photo> photos = null;
    @SerializedName("posts")
    @Expose
    private List<Post> posts = null;
    @SerializedName("social_links")
    @Expose
    private List<Object> socialLinks = null;
    @SerializedName("social")
    @Expose
    private List<Social> social = null;
    @SerializedName("social_fields")
    @Expose
    private SocialFields socialFields;
    @SerializedName("joined")
    @Expose
    private String joined;
    @SerializedName("social_links_entities")
    @Expose
    private List<Object> socialLinksEntities = null;
    @SerializedName("birth_day")
    @Expose
    private String birthDay;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("manages")
    @Expose
    private List<Object> manages = null;
    @SerializedName("skills")
    @Expose
    private List<Object> skills = null;
    @SerializedName("languages")
    @Expose
    private List<String> languages = null;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("interested_in")
    @Expose
    private Object interestedIn;
    @SerializedName("political_views")
    @Expose
    private List<Object> politicalViews = null;
    @SerializedName("religious_views")
    @Expose
    private List<Object> religiousViews = null;
    @SerializedName("phones")
    @Expose
    private List<Object> phones = null;
    @SerializedName("life_events")
    @Expose
    private List<LifeEvent> lifeEvents = null;
    @SerializedName("about")
    @Expose
    private String about;
    @SerializedName("other_names")
    @Expose
    private List<Object> otherNames = null;
    @SerializedName("quotes")
    @Expose
    private String quotes;
    @SerializedName("relatives")
    @Expose
    private List<Relative> relatives = null;
    @SerializedName("family_status")
    @Expose
    private List<FamilyStatus> familyStatus = null;

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

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public Integer getFollowedCount() {
        return followedCount;
    }

    public void setFollowedCount(Integer followedCount) {
        this.followedCount = followedCount;
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

    public String getSkype() {
        return skype;
    }

    public void setSkype(String skype) {
        this.skype = skype;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public List<Object> getSocialLinks() {
        return socialLinks;
    }

    public void setSocialLinks(List<Object> socialLinks) {
        this.socialLinks = socialLinks;
    }

    public List<Social> getSocial() {
        return social;
    }

    public void setSocial(List<Social> social) {
        this.social = social;
    }

    public SocialFields getSocialFields() {
        return socialFields;
    }

    public void setSocialFields(SocialFields socialFields) {
        this.socialFields = socialFields;
    }

    public String getJoined() {
        return joined;
    }

    public void setJoined(String joined) {
        this.joined = joined;
    }

    public List<Object> getSocialLinksEntities() {
        return socialLinksEntities;
    }

    public void setSocialLinksEntities(List<Object> socialLinksEntities) {
        this.socialLinksEntities = socialLinksEntities;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Object> getManages() {
        return manages;
    }

    public void setManages(List<Object> manages) {
        this.manages = manages;
    }

    public List<Object> getSkills() {
        return skills;
    }

    public void setSkills(List<Object> skills) {
        this.skills = skills;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Object getInterestedIn() {
        return interestedIn;
    }

    public void setInterestedIn(Object interestedIn) {
        this.interestedIn = interestedIn;
    }

    public List<Object> getPoliticalViews() {
        return politicalViews;
    }

    public void setPoliticalViews(List<Object> politicalViews) {
        this.politicalViews = politicalViews;
    }

    public List<Object> getReligiousViews() {
        return religiousViews;
    }

    public void setReligiousViews(List<Object> religiousViews) {
        this.religiousViews = religiousViews;
    }

    public List<Object> getPhones() {
        return phones;
    }

    public void setPhones(List<Object> phones) {
        this.phones = phones;
    }

    public List<LifeEvent> getLifeEvents() {
        return lifeEvents;
    }

    public void setLifeEvents(List<LifeEvent> lifeEvents) {
        this.lifeEvents = lifeEvents;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }

    public List<Object> getOtherNames() {
        return otherNames;
    }

    public void setOtherNames(List<Object> otherNames) {
        this.otherNames = otherNames;
    }

    public String getQuotes() {
        return quotes;
    }

    public void setQuotes(String quotes) {
        this.quotes = quotes;
    }

    public List<Relative> getRelatives() {
        return relatives;
    }

    public void setRelatives(List<Relative> relatives) {
        this.relatives = relatives;
    }

    public List<FamilyStatus> getFamilyStatus() {
        return familyStatus;
    }

    public void setFamilyStatus(List<FamilyStatus> familyStatus) {
        this.familyStatus = familyStatus;
    }

    public class Author {

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

    public class Comment {

        @SerializedName("comment_id")
        @Expose
        private String commentId;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("author")
        @Expose
        private Author author;
        @SerializedName("time")
        @Expose
        private Integer time;
        @SerializedName("is_female")
        @Expose
        private Boolean isFemale;
        @SerializedName("reactions_count")
        @Expose
        private Integer reactionsCount;
        @SerializedName("likes_count")
        @Expose
        private Integer likesCount;
        @SerializedName("replies_count")
        @Expose
        private Integer repliesCount;
        @SerializedName("entity")
        @Expose
        private List<Object> entity = null;
        @SerializedName("haha_count")
        @Expose
        private Integer hahaCount;
        @SerializedName("love_count")
        @Expose
        private Integer loveCount;
        @SerializedName("wow_count")
        @Expose
        private Integer wowCount;
        @SerializedName("anger_count")
        @Expose
        private Integer angerCount;
        @SerializedName("sorry_count")
        @Expose
        private Integer sorryCount;

        public String getCommentId() {
            return commentId;
        }

        public void setCommentId(String commentId) {
            this.commentId = commentId;
        }

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
        }

        public Author getAuthor() {
            return author;
        }

        public void setAuthor(Author author) {
            this.author = author;
        }

        public Integer getTime() {
            return time;
        }

        public void setTime(Integer time) {
            this.time = time;
        }

        public Boolean getIsFemale() {
            return isFemale;
        }

        public void setIsFemale(Boolean isFemale) {
            this.isFemale = isFemale;
        }

        public Integer getReactionsCount() {
            return reactionsCount;
        }

        public void setReactionsCount(Integer reactionsCount) {
            this.reactionsCount = reactionsCount;
        }

        public Integer getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
        }

        public Integer getRepliesCount() {
            return repliesCount;
        }

        public void setRepliesCount(Integer repliesCount) {
            this.repliesCount = repliesCount;
        }

        public List<Object> getEntity() {
            return entity;
        }

        public void setEntity(List<Object> entity) {
            this.entity = entity;
        }

        public Integer getHahaCount() {
            return hahaCount;
        }

        public void setHahaCount(Integer hahaCount) {
            this.hahaCount = hahaCount;
        }

        public Integer getLoveCount() {
            return loveCount;
        }

        public void setLoveCount(Integer loveCount) {
            this.loveCount = loveCount;
        }

        public Integer getWowCount() {
            return wowCount;
        }

        public void setWowCount(Integer wowCount) {
            this.wowCount = wowCount;
        }

        public Integer getAngerCount() {
            return angerCount;
        }

        public void setAngerCount(Integer angerCount) {
            this.angerCount = angerCount;
        }

        public Integer getSorryCount() {
            return sorryCount;
        }

        public void setSorryCount(Integer sorryCount) {
            this.sorryCount = sorryCount;
        }

    }

    public class Education {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("display_name")
        @Expose
        private String displayName;
        @SerializedName("value")
        @Expose
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public class FamilyStatus {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("relation")
        @Expose
        private String relation;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("alias")
        @Expose
        private String alias;
        @SerializedName("id")
        @Expose
        private String id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRelation() {
            return relation;
        }

        public void setRelation(String relation) {
            this.relation = relation;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getAlias() {
            return alias;
        }

        public void setAlias(String alias) {
            this.alias = alias;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }
    }

    public class Info {

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
        @SerializedName("description")
        @Expose
        private Object description;
        @SerializedName("photo")
        @Expose
        private String photo;
        @SerializedName("date")
        @Expose
        private String date;
        @SerializedName("location")
        @Expose
        private String location;
        @SerializedName("field")
        @Expose
        private String field;

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

        public Object getDescription() {
            return description;
        }

        public void setDescription(Object description) {
            this.description = description;
        }

        public String getPhoto() {
            return photo;
        }

        public void setPhoto(String photo) {
            this.photo = photo;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            this.location = location;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }
    }

    public class LifeEvent {

        @SerializedName("year")
        @Expose
        private Integer year;
        @SerializedName("event")
        @Expose
        private String event;

        public Integer getYear() {
            return year;
        }

        public void setYear(Integer year) {
            this.year = year;
        }

        public String getEvent() {
            return event;
        }

        public void setEvent(String event) {
            this.event = event;
        }
    }

    public class Lives {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("display_name")
        @Expose
        private String displayName;
        @SerializedName("value")
        @Expose
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class Location {


    }

    public static class Location_ {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("display_name")
        @Expose
        private String displayName;
        @SerializedName("value")
        @Expose
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class MaritalStatus {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("display_name")
        @Expose
        private String displayName;
        @SerializedName("value")
        @Expose
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class Photo {

        @SerializedName("photo_id")
        @Expose
        private String photoId;
        @SerializedName("album")
        @Expose
        private String album;
        @SerializedName("title")
        @Expose
        private String title;
        @SerializedName("image")
        @Expose
        private String image;

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

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
        }
    }

    public static class Post {

        @SerializedName("post_id")
        @Expose
        private String postId;
        @SerializedName("likes_count")
        @Expose
        private Integer likesCount;
        @SerializedName("comments_count")
        @Expose
        private Integer commentsCount;
        @SerializedName("shares_count")
        @Expose
        private Integer sharesCount;
        @SerializedName("publish_time")
        @Expose
        private Integer publishTime;
        @SerializedName("location")
        @Expose
        private Location location;
        @SerializedName("image")
        @Expose
        private String image;
        @SerializedName("text")
        @Expose
        private String text;
        @SerializedName("post_content")
        @Expose
        private String postContent;
        @SerializedName("comments")
        @Expose
        private List<Comment> comments = null;
        @SerializedName("with")
        @Expose
        private List<Object> with = null;
        @SerializedName("at")
        @Expose
        private List<Object> at = null;
        @SerializedName("love_count")
        @Expose
        private Integer loveCount;
        @SerializedName("haha_count")
        @Expose
        private Integer hahaCount;
        @SerializedName("wow_count")
        @Expose
        private Integer wowCount;
        @SerializedName("anger_count")
        @Expose
        private Integer angerCount;
        @SerializedName("sorry_count")
        @Expose
        private Integer sorryCount;

        public String getPostId() {
            return postId;
        }

        public void setPostId(String postId) {
            this.postId = postId;
        }

        public Integer getLikesCount() {
            return likesCount;
        }

        public void setLikesCount(Integer likesCount) {
            this.likesCount = likesCount;
        }

        public Integer getCommentsCount() {
            return commentsCount;
        }

        public void setCommentsCount(Integer commentsCount) {
            this.commentsCount = commentsCount;
        }

        public Integer getSharesCount() {
            return sharesCount;
        }

        public void setSharesCount(Integer sharesCount) {
            this.sharesCount = sharesCount;
        }

        public Integer getPublishTime() {
            return publishTime;
        }

        public void setPublishTime(Integer publishTime) {
            this.publishTime = publishTime;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

        public String getImage() {
            return image;
        }

        public void setImage(String image) {
            this.image = image;
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

        public List<Comment> getComments() {
            return comments;
        }

        public void setComments(List<Comment> comments) {
            this.comments = comments;
        }

        public List<Object> getWith() {
            return with;
        }

        public void setWith(List<Object> with) {
            this.with = with;
        }

        public List<Object> getAt() {
            return at;
        }

        public void setAt(List<Object> at) {
            this.at = at;
        }

        public Integer getLoveCount() {
            return loveCount;
        }

        public void setLoveCount(Integer loveCount) {
            this.loveCount = loveCount;
        }

        public Integer getHahaCount() {
            return hahaCount;
        }

        public void setHahaCount(Integer hahaCount) {
            this.hahaCount = hahaCount;
        }

        public Integer getWowCount() {
            return wowCount;
        }

        public void setWowCount(Integer wowCount) {
            this.wowCount = wowCount;
        }

        public Integer getAngerCount() {
            return angerCount;
        }

        public void setAngerCount(Integer angerCount) {
            this.angerCount = angerCount;
        }

        public Integer getSorryCount() {
            return sorryCount;
        }

        public void setSorryCount(Integer sorryCount) {
            this.sorryCount = sorryCount;
        }
    }

    public static class Relative {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("relation")
        @Expose
        private String relation;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getRelation() {
            return relation;
        }

        public void setRelation(String relation) {
            this.relation = relation;
        }
    }

    public static class Social {

        @SerializedName("type")
        @Expose
        private String type;
        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("value_plain")
        @Expose
        private String valuePlain;
        @SerializedName("info")
        @Expose
        private Info info;

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public String getValuePlain() {
            return valuePlain;
        }

        public void setValuePlain(String valuePlain) {
            this.valuePlain = valuePlain;
        }

        public Info getInfo() {
            return info;
        }

        public void setInfo(Info info) {
            this.info = info;
        }
    }

    public static class SocialFields {

        @SerializedName("work")
        @Expose
        private Work work;
        @SerializedName("work1")
        @Expose
        private Work1 work1;
        @SerializedName("education")
        @Expose
        private Education education;
        @SerializedName("lives")
        @Expose
        private Lives lives;
        @SerializedName("location")
        @Expose
        private Location_ location;
        @SerializedName("marital_status")
        @Expose
        private MaritalStatus maritalStatus;

        public Work getWork() {
            return work;
        }

        public void setWork(Work work) {
            this.work = work;
        }

        public Work1 getWork1() {
            return work1;
        }

        public void setWork1(Work1 work1) {
            this.work1 = work1;
        }

        public Education getEducation() {
            return education;
        }

        public void setEducation(Education education) {
            this.education = education;
        }

        public Lives getLives() {
            return lives;
        }

        public void setLives(Lives lives) {
            this.lives = lives;
        }

        public Location_ getLocation() {
            return location;
        }

        public void setLocation(Location_ location) {
            this.location = location;
        }

        public MaritalStatus getMaritalStatus() {
            return maritalStatus;
        }

        public void setMaritalStatus(MaritalStatus maritalStatus) {
            this.maritalStatus = maritalStatus;
        }
    }

    public static class Work {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("display_name")
        @Expose
        private String displayName;
        @SerializedName("value")
        @Expose
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class Work1 {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("display_name")
        @Expose
        private String displayName;
        @SerializedName("value")
        @Expose
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getDisplayName() {
            return displayName;
        }

        public void setDisplayName(String displayName) {
            this.displayName = displayName;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
