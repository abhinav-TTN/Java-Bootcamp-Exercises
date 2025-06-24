//Write a program to show application of Singleton Design Pattern.
package Q5;

public class SingleQ5 {
    private static int value;
    private static SingleQ5 instance = null;
    
    private SingleQ5() {
        value = 0;
    }
    private SingleQ5(int value) {
        SingleQ5.value = value;
    }
    
    public SingleQ5 getInstance() {
        if(instance == null) {
            return new SingleQ5();
        }
        return instance;
    }
}
