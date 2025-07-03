//Q2) Use Synchronize method and synchronize block to enable synchronization between multiple threads trying to access method at same time.
public class Q2 {
    private int val = 10;

    synchronized void increment() {
        val++;
    }

    void decrement() {
        synchronized (this) {
            val--;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Q2 q2 = new Q2();

        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                q2.increment();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                q2.decrement();
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(q2.val);
    }
}