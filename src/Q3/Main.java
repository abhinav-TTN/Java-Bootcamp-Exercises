//Q3) Use equal and hashCode methods with Student records
package Q3;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(123L, "Abhinav", 12);
        Student s2 = new Student(123L, "Abhinav", 12);
        Student s3 = new Student(345L, "Abhi", 11);

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
    }
}
