import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Q3 {
    public static void main(String[] args) throws InterruptedException {
        // Creating thread Executors
        ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor();
        ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        ExecutorService fixedThreadPool = Executors.newFixedThreadPool(3);

        // Creating list of 3 tasks of Callable type
        List<Callable<String>> taskList = new ArrayList<>();

        taskList.add(() -> {
            System.out.println("Task 1 running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 1 finished");
            return "Finished";
        });
        taskList.add(() -> {
            System.out.println("Task 2 running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 2 finished");
            return "Finished";
        });
        taskList.add(() -> {
            System.out.println("Task 3 running");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Task 3 finished");
            return "Finished";
        });

        // Using invokeAll() to execute tasks using a Collection of Callables
        System.out.println("----Tasks ran by singleThreadExecutor----");
        singleThreadExecutor.invokeAll(taskList);
        System.out.println("----Tasks ran by cachedThreadPool----");
        cachedThreadPool.invokeAll(taskList);
        System.out.println("----Tasks ran by fixedThreadPool----");
        fixedThreadPool.invokeAll(taskList);

        // shutting down all executors
        singleThreadExecutor.shutdown();
        cachedThreadPool.shutdown();
        fixedThreadPool.shutdown();
    }
}
