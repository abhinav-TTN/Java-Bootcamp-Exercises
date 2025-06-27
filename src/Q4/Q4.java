package Q4;

import java.util.function.Function;

//interface UserFactory {
//    User apply(String name);
//}

public class Q4 {

    public static void main(String[] args) {
//        UserFactory getUser = User::new;
        Function<String, User> newUser = User::new;
        User u1 = newUser.apply("Abhinav");
        User u2 = newUser.apply("Ajay");
        User u3 = newUser.apply("Vijay");

        System.out.print(u1);
        System.out.print(u2);
        System.out.print(u3);
    }
}
