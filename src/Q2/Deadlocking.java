//Q2) Improve the code written in Basics of Multi Threading Part 1 exercise question 4 to handle the deadlock using reentrant lock.
package Q2;

import java.util.concurrent.TimeUnit;

public class Deadlocking {
    public static void main(String[] args) throws InterruptedException {
        Resource r1 = new Resource("Resource 1");
        Resource r2 = new Resource("Resource 2");

        Thread t1 = new Thread(() -> {
//            -----Old Code-----
//            synchronized (r1) {
//                System.out.println(r1.name);
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                synchronized (r2) {
//                    System.out.println(r2.name);
//                }
//            }
//            ------------------

            try {
                // t1 tries to lock r1 and succeeds
                if (r1.lock.tryLock()) {
                    System.out.println("Thread 1 has: " + r1.name);
                    Thread.sleep(100);

                    // t1 waits longer than t2 so that it can acquire r2 after t2 releases it
                    if (r2.lock.tryLock(5, TimeUnit.SECONDS)) {
                        System.out.println("Thread 1 has: " + r2.name);
                        r2.lock.unlock();
                    } else {
                        System.out.println("Thread 1 could not get " + r2.name);
                    }
                }
                // releases r1 lock after completing its task
                r1.lock.unlock();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        Thread t2 = new Thread(() -> {
//            -----Old Code-----
//            synchronized (r2) {
//                System.out.println(r2.name);
//                try {
//                    Thread.sleep(100);
//                } catch (InterruptedException e) {
//                    throw new RuntimeException(e);
//                }
//                synchronized (r1) {
//                    System.out.println(r1.name);
//                }
//            }
//            ------------------

            try {
                if (r2.lock.tryLock()) {
                    System.out.println("Thread 2 has: " + r2.name);
                    Thread.sleep(100);

                    // waits shorter than t1 and releases the lock before so that t1 can acquire it
                    if (r1.lock.tryLock(2, TimeUnit.SECONDS)) {
                        System.out.println("Thread 2 has: " + r1.name);
                        r1.lock.unlock();
                    } else {
                        System.out.println("Thread 2 could not get " + r1.name);
                    }
                }
                r2.lock.unlock();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        t1.start();
        t2.start();
        t1.join();
        t2.join();
    }
}
