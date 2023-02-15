package alanlee.adapter;

/**
 * 让鸭子鸡叫
 *
 * @author AlanLee
 * @date 2023-02-15
 */
public class Client {

    public static void main(String[] args) {
        Turkey turkey = new WildTurkey();
        Duck duck = new TurkeyAdapter(turkey);
        duck.quack();
    }

}