package alanlee;

import java.util.concurrent.locks.LockSupport;

/**
 * 中断响应
 * @author AlanLee
 * @date 2022-11-15
 */
public class InterruptDemo {

    public static void main(String[] args) {
        MyThread4 myThread = new MyThread4(Thread.currentThread());
        myThread.start();
        System.out.println("before park");
        // 获取许可
        LockSupport.park("ParkAndUnparkDemo");
        System.out.println("after park");
    }

}

class MyThread4 extends Thread {

    private Object object;

    public MyThread4(Object object) {
        this.object = object;
    }

    public void run() {
        System.out.println("before interrupt");
        try {
            // 休眠3s
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread = (Thread) object;
        // 中断线程
        thread.interrupt();
        System.out.println("after interrupt");
    }

}