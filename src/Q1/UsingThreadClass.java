package Q1;

public class UsingThreadClass extends Thread{
    @Override
    public void run() {
        System.out.println("Sleeping UsingThreadClass thread");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("UsingThreadClass interrupted");
        }
        System.out.println("UsingThreadClass resumed");
    }
}
