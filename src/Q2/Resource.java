package Q2;

import java.util.concurrent.locks.ReentrantLock;

class Resource {
    String name;
    // Reentrant lock to resolve deadlock
    final ReentrantLock lock = new ReentrantLock();

    public Resource(String name) {
        this.name = name;
    }
}

