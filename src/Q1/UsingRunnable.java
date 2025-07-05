package Q1;

public class UsingRunnable {
    public static void main(String[] args) throws InterruptedException {
        // We need to have a final or effectively final variable to use inside lamba and get a return from a Runnable Thread.
        StringBuilder sb = new StringBuilder();

        // Runnable does not return a value and the run() method has return type void.
        Thread t = new Thread(() -> {
            System.out.println("Runnable Task Running");
            sb.append("Hello World!");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("Runnable Task Ending");
        });
        t.start();
        t.join();
        System.out.println(sb);
    }
}