import maltego.rx.MaltegoServiceManager;
import model.facebook.page.request.*;
import model.facebook.page.response.*;
import model.facebook.photo.request.*;
import model.facebook.photo.response.*;
import model.facebook.user.request.*;
import model.facebook.user.response.*;
import model.facebook.video.request.FacebookVideoByGeoRequest;
import model.facebook.video.request.FacebookVideoDetailsRequest;
import model.facebook.video.request.FacebookVideoV2Request;
import model.facebook.video.response.FacebookVideoByGeoResponse;
import model.facebook.video.response.FacebookVideoDetailsResponse;
import model.facebook.video.response.FacebookVideoV2Response;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;


public class FacebookApiTest {
    private static MaltegoServiceManager manager;

    @BeforeAll
    static void before() {
        manager = MaltegoServiceManager.getInstance();
    }

    @Test
    void testFBVideoV2() {
        FacebookVideoV2Request request =
                new FacebookVideoV2Request.Builder()
                        .query("ronaldo")
                        .limit(50)
                        .location("portugal")
                        .build();

        FacebookVideoV2Response response;
        response = manager.getV2Response(request);
        Assertions.assertEquals(50, response.getResult().size());
    }

    @Test
    void testFBVideoByGeo() {
        FacebookVideoByGeoRequest request =
                new FacebookVideoByGeoRequest.Builder()
                        .lat(40.757847)
                        .lon(-73.989105)
                        .distance(1000)
                        .limit(2)
                        .timeout(1100)
                        .delayed(0)
                        .taskTimeout(354000)
                        .type("videos")
                        .build();

        FacebookVideoByGeoResponse response = manager.getFbGeo(request);
        Assertions.assertEquals(2, response.getResult().size());
    }

    @Test
    void testFBVideoDetails() {
        FacebookVideoDetailsRequest request = new FacebookVideoDetailsRequest();
        request.setId(15);

        FacebookVideoDetailsResponse response = manager.getFBVideoDetails(request);
        Assertions.assertNotNull(response.getAuthor());
    }

    @Test
    void testFBAlbumsByUserID() {
        UserAlbumsRequest request = new UserAlbumsRequest.Builder()
                .withId("100005173955397")
                .build();
        UserAlbumsResponse response = manager.getFBUserAlbumsByUserID(request);
        Assertions.assertNotNull(response);
    }

    @Test
    void testSearchPhotoByGeo() {
        PhotoByGeoRequest request = new PhotoByGeoRequest.Builder()
                .withLat(40.757847)
                .withLon(-73.989105)
                .withDistance(1000)
                .withLimit(2)
                .withTimeout(110)
                .withDelayed(0)
                .withTaskTimeout(3540)
                .withType("photos")
                .build();
        PhotoByGeoResponse response = manager.searchFBPhotosByGeo(request);
        Assertions.assertEquals(2, response.getResult().size());
    }

    @Test
    void testSearchFBPhotoByPhrase() {
        PhotoByPhraseRequest request = new PhotoByPhraseRequest.Builder()
                .withQuery("world")
                .withLimit(12)
                .withLocation("moscow")
                .withDate("2017-04")
                .withTimeout(110)
                .build();
        PhotoByPhraseResponse response = manager.searchFBPhotoByPhrase(request);
        Assertions.assertEquals(12, response.getResult().size());
    }

    @Test
    void testGetFBPhotoDetails() {
        PhotoDetailsRequest request = new PhotoDetailsRequest.Builder()
                .withId("10156387925386660")
                .build();
        PhotoDetailsResponse response = manager.getFBPhotoDetails(request);
        Assertions.assertNotNull(response.getId());
    }

    @Test
    void testGetFBPhotosByAlbums() {
        PhotosByAlbumRequest request = new PhotosByAlbumRequest.Builder()
                .withQuery("a.10150833040005693")
                .withLimit(3)
                .build();
        List<PhotosByAlbumResponse> response = manager.getFBPhotosByAlbums(request);
        Assertions.assertEquals(3, response.size());
    }

    @Test
    void testGetFBPageAlbumPhotos() {
        AlbumPhotosRequest request = new AlbumPhotosRequest.Builder()
                .withQuery("441767407837")
                .withLimit(3)
                .withTimeout(110)
                .build();
        AlbumPhotosResponse response = manager.getFBPageAlbumPhotos(request);
        Assertions.assertEquals(3, response.getCount());
    }

