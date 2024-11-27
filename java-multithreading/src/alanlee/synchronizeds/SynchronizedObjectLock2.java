package alanlee.synchronizeds;

/**
 * 方法锁形式：synchronized修饰普通方法，锁对象默认为this
 *
 * @author AlanLee
 * @date 2022-11-13
 */
public class SynchronizedObjectLock2 implements Runnable {

    static SynchronizedObjectLock2 instence = new SynchronizedObjectLock2();

    @Override
    public void run() {
        method();
    }

    public synchronized void method() {
        System.out.println("我是线程" + Thread.currentThread().getName());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + "结束");
    }

    public static void main(String[] args) {
        Thread t1 = new Thread(instence);
        Thread t2 = new Thread(instence);
        t1.start();
        t2.start();
    }

}