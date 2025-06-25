package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(21,10000.0, "Abhinav Chaudhary"));
        list.add(new Employee(32, 60000.0, "Alice Brown"));
        list.add(new Employee(25, 55000.0, "John Adams"));
        list.add(new Employee(30, 52000.0, "Alice Davis"));

        System.out.println("Sorting using natural order(comparable interface):");
        Collections.sort(list);
        for(Employee e : list) {
            System.out.println(e);
        }

        System.out.println("\nSorting based on salary(comparator interface):");
        Collections.sort(list, new SalaryComparator());
        for (Employee e : list) {
            System.out.println(e);
        }
    }

}
