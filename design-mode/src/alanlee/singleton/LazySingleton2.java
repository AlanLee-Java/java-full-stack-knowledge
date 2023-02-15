package alanlee.singleton;

/**
 * 懒汉式-线程安全
 * 其它试图进入该方法的线程都必须等待，因此性能上有一定的损耗
 *
 * @author AlanLee
 * @date 2023-02-15
 */
public class LazySingleton2 {

    private static LazySingleton2 uniqueInstance;

    private LazySingleton2() {
    }

    public static synchronized LazySingleton2 getUniqueInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazySingleton2();
        }
        return uniqueInstance;
    }

}