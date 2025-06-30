//Use iterator stream method to generate a stream

import java.util.stream.Stream;

public class Q1 {
    public static void main(String[] args) {
        System.out.println("Even numbers between 0 and 10 are:");
        Stream.iterate(0, i -> i <= 10, i -> i+2)
                .forEach(System.out::println);
    }
}
