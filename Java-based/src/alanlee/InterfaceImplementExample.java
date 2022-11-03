package alanlee;

/**
 * 接口实现类
 *
 * @author AlanLee
 * @date 2022-11-03
 */
public class InterfaceImplementExample implements InterfaceExample {

    @Override
    public void func1() {
        System.out.println("func1");
    }

    public static void main(String[] args) {
        // 'InterfaceExample' is abstract; cannot be instantiated
        // InterfaceExample ie1 = new InterfaceExample();
        InterfaceExample ie2 = new InterfaceImplementExample();
        ie2.func1();
        System.out.println(InterfaceExample.x);
    }

}