/*Q3) Write a java program to show following menu to the user:
*******Menu*******
1. Calculate Area of Circle
2. Calculate Circumference of a Circle
3. Exit.
Choose an option (1-3):
Take radius as user input. Hint: Use Switch statement to act on the menu. Also area and circumference methods should be static
*/

import java.util.Scanner;
public class Q3 {
    static double PI = 3.14;

    public static double getRadius() {
        System.out.println("Enter radius of Circle:");
        Scanner sc = new Scanner(System.in);
        return sc.nextDouble();
    }

    public static double calcArea(double r) {
        return PI*r*r;
    }

    public static double calcCircum(double r) {
        return 2*PI*r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                *******Menu*******
                1. Calculate Area of Circle
                2. Calculate Circumference of a Circle
                3. Exit
                ******************
                
                Choose an option (1-3):""");
        int opt = sc.nextInt();

        switch (opt) {
            case 1 : {
                double rad = getRadius();
                System.out.println("Area of circle: " + calcArea(rad));
                break;
            }
            case 2 : {
                double rad = getRadius();
                System.out.println("Circumference of circle: " + calcCircum(rad));
                break;
            }
            case 3 : {
                System.out.println("Goodbye!");
                System.exit(0);
            }
            default : {
                System.out.println("Invalid option!");
                break;
            }
        }

    }
}
