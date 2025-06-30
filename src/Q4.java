//Create Unmodifiable List from a Stream

import java.util.List;
import java.util.stream.Stream;

public class Q4 {
    public static void main(String[] args) {

        List<Integer> list = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
                                    .toList();
        System.out.println(list);
    }
}
