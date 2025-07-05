//Q5) WAP to showcase the difference between shutdown() and shutdownNow().
import java.util.concurrent.*;

public class Q5 {
    public static void main(String[] args) throws InterruptedException {

        System.out.println("---Using shutdown()---");
        ExecutorService executor1 = Executors.newFixedThreadPool(3);
        // creating 3 tasks and submitting to executor
        for (int i = 0; i < 3; i++) {
            final int id = i;
            executor1.submit(() -> {
                try {
                    System.out.println("Task " + id + " started");
                    Thread.sleep(1000);
                    System.out.println("Task " + id + " completed");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        // shutdowns after all previously submitted tasks are executed and doesn't take any more tasks
        executor1.shutdown();
        // Waits this all tasks finish
        executor1.awaitTermination(15, TimeUnit.SECONDS);


        System.out.println("---Using shutdownNow()---");
        ExecutorService executor2 = Executors.newFixedThreadPool(3);
        // creating 3 tasks and submitting to executor
        for (int i = 0; i < 3; i++) {
            final int id = i;
            executor2.submit(() -> {
                try {
                    System.out.println("Task " + id + " started");
                    Thread.sleep(1000);
                    System.out.println("Task " + id + " completed");
                } catch (InterruptedException e) {
                    // handling exception when interrupted by shutdownNow()
                    System.out.println("Task " + id + " was interrupted");
                }
            });
        }
        // interrupts all running tasks immediately and shutdowns executor
        executor2.shutdownNow();
        executor2.awaitTermination(15,TimeUnit.SECONDS);
    }
}
