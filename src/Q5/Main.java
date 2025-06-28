package Q5;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Raj Kumar Sharma", 4000L, "Delhi"),
                new Employee("Amit Verma", 6000L, "Delhi"),
                new Employee("Sita Devi", 4500L, "Delhi"),
                new Employee("Raj Singh", 4800L, "Delhi"),
                new Employee("Rina Roy", 4900L, "Mumbai"),
                new Employee("Sita Rani", 4300L, "Delhi")
        );

        List<String> uniqueFirstNames = employees.stream()
                .filter(e -> e.salary < 5000 && e.city.equalsIgnoreCase("Delhi"))
                .map(e -> e.fullName.split(" ")[0])
                .distinct()
                .toList();

        System.out.println(uniqueFirstNames);
    }
}
