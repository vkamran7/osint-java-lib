package util;

import model.facebook.video.request.FacebookVideoByGeoRequest;
import model.facebook.video.request.FacebookVideoDetailsRequest;
import model.facebook.video.request.FacebookVideoV2Request;
import model.facebook.video.response.FacebookVideoByGeoResponse;
import model.facebook.video.response.FacebookVideoDetailsResponse;
import model.facebook.video.response.FacebookVideoV2Response;

public class Helper {

    public static Object getClass(Object request) {
        if (request instanceof FacebookVideoV2Request) {
            return new FacebookVideoV2Response();
        } else if (request instanceof FacebookVideoByGeoRequest) {
            return new FacebookVideoByGeoResponse();
        } else if (request instanceof FacebookVideoDetailsRequest) {
            return new FacebookVideoDetailsResponse();
        }
        return null;
    }
}
