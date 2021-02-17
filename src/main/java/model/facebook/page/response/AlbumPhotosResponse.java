package model.facebook.page.response;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class AlbumPhotosResponse {

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


    public static class Actor {

        @SerializedName("__typename")
        @Expose
        private String typename;
        @SerializedName("__isActor")
        @Expose
        private String isActor;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("__isEntity")
        @Expose
        private String isEntity;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("category_type")
        @Expose
        private String categoryType;
        @SerializedName("name")
        @Expose
        private String name;

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

        public String getIsActor() {
            return isActor;
        }

        public void setIsActor(String isActor) {
            this.isActor = isActor;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIsEntity() {
            return isEntity;
        }

        public void setIsEntity(String isEntity) {
            this.isEntity = isEntity;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getCategoryType() {
            return categoryType;
        }

        public void setCategoryType(String categoryType) {
            this.categoryType = categoryType;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

    }

    public class Actor_ {

        @SerializedName("__typename")
        @Expose
        private String typename;
        @SerializedName("__isActor")
        @Expose
        private String isActor;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("__isEntity")
        @Expose
        private String isEntity;
        @SerializedName("profile_url")
        @Expose
        private String profileUrl;
        @SerializedName("pages_story_bucket_v2")
        @Expose
        private PagesStoryBucketV2 pagesStoryBucketV2;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("profile_picture")
        @Expose
        private ProfilePicture profilePicture;

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

        public String getIsActor() {
            return isActor;
        }

        public void setIsActor(String isActor) {
            this.isActor = isActor;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getIsEntity() {
            return isEntity;
        }

        public void setIsEntity(String isEntity) {
            this.isEntity = isEntity;
        }

        public String getProfileUrl() {
            return profileUrl;
        }

        public void setProfileUrl(String profileUrl) {
            this.profileUrl = profileUrl;
        }

        public PagesStoryBucketV2 getPagesStoryBucketV2() {
            return pagesStoryBucketV2;
        }

        public void setPagesStoryBucketV2(PagesStoryBucketV2 pagesStoryBucketV2) {
            this.pagesStoryBucketV2 = pagesStoryBucketV2;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ProfilePicture getProfilePicture() {
            return profilePicture;
        }

        public void setProfilePicture(ProfilePicture profilePicture) {
            this.profilePicture = profilePicture;
        }

    }

    public class CometSections {

        @SerializedName("action_link")
        @Expose
        private Object actionLink;
        @SerializedName("actor_photo")
        @Expose
        private ActorPhoto actorPhoto;

        public Object getActionLink() {
            return actionLink;
        }

        public void setActionLink(Object actionLink) {
            this.actionLink = actionLink;
        }

        public ActorPhoto getActorPhoto() {
            return actorPhoto;
        }

        public void setActorPhoto(ActorPhoto actorPhoto) {
            this.actorPhoto = actorPhoto;
        }

    }

    public class CreationStory {

        @SerializedName("actors")
        @Expose
        private List<Actor> actors = null;
        @SerializedName("comet_sections")
        @Expose
        private CometSections cometSections;
        @SerializedName("encrypted_tracking")
        @Expose
        private String encryptedTracking;
        @SerializedName("creation_time")
        @Expose
        private Integer creationTime;
        @SerializedName("url")
        @Expose
        private String url;
        @SerializedName("id")
        @Expose
        private String id;

        public List<Actor> getActors() {
            return actors;
        }

        public void setActors(List<Actor> actors) {
            this.actors = actors;
        }

        public CometSections getCometSections() {
            return cometSections;
        }

        public void setCometSections(CometSections cometSections) {
            this.cometSections = cometSections;
        }

        public String getEncryptedTracking() {
            return encryptedTracking;
        }

        public void setEncryptedTracking(String encryptedTracking) {
            this.encryptedTracking = encryptedTracking;
        }

        public Integer getCreationTime() {
            return creationTime;
        }

        public void setCreationTime(Integer creationTime) {
            this.creationTime = creationTime;
        }

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

    }

    public class FirstStoryToShow {

        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("story_card_seen_state")
        @Expose
        private StoryCardSeenState storyCardSeenState;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public StoryCardSeenState getStoryCardSeenState() {
            return storyCardSeenState;
        }

        public void setStoryCardSeenState(StoryCardSeenState storyCardSeenState) {
            this.storyCardSeenState = storyCardSeenState;
        }

    }

    public class Image {

        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("uri")
        @Expose
        private String uri;

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

    }

    public class ModuleComponentCometFeedStoryActorPhotoSectionStory {

        @SerializedName("__dr")
        @Expose
        private String dr;

        public String getDr() {
            return dr;
        }

        public void setDr(String dr) {
            this.dr = dr;
        }

    }

    public class ModuleOperationCometFeedStoryActorPhotoSectionStory {

        @SerializedName("__dr")
        @Expose
        private String dr;

        public String getDr() {
            return dr;
        }

        public void setDr(String dr) {
            this.dr = dr;
        }

    }

    public class PagesStoryBucketV2 {

        @SerializedName("__typename")
        @Expose
        private String typename;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("first_story_to_show")
        @Expose
        private FirstStoryToShow firstStoryToShow;

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public FirstStoryToShow getFirstStoryToShow() {
            return firstStoryToShow;
        }

        public void setFirstStoryToShow(FirstStoryToShow firstStoryToShow) {
            this.firstStoryToShow = firstStoryToShow;
        }

    }

    public class ProfilePicture {

        @SerializedName("uri")
        @Expose
        private String uri;
        @SerializedName("width")
        @Expose
        private Integer width;
        @SerializedName("height")
        @Expose
        private Integer height;
        @SerializedName("scale")
        @Expose
        private Integer scale;

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public Integer getWidth() {
            return width;
        }

        public void setWidth(Integer width) {
            this.width = width;
        }

        public Integer getHeight() {
            return height;
        }

        public void setHeight(Integer height) {
            this.height = height;
        }

        public Integer getScale() {
            return scale;
        }

        public void setScale(Integer scale) {
            this.scale = scale;
        }

    }

    public class Result {

        @SerializedName("__typename")
        @Expose
        private String typename;
        @SerializedName("__isMedia")
        @Expose
        private String isMedia;
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("creation_story")
        @Expose
        private CreationStory creationStory;
        @SerializedName("image")
        @Expose
        private Image image;
        @SerializedName("__isNode")
        @Expose
        private String isNode;

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

        public String getIsMedia() {
            return isMedia;
        }

        public void setIsMedia(String isMedia) {
            this.isMedia = isMedia;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public CreationStory getCreationStory() {
            return creationStory;
        }

        public void setCreationStory(CreationStory creationStory) {
            this.creationStory = creationStory;
        }

        public Image getImage() {
            return image;
        }

        public void setImage(Image image) {
            this.image = image;
        }

        public String getIsNode() {
            return isNode;
        }

        public void setIsNode(String isNode) {
            this.isNode = isNode;
        }

    }

    public class Story {

        @SerializedName("actors")
        @Expose
        private List<Actor_> actors = null;
        @SerializedName("id")
        @Expose
        private String id;

        public List<Actor_> getActors() {
            return actors;
        }

        public void setActors(List<Actor_> actors) {
            this.actors = actors;
        }

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

    }

    public class StoryCardSeenState {

        @SerializedName("is_seen_by_viewer")
        @Expose
        private Boolean isSeenByViewer;

        public Boolean getIsSeenByViewer() {
            return isSeenByViewer;
        }

        public void setIsSeenByViewer(Boolean isSeenByViewer) {
            this.isSeenByViewer = isSeenByViewer;
        }

    }

    public class ActorPhoto {

        @SerializedName("__typename")
        @Expose
        private String typename;
        @SerializedName("__isICometStorySection")
        @Expose
        private String isICometStorySection;
        @SerializedName("is_prod_eligible")
        @Expose
        private Boolean isProdEligible;
        @SerializedName("story")
        @Expose
        private Story story;
        @SerializedName("__module_operation_CometFeedStoryActorPhotoSection_story")
        @Expose
        private ModuleOperationCometFeedStoryActorPhotoSectionStory moduleOperationCometFeedStoryActorPhotoSectionStory;
        @SerializedName("__module_component_CometFeedStoryActorPhotoSection_story")
        @Expose
        private ModuleComponentCometFeedStoryActorPhotoSectionStory moduleComponentCometFeedStoryActorPhotoSectionStory;

        public String getTypename() {
            return typename;
        }

        public void setTypename(String typename) {
            this.typename = typename;
        }

        public String getIsICometStorySection() {
            return isICometStorySection;
        }

        public void setIsICometStorySection(String isICometStorySection) {
            this.isICometStorySection = isICometStorySection;
        }

        public Boolean getIsProdEligible() {
            return isProdEligible;
        }

        public void setIsProdEligible(Boolean isProdEligible) {
            this.isProdEligible = isProdEligible;
        }

        public Story getStory() {
            return story;
        }

        public void setStory(Story story) {
            this.story = story;
        }

        public ModuleOperationCometFeedStoryActorPhotoSectionStory getModuleOperationCometFeedStoryActorPhotoSectionStory() {
            return moduleOperationCometFeedStoryActorPhotoSectionStory;
        }

        public void setModuleOperationCometFeedStoryActorPhotoSectionStory(ModuleOperationCometFeedStoryActorPhotoSectionStory moduleOperationCometFeedStoryActorPhotoSectionStory) {
            this.moduleOperationCometFeedStoryActorPhotoSectionStory = moduleOperationCometFeedStoryActorPhotoSectionStory;
        }

        public ModuleComponentCometFeedStoryActorPhotoSectionStory getModuleComponentCometFeedStoryActorPhotoSectionStory() {
            return moduleComponentCometFeedStoryActorPhotoSectionStory;
        }

        public void setModuleComponentCometFeedStoryActorPhotoSectionStory(ModuleComponentCometFeedStoryActorPhotoSectionStory moduleComponentCometFeedStoryActorPhotoSectionStory) {
            this.moduleComponentCometFeedStoryActorPhotoSectionStory = moduleComponentCometFeedStoryActorPhotoSectionStory;
        }

    }
}
