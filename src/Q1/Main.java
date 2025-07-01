//Q1) Create a Record for the Student with the following Fields: id name standard
package Q1;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(123L, "Abhinav", 12);
        Student student2 = new Student(456L, "Ajay", 11);
        System.out.println(student1);
        System.out.println(student2);

    }
}
