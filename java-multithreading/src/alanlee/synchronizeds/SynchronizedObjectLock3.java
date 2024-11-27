package alanlee.synchronizeds;

/**
 * 类锁
 * 指synchronize修饰静态的方法或指定锁对象为Class对象
 *
 * @author AlanLee
 * @date 2022-11-13
 */
public class SynchronizedObjectLock3 implements Runnable {

    static SynchronizedObjectLock3 instence1 = new SynchronizedObjectLock3();
    static SynchronizedObjectLock3 instence2 = new SynchronizedObjectLock3();

    @Override
    public void run() {
        method();
    }

    // synchronized用在普通方法上，默认的锁就是this，当前实例
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
        // t1和t2对应的this是两个不同的实例，所以代码不会串行，会并行
        Thread t1 = new Thread(instence1);
        Thread t2 = new Thread(instence2);
        t1.start();
        t2.start();
    }

}