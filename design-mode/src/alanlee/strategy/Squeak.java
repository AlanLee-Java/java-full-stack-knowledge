package alanlee.strategy;

/**
 * 吱吱叫
 *
 * @author AlanLee
 * @date 2023-02-15
 */
public class Squeak implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("squeak!");
    }

}