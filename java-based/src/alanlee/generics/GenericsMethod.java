package alanlee.generics;

import alanlee.oop.Person;

/**
 * 泛型方法
 *
 * @author AlanLee
 * @date 2023-08-03
 */
public class GenericsMethod {

    public <T> T getObject(Class<T> c) throws InstantiationException, IllegalAccessException {
        T t = c.newInstance();
        return t;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        GenericsMethod genericsMethod = new GenericsMethod();
        Object obj = genericsMethod.getObject(Class.forName("alanlee.oop.Person"));
        Person person = (Person) obj;
        person.setName("AlanLee");
        person.work();
    }

}