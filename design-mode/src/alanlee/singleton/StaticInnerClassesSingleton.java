package alanlee.singleton;

/**
 * 静态内部类实现
 *
 * @author AlanLee
 * @date 2023-02-15
 */
public class StaticInnerClassesSingleton {

    private StaticInnerClassesSingleton() {
    }

    private static class SingletonHolder {
        private static final StaticInnerClassesSingleton INSTANCE = new StaticInnerClassesSingleton();
    }

    public static StaticInnerClassesSingleton getUniqueInstance() {
        return SingletonHolder.INSTANCE;
    }

}