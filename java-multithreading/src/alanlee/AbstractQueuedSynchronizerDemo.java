package alanlee;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class AbstractQueuedSynchronizerDemo {

    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        MyThread5 t1 = new MyThread5("t1", lock);
        MyThread5 t2 = new MyThread5("t2", lock);
        t1.start();
        t2.start();
    }

}

class MyThread5 extends Thread {

    private Lock lock;

    public MyThread5(String name, Lock lock) {
        super(name);
        this.lock = lock;
    }

    public void run() {
        lock.lock();
        try {
            System.out.println(Thread.currentThread() + " running");
        } finally {
            lock.unlock();
        }
    }

}