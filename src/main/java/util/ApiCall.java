package util;

import model.facebook.video.FacebookVideoV2Request;

import java.util.HashMap;
import java.util.Map;

public class ApiCall {

    private static final Map<Object, Object> map = new HashMap<>();

    static {
        map.put("FacebookVideoV2Request.Builder().build()", "String");
    }
}
