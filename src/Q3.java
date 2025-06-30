//Use Of method to create List, Set and Map

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Q3 {
    public static void main(String[] args) {

        System.out.println("Map using Map.of():");
        Map<Integer, String> daysMap = Map.of(1, "Monday", 2, "Tuesday", 3, "Wednesday", 4, "Thursday", 5, "Friday", 6, "Saturday", 7, "Sunday");
        System.out.println(daysMap);
        System.out.println();

        System.out.println("List using List.of():");
        List<String> daysList = List.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday");
        System.out.println(daysList);
        System.out.println();

        System.out.println("Set using Set.of():");
//        adding duplicate element doesn't work and throws error
//        Set<String> daysSet = Set.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday", "Monday", "Sunday");
        Set<String> daysSet = Set.of("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
        System.out.println(daysSet);
    }
}
