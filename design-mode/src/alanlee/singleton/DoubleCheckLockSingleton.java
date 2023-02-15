package alanlee.singleton;

/**
 * 双重校验锁-线程安全
 *
 * @author AlanLee
 * @date 2023-02-15
 */
public class DoubleCheckLockSingleton {

    private volatile static DoubleCheckLockSingleton uniqueInstance;

    private DoubleCheckLockSingleton() {
    }

    public static DoubleCheckLockSingleton getUniqueInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckLockSingleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckLockSingleton();
                }
            }
        }
        return uniqueInstance;
    }

}