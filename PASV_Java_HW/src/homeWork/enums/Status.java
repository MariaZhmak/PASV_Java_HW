package homeWork.enums;

import java.security.PublicKey;
import java.util.Arrays;

public enum Status {
    ACTIVE,
    INACTIVE;

    public static Status getStatus(String status) {
        return Arrays.stream(Status.values())
                .filter(fl -> fl.name().equals(status))
                .findFirst()
                .orElse(null);
    }

}
