//Q4) WAP to return a random integer value from a thread execution using Future.
import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Q4 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newSingleThreadExecutor();
        Future<Integer> returnValue= ex.submit(()->{
            Integer i;
            System.out.println("Callable task running");
            try {
                i = new Random().nextInt(1000);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Callable task finished");
            return i;
        });
        System.out.println("Thread returned: "+returnValue.get());
        ex.shutdown();
    }
}