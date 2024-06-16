package singleton;

import java.util.Objects;

public class Singleton {
    private static Singleton instance;
    private String value;

    private Singleton(String value) {
        this.value = value;
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton("https://app.serverDaVinci:5033/DV_V2");
        }
        return instance;
    }

}
