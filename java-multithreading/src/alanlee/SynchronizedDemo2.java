package alanlee;

/**
 * Synchronized原理分析
 * 加锁和释放锁的原理
 *
 * @author AlanLee
 * @date 2022-11-13
 */
public class SynchronizedDemo2 {

    Object object = new Object();

    public void method1() {
        synchronized (object) {

        }
        method2();
    }

    private static void method2() {

    }

    public static void main(String[] args) {
        SynchronizedDemo2 synchronizedDemo2 = new SynchronizedDemo2();
        synchronizedDemo2.method1();
    }

}