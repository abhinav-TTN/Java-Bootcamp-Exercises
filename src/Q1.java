// Q1- Write a class with FirstName, LastName & age field. Print Firstname, LastName & age using static block, static method & static variable respectively.

public class Q1 {

    static String firstName = "Abhinav";
    static String lastName = "Chaudhary";
    static int age = 21;

    static {
        System.out.println("Print from static block: "+firstName);
    }

    static void printLastName() {
        System.out.println("Print from static function: "+lastName);
    }

    public static void main(String[] args) {
        printLastName();
        System.out.println("Print using static variable: "+age);
    }
}