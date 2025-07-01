package Q2;

import java.util.Objects;

public record Student(Long id, String name, Integer standard) {
    public Student {
        Objects.requireNonNull(id);
        Objects.requireNonNull(name);
        Objects.requireNonNull(standard);
    }
}
