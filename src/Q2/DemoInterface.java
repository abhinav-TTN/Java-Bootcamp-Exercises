package Q2;

import java.time.Instant;
import java.util.Date;

public interface DemoInterface {
    default void showName(String name) {
        System.out.println("Hello " + name);
    }

    static Date showDate() {
        return Date.from(Instant.now());
    }
}
