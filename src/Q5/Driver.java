package Q5;

public class Driver {
    public static void main(String[] args) {
        System.out.println("Getting Singleton instance first time:");
        final SingleQ5 single_obj = SingleQ5.getInstance();
        single_obj.print("First instance method call");
        System.out.println("Getting Singleton instance second time:");
        final SingleQ5 single_obj2 = SingleQ5.getInstance();
        single_obj2.print("Second instance method call");
    }
}
