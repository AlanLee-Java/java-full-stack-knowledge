package alanlee.strategy;

/**
 * 嘎嘎叫
 * @author AlanLee
 * @date 2023-02-15
 */
public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("quack!");
    }

}