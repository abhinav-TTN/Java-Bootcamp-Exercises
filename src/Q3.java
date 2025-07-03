//Q3) WAP to showcase the usage of volatile in java.
import java.util.Scanner;

public class Q3 {
    // condition for the thread to execute its loop in a volatile variable
    volatile static boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        // Thread that runs based on flag and goes to sleep for 1 second until the loop stops
        Thread t1 = new Thread(() -> {
            System.out.println("---Task started---");
            while (flag) {
                try {
                    System.out.println("Thread Sleeping");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println("---Task stopped---");
        });

        t1.start();
        // this line pauses the main thread for the user input. when user presses 'enter' on the command line the main thread resumes execution.
        new Scanner(System.in).nextLine();
        // setting flag to false
        flag = false;
        t1.join();
    }
}