package alanlee.supers;

/**
 * super
 *
 * @author AlanLee
 * @date 2022-11-03
 */
public class SuperExtendExample extends SuperExample {

    private int z;

    public SuperExtendExample(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public void func() {
        super.func();
        System.out.println("SuperExtendExample.func()");
    }

    public static void main(String[] args) {
        SuperExample e = new SuperExtendExample(1, 2, 3);
        e.func();
    }

}