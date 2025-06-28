package Q4;

import java.util.Optional;

public class User {
    private String name;
    private Optional<String> mail;

    public User(String name, Optional<String> mail) {
        this.name = name;
        this.mail = mail;
    }

    public String getName() {
        return name;
    }

    public Optional<String> getMail() {
        return mail;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", mail=" + mail.orElse("No mail provided") +
                '}';
    }
}
