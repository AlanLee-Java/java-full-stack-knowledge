package alanlee.abstracts;

/**
 * 抽象类子类
 *
 * @author AlanLee
 * @date 2022-11-03
 */
public class AbstractExtendClassExample extends AbstractClassExample {

    @Override
    public void func1() {
        System.out.println("func1");
    }

    public static void main(String[] args) {
        // 'AbstractClassExample' is abstract; cannot be instantiated
        // AbstractClassExample ac1 = new AbstractClassExample();
        AbstractClassExample ac2 = new AbstractExtendClassExample();
        ac2.func1();
    }

}