    @Test
    void testGetFBAlbumsByPageID() {
        AlbumsByPageRequest request = new AlbumsByPageRequest.Builder()
                .withQuery("104958162837")
                .withLimit(3)
                .withTimeout(110)
                .build();
        AlbumsByPageResponse response = manager.getFBAlbumsByPageID(request);
        Assertions.assertEquals(3, response.getCount());
    }

    @Test
    void testGetFBPageEmployeesByPageID() {
        EmployeesByPageRequest request = new EmployeesByPageRequest.Builder()
                .withQuery("104958162837")
                .withLimit(12)
                .withTimeout(100)
                .build();
        EmployeesByPageResponse response = manager.getFBPageEmployeesByPageID(request);
        Assertions.assertEquals(12, response.getResult().size());
    }

    @Test
    void testSearchFBEventsByPageID() {
        EventsByPageRequest request = new EventsByPageRequest.Builder()
                .withQuery("767952000001198")
                .withType("past")
                .withLimit(3)
                .withTimeout(110)
                .build();
        EventsByPageResponse response = manager.searchFBEventsByPageID(request);
        Assertions.assertEquals(3, response.getResult().size());
    }

    @Test
    void testGetFBPagesLikedByThisPage() {
        LikedByThisPageRequest request = new LikedByThisPageRequest.Builder()
                .withQuery("98963290676")
                .withLimit(5)
                .withTimeout(100)
                .build();
        LikedByThisPageResponse response = manager.getFBPagesLikedByThisPage(request);
        Assertions.assertEquals(5, response.getResult().size());
    }

    @Test
    void testGetFbPageDetailsByPageID() {
        PageDetailsByPageRequest request = new PageDetailsByPageRequest.Builder()
                .withQuery("767952000001198")
                .build();
        PageDetailsByPageResponse response = manager.getFbPageDetailsByPageID(request);
        Assertions.assertNotNull(response);
    }

    @Test
    void testGetFBPageByName() {
        PagesByNameRequest request = new PagesByNameRequest.Builder()
                .withQuery("CAR CARes")
                .withLimit(3)
                .withTimeout(110)
                .build();
        PagesByNameResponse response = manager.getFBPageByName(request);
        Assertions.assertEquals(3, response.getResult().size());
    }

    @Test
    void testGetFBPagePhotosByPageID() {
        PhotosByPageRequest request = new PhotosByPageRequest.Builder()
                .withQuery("8195378771")
                .withLimit(100)
                .build();
        PhotosByPageResponse response = manager.getFBPagePhotosByPageID(request);
        Assertions.assertEquals(100, response.getResult().size());
    }

    @Test
    void testSearchFBPlacesByGeo() {
        PlacesByGeoRequest request = new PlacesByGeoRequest.Builder()
                .withLat(50.4127507)
                .withLon(30.5512921)
                .withDistance(1000)
                .withLimit(12)
                .build();
        PlacesByGeoResponse response = manager.searchFBPlacesByGeo(request);
        Assertions.assertEquals(12, response.getResult().size());
    }

    @Test
    void testSearchFacebookPlacesByName() {
        PlacesByNameRequest request = new PlacesByNameRequest.Builder()
                .withQuery("moscow")
                .withLimit(3)
                .build();
        PlacesByNameResponse response = manager.searchFacebookPlacesByName(request);
        Assertions.assertEquals(3, response.getResult().size());
    }

    @Test
    void testSearchFBPlacesInByPageID() {
        PlacesInByPageRequest request = new PlacesInByPageRequest.Builder()
                .withQuery("108424279189115")
                .withLimit(3)
                .withTimeout(100)
                .build();
        PlacesInByPageResponse response = manager.searchFBPlacesInByPageID(request);
        Assertions.assertEquals(3, response.getResult().size());
    }

    @Test
    void testGetFBRelatedPagesByPageID() {
        RelatedPagesByPageRequest request = new RelatedPagesByPageRequest.Builder()
                .withQuery("767952000001198")
                .withLimit(3)
                .build();
        RelatedPagesByPageResponse response = manager.getFBRelatedPagesByPageID(request);
        Assertions.assertEquals(3, response.getResult().size());
    }

