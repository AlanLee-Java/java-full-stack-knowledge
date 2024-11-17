package alanlee.basics;

/**
 * 实现 Runnable 接口
 * 需要实现 run() 方法。
 * 通过 Thread 调用 start() 方法来启动线程。
 *
 * @author AlanLee
 * @date 2022-11-11
 */
public class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello Runnable");
    }

    public static void main(String[] args) {
        MyRunnable instance = new MyRunnable();
        Thread thread = new Thread(instance);
        thread.start();
    }

}