package alanlee;

import java.util.concurrent.ConcurrentHashMap;

/**
 * 斐波那契数列
 *
 * @author AlanLee
 * @date 2022-12-11
 */
public class TestLocalCache {

    private static ConcurrentHashMap<Integer, Long> cache = new ConcurrentHashMap<>();

    static long fibonacci(int i) {
        if (i == 0)
            return i;

        if (i == 1)
            return 1;

        return cache.computeIfAbsent(i, (key) -> {
            System.out.println("Slow calculation of " + key);

            return fibonacci(i - 2) + fibonacci(i - 1);
        });
    }

    public static void main(String[] args) {
        // warm up
        for (int i = 0; i < 101; i++) {
            System.out.println(
                    "f(" + i + ") = " + fibonacci(i));
        }

        // read -> cal
        long current = System.currentTimeMillis();
        System.out.println(fibonacci(100));
        System.out.println(System.currentTimeMillis() - current);
    }

}