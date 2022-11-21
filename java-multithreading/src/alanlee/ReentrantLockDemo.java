package alanlee;

import java.util.function.Consumer;

public class ReentrantLockDemo {
    public static void main(String[] args) throws InterruptedException {
        Depot depot = new Depot(500);
        new Producer1(depot).produce(500);
        new Producer1(depot).produce(200);
        new Consumer1(depot).consume(500);
        new Consumer1(depot).consume(200);
    }
}

class Consumer1 {
    private Depot depot;

    public Consumer1(Depot depot) {
        this.depot = depot;
    }

    public void consume(int no) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                depot.consume(no);
            }
        }, no + " consume thread").start();
    }
}

class Producer1 {

    private Depot depot;

    public Producer1(Depot depot) {
        this.depot = depot;
    }

    public void produce(int no) {

        new Thread(new Runnable() {

            @Override
            public void run() {
                depot.produce(no);
            }
        }, no + " produce thread").start();
    }

}