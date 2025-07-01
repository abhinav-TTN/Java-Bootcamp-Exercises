package Q2;

public class Main {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(123L, "abhinav", 12);
            Student s2 = new Student(null, "abhinav", 12);
            System.out.println(s1);
            System.out.println(s2);
        }
        catch (NullPointerException e) {
            System.out.println("Null provided to object.");
        }
    }
}
