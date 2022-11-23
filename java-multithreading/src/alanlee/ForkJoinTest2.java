package alanlee;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

/**
 * 实现斐波那契数列
 *
 * @author AlanLee
 * @date 2022-11-23
 */
public class ForkJoinTest2 {

    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(4); // 最大并发数4
        Fibonacci fibonacci = new Fibonacci(20);
        long startTime = System.currentTimeMillis();
        Integer result = forkJoinPool.invoke(fibonacci);
        long endTime = System.currentTimeMillis();
        System.out.println("Fork/join sum: " + result + " in " + (endTime - startTime) + " ms.");
    }

    //以下为官方API文档示例
    static class Fibonacci extends RecursiveTask<Integer> {

        final int n;

        Fibonacci(int n) {
            this.n = n;
        }

        @Override
        protected Integer compute() {
            if (n <= 1) {
                return n;
            }
            Fibonacci f1 = new Fibonacci(n - 1);
            f1.fork();
            Fibonacci f2 = new Fibonacci(n - 2);
            return f2.compute() + f1.join();
        }
    }

}