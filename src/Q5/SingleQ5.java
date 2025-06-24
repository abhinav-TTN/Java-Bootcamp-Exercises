//Write a program to show application of Singleton Design Pattern.
package Q5;

public class SingleQ5 {
    private static SingleQ5 instance;

    private SingleQ5() {
        System.out.println("Singleton created once.");
    }

    public static SingleQ5 getInstance() {
        if(instance == null) {
            instance = new SingleQ5();
            return instance;
        }
        return instance;
    }

    public void print(String message) {
        System.out.println("Printing: "+ message);
    }
}
