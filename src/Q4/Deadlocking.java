package Q4;

public class Deadlocking {
    public static void main(String[] args) throws InterruptedException {
        // Two resources to create deadlock
        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");

        Thread t1 = new Thread(() -> {
            // Thread 1 locks r1 and tries to acquire r2 without releasing r1
            synchronized (r1) {
                System.out.println(r1.name);

                // pausing thread so that t2 locks r2 before t1 tries acquires it
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (r2) {
                    System.out.println(r2.name);
                }
            }
        });
        Thread t2 = new Thread(() -> {
            // Thread 2 locks r2 and tries to acquire r1 without releasing r2
            synchronized (r2) {
                System.out.println(r2.name);

                // pausing thread so that t1 locks r1 before t2 tries acquires it
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (r1) {
                    System.out.println(r1.name);
                }
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
