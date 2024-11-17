package alanlee.basics;

/**
 * 继承 Thread 类
 * 同样也是需要实现 run() 方法，因为 Thread 类也实现了 Runable 接口
 * 当调用 start() 方法启动一个线程时，虚拟机会将该线程放入就绪队列中等待被调度，当一个线程被调度时会执行该线程的 run() 方法。
 *
 * @author AlanLee
 * @date 2022-11-11
 */
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("Hello Thread");
    }

    public static void main(String[] args) {
        MyThread mt = new MyThread();
        mt.start();
    }

}