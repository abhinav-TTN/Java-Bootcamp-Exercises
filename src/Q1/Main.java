//Q1) Create and Run a Thread using Runnable Interface and Thread class and show usage of sleep and join methods in the created threads.
package Q1;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new UsingRunnableClass());
        UsingThreadClass t2 = new UsingThreadClass();

        System.out.println("Main Thread start.\n");
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("\nMain Thread end.");
    }
}
