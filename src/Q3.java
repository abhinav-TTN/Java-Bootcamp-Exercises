import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Q3 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15);

        // summing using reduce method
        Integer sum = list.stream()
                .filter(integer -> integer > 5)
                .reduce(0, (a, b) -> a + b);

        // summing by mapping Stream to IntStream and using sum method
//        int sum = list.stream()
//                .filter(i -> i > 5)
//                .mapToInt(Integer::intValue)
//                .sum();

        System.out.println("Sum of integers greater than 5 = " + sum);
    }
}
