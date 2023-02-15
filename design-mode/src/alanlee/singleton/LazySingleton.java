package alanlee.singleton;

/**
 * 懒汉式-线程不安全
 * @author AlanLee
 * @date 2023-02-15
 *
 */
public class LazySingleton {

    private static LazySingleton uniqueInstance;

    private LazySingleton() {
    }

    public static LazySingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton();
        }
        return uniqueInstance;
    }

}