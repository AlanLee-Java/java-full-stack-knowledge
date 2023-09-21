package alanlee;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 同步一个类
 *
 * @author AlanLee
 * @date 2022-11-11
 */
public class SynchronizedExample1 {

    public void func2() {
        synchronized (SynchronizedExample1.class) {
            for (int i = 0; i < 100; i++) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        SynchronizedExample1 e1 = new SynchronizedExample1();
        SynchronizedExample1 e2 = new SynchronizedExample1();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> e1.func2());
        executorService.execute(() -> e2.func2());
    }

}