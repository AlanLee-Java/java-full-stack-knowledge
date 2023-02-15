package alanlee.adapter;

/**
 * 野鸡适配器
 *
 * @author AlanLee
 * @date 2023-02-15
 */
public class TurkeyAdapter implements Duck {

    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

}
