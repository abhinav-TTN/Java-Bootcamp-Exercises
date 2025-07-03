package Q1;

public class UsingRunnableClass implements Runnable{
    @Override
    public void run() {
        System.out.println("Sleeping RunnableClass thread");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("RunnableClass interrupted");
        }
        System.out.println("RunnableClass resumed");
    }
}
