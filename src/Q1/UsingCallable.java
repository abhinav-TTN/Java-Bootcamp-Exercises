package Q1;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class UsingCallable {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(1);

        Future<Integer> returnedFuture = executorService.submit(() -> {
            System.out.println("Callable Task running");
            Integer returnValue;

            try {
                Thread.sleep(1000);
                returnValue = new Random().nextInt(100);
            } catch (InterruptedException e) {
                throw new InterruptedException(e.getMessage());
            }

            System.out.println("Callable Task completed");
            return returnValue;
        });

        System.out.println("Callable Task returned value: " + returnedFuture.get());
        executorService.shutdown();
    }
}
