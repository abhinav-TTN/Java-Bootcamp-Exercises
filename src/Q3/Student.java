package Q3;

import java.util.Objects;

public record Student(Long id, String name, Integer standard) {
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Student student)) return false;
        return id.equals(student.id) && name.equals(student.name) && standard.equals(student.standard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, standard);
    }
}
