package util;

import model.facebook.video.*;

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