    @Test
    void testGetFBPageResidentsByPageID() {
        ResidentsByPageRequest request = new ResidentsByPageRequest.Builder()
                .withQuery("104958162837")
                .withLimit(2)
                .withTimeout(100)
                .build();
        ResidentsByPageResponse response = manager.getFBPageResidentsByPageID(request);
//        Assertions.assertEquals(2, response.getResult().size());
    }

    @Test
    void testGetFacebookEventsByName() {
        EventsByNameRequest request = new EventsByNameRequest.Builder()
                .withQuery("home")
                .withLimit(3)
                .withTimeout(110)
                .build();
        EventsByNameResponse response = manager.getFacebookEventsByName(request);
        Assertions.assertEquals(3, response.getResult().size());
    }

    @Test
    void testGetFacebookPagePostsByID() {
        PagePostsByIDRequest request = new PagePostsByIDRequest.Builder()
                .withId(212919592073724L)
                .withLimit(5)
                .withTimeout(90)
                .build();
        List<PagePostsByIDResponse> response = manager.getFacebookPagePostsByID(request);
        Assertions.assertEquals(5, response.size());
    }

    // Facebook User Starts
    @Test
    void testConvertToFoursquareEntities() {
        ConvertToFoursquareEntitiesRequest request = new ConvertToFoursquareEntitiesRequest.Builder()
                .withQuery("4")
                .build();
        ConvertToFoursquareEntitiesResponse response = manager.convertToFoursquareEntities(request);
    }

    @Test
    void testGetFBInfoFromUserPageByUserID() {
        InformationFromUserPageByUserIDRequest request = new InformationFromUserPageByUserIDRequest.Builder()
                .withId(4L)
                .build();
        InformationFromUserPageByUserIDResponse response = manager.getFBInfoFromUserPageByUserID(request);
        Assertions.assertNotNull(response.getId());
    }

    @Test
    void testGetLastActivityDateByUserID() {
        LastActivityDateByUserIDRequest request = new LastActivityDateByUserIDRequest.Builder()
                .withQuery("4")
                .withTimeout(110)
                .build();
        LastActivityDateByUserIDResponse response = manager.getLastActivityDateByUserID(request);
        Assertions.assertNotNull(response);
    }

    @Test
    void testGetFBMutualFriendsByUserID() {
        MutualFriendsByUserIDRequest request = new MutualFriendsByUserIDRequest.Builder()
                .withId1(100007463349883L)
                .withId2(557543876L)
                .withLimit(100)
                .build();
        List<MutualFriendsByUserIDResponse> response = manager.getFBMutualFriendsByUserID(request);
        Assertions.assertNotNull(response);
    }

    @Test
    void testGetFBProfileNameByID() {
        ProfileNameByUserIDRequest request = new ProfileNameByUserIDRequest.Builder()
                .withQuery("4")
                .build();
        ProfileNameByUserIDResponse response = manager.getFBProfileNameByID(request);
        // Request timeout error
    }

    @Test
    void testGetFBRelationsByUserID() {
        RelationsByUserIDRequest request = new RelationsByUserIDRequest.Builder()
                .withQuery("140")
                .withLimit(3)
                .withTimeout(100)
                .build();
        RelationsByUserIDResponse response = manager.getFBRelationsByUserID(request);
        Assertions.assertEquals(3, response.getResult().size());
    }

    @Test
    void testGetFBRelativesByUserID() {
        RelativesByUserIDRequest request = new RelativesByUserIDRequest.Builder()
                .withQuery("140")
                .withLimit(3)
                .withTimeout(110)
                .build();
        RelativesByUserIDResponse response = manager.getFBRelativesByUserID(request);
        Assertions.assertEquals(3, response.getResult().size());
    }

    @Test
    void testGetFBUserByEmail() {
        UserByEmailRequest request = new UserByEmailRequest.Builder()
                .withQuery("aleinovaov@mail.ru")
                .build();
        UserByEmailResponse response = manager.getFBUserByEmail(request);
        Assertions.assertNotNull(response);
    }

    @Test
    void testGetFBUserCoWorkersByUserIDV2() {
        UserCoWorkersByUserIDV2Request request = new UserCoWorkersByUserIDV2Request.Builder()
                .withQuery("4")
                .withLimit(3)
                .withTimeout(110)
                .withDelayed(0)
                .withTaskTimeout(600)
                .build();
        UserCoWorkersByUserIDV2Response response = manager.getFBUserCoWorkersByUserIDV2(request);
        Assertions.assertEquals(3, response.getResult().size());
    }
}
