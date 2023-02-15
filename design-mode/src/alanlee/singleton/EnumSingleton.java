package alanlee.singleton;

/**
 * 枚举实现
 * 单例模式的最佳实践，它实现简单，并且在面对复杂的序列化或者反射攻击的时候，能够防止实例化多次。
 *
 * @author AlanLee
 * @date 2023-02-15
 */
public enum EnumSingleton {

    uniqueInstance;

}