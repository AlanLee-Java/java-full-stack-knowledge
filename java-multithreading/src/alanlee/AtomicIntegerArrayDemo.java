package alanlee;

import java.util.concurrent.atomic.AtomicIntegerArray;

/**
 * AtomicIntegerArray例子
 *
 * @author AlanLee
 * @date 2022-11-14
 */
public class AtomicIntegerArrayDemo {

    public static void main(String[] args) {
        AtomicIntegerArray array = new AtomicIntegerArray(new int[]{0, 0});
        System.out.println(array);
        System.out.println(array.getAndAdd(1, 2));
        System.out.println(array);
    }

}