//Implement following functional interfaces from java.util.function using lambdas: 1. Consumer 2. Supplier 3. Predicate 4. Function

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Q1 {
    public static void main(String[] args) {
        // Consumer to print name.
        Consumer<String> displayName = str -> System.out.println("Hi "+str);

        // Supplier to get name
        Supplier<String> getName = () -> "Abhinav Chaudhary";

        // Predicate to check if input is negative
        Predicate<Integer> isNegative = i -> i<0;

        // Function to return ASCII code of input character
        Function<Character, Integer> getAscii = c -> (int) c;

        displayName.accept("Abhinav");
        System.out.println(getName.get());
        System.out.println(isNegative.test(12));
        System.out.println(getAscii.apply('T'));
    }
}
