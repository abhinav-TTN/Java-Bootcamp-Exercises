package Q4;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        User u1 = new User("Abhinav", Optional.of("abhinav.chaudhary@tothenew.com"));
        User u2 = new User("Arun", Optional.empty());

        System.out.println(u1);
        System.out.println(u2);

        /*
        Output :-
        User{name='Abhinav', mail=abhinav.chaudhary@tothenew.com}
        User{name='Arun', mail=No mail provided}
         */
    }
}
