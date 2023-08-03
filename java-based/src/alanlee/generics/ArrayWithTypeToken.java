package alanlee.generics;

import java.lang.reflect.Array;

/**
 * 使用反射来初始化泛型数组
 *
 * @param <T>
 * @author AlanLee
 * @date 2023-08-03
 */
public class ArrayWithTypeToken<T> {

    private T[] array;

    public ArrayWithTypeToken(Class<T> type, int size) {
        array = (T[]) Array.newInstance(type, size);
    }

    public void put(int index, T item) {
        array[index] = item;
    }

    public T get(int index) {
        return array[index];
    }

    public T[] create() {
        return array;
    }

    public static void main(String[] args) {
        ArrayWithTypeToken<Integer> arrayToken = new ArrayWithTypeToken<Integer>(Integer.class, 100);
        Integer[] array = arrayToken.create();
        array[0] = 1;
        System.out.println(array[0]);
    }

}