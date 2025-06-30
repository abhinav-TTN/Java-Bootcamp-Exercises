//Q2) Convert an Optional type into Stream

import java.util.Optional;

public class Q2 {
    public static void main(String[] args) {


        Optional.of("Abhinav")
                .stream()
                .filter(s -> s.equals("Abhinav"))
//                .filter(s -> s.equals("Abhi"))
                .findFirst()
                .or(()-> Optional.of("No Name"))
                .ifPresentOrElse(System.out::println, ()-> System.out.println("No Name Provided"));

    }
}
