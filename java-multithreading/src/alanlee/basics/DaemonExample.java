package alanlee.basics;

/**
 * 守护线程是程序运行时在后台提供服务的线程，不属于程序中不可或缺的部分。
 * 当所有非守护线程结束时，程序也就终止，同时会杀死所有守护线程。
 * main() 属于非守护线程。 使用 setDaemon() 方法将一个线程设置为守护线程。
 *
 * @author AlanLee
 * @date 2022-11-11
 */
public class DaemonExample {

    public static void main(String[] args) {
        Thread thread = new Thread(new MyRunnable());
        thread.setDaemon(true);
    }

}