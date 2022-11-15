package alanlee;

/**
 * 使用wait/notify实现线程同步
 * @author AlanLee
 * @date 2022-11-15
 */
public class WaitAndNotifyDemo {

    public static void main(String[] args) {
        MyThread1 myThread = new MyThread1();
        synchronized (myThread) {
            try {
                myThread.start();
                // 主线程睡眠3s
                Thread.sleep(3000);
                System.out.println("before wait");
                // 阻塞主线程
                myThread.wait();
                System.out.println("after wait");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}

class MyThread1 extends Thread {

    public void run() {
        synchronized (this) {
            System.out.println("before notify");
            notify();
            System.out.println("after notify");
        }
    }

}