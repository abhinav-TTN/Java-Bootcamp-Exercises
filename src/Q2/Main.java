// Q2) Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create and apply multiplication method for
// the functional interface created
package Q2;

public class Main {

    public static void main(String[] args) {
        // Object of class that contains operations
        Calculations calculations = new Calculations();

        // Instance Method Reference
        Operation addition = calculations::add;
        Operation subtraction = calculations::sub;
        // Static Method Reference
        Operation multiplication = Calculations::multiply;

        System.out.println("Adding: " + addition.calculate(10,5));
        System.out.println("Subtracting: " + subtraction.calculate(10,5));
        System.out.println("Multiplying: " + multiplication.calculate(10,5));
    }
}
