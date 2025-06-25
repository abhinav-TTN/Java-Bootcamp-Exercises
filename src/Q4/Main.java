package Q4;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Abhinav", 21, "Trainee");
        Employee e2 = new Employee("Mohit", 24, "Software Engineer");
        Employee e3 = new Employee("Neha", 29, "Associate Technical Lead");
        Employee e4 = new Employee("Animesh", 21, "Trainee");

        HashMap<Employee, Integer> salaryMap = new HashMap<>();
        salaryMap.putIfAbsent(e1, 10000);
        salaryMap.putIfAbsent(e2, 20000);
        salaryMap.putIfAbsent(e3, 30000);
        salaryMap.putIfAbsent(e4, 10000);

        for(Map.Entry<Employee, Integer> entry : salaryMap.entrySet()) {
            System.out.println(entry.getKey() + ": Salary= " + entry.getValue());
        }
    }
}
