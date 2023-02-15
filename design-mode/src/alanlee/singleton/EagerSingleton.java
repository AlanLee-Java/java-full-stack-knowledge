package alanlee.singleton;

/**
 * 饿汉式-线程安全
 * 丢失了延迟实例化带来的节约资源的好处
 *
 * @author AlanLee
 * @date 2023-02-15
 */
public class EagerSingleton {

    private static EagerSingleton uniqueInstance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getUniqueInstance() {
        return uniqueInstance;
    }

}