package maltego.rx;

import model.facebook.FacebookVideoV2Response;

public class MaltegoApp {
    public static void main(String[] args) {
        MaltegoServiceManager manager = new MaltegoServiceManager();
        FacebookVideoV2Response response = manager.getV2Response("ronaldo", 5);
        System.out.println(response);
    }
}
