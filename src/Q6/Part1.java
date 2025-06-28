package Q6;

import java.time.LocalDate;
import java.util.Scanner;

public class Part1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first date in yyyy-mm-dd format: ");
        String d1 = sc.nextLine();

        System.out.println("Enter second date in yyyy-mm-dd format: ");
        String d2 = sc.nextLine();

        LocalDate date1 = LocalDate.parse(d1);
        LocalDate date2 = LocalDate.parse(d2);

        if (date1.isBefore(date2)) {
            System.out.println("First date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("First date is after the second date.");
        } else {
            System.out.println("Both dates are the same.");
        }
    }
}
