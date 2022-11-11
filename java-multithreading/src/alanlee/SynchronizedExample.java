package alanlee;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 同步一个代码块
 *
 * @author AlanLee
 * @date 2022-11-11
 */
public class SynchronizedExample {

    public void func1() {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        /*SynchronizedExample e1 = new SynchronizedExample();
        executorService.execute(() -> e1.func1());
        executorService.execute(() -> e1.func1());*/

        SynchronizedExample e11 = new SynchronizedExample();
        SynchronizedExample e22 = new SynchronizedExample();
        executorService.execute(() -> e11.func1());
        executorService.execute(() -> e22.func1());
    }

}