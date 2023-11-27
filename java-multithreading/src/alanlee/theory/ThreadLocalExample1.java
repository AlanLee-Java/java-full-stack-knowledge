package alanlee.theory;

/**
 * ThreadLocal理解
 * 每个 Thread 都有一个 ThreadLocal.ThreadLocalMap 对象，Thread 类中就定义了 ThreadLocal.ThreadLocalMap 成员。
 *
 * @author AlanLee
 * @date 2022-11-11
 */
public class ThreadLocalExample1 {

    public static void main(String[] args) {
        ThreadLocal threadLocal1 = new ThreadLocal();
        ThreadLocal threadLocal2 = new ThreadLocal();
        Thread thread1 = new Thread(() -> {
            threadLocal1.set(1);
            threadLocal2.set(1);
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal1.get());
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal2.get());
        });
        Thread thread2 = new Thread(() -> {
            threadLocal1.set(2);
            threadLocal2.set(2);
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal1.get());
            System.out.println(Thread.currentThread().getName() + ":" + threadLocal2.get());
        });
        thread1.start();
        thread2.start();
    }

}