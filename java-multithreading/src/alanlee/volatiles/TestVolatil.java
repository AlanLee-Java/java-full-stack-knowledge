package alanlee.volatiles;

import java.util.concurrent.TimeUnit;

/**
 * Thread A一直在loop, 因为Thread A 由于可见性原因看不到Thread Main 已经修改stop的值
 */
public class TestVolatil {

    /**
     * volatile之后可以保证可见性
     */
    private static volatile boolean stop = false;

    public static void main(String[] args) {
        // Thread-A
        new Thread("Thread A") {
            @Override
            public void run() {
                while (!stop) {
                }
                System.out.println(Thread.currentThread() + " stopped");
            }
        }.start();

        // Thread-main
        try {
            TimeUnit.SECONDS.sleep(1);
            System.out.println(Thread.currentThread() + " after 1 seconds");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        stop = true;
    }

}