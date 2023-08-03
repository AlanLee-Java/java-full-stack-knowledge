package alanlee;

/**
 * 封装：利用抽象数据类型将数据和基于数据的操作封装在一起，使其构成一个不可分割的独立实体。
 *
 * @author AlanLee
 * @date 2022-11-03
 */
public class Person {

    private String name;

    private int gender;

    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender == 0 ? "man" : "woman";
    }

    public void work() {
        if (18 <= age && age <= 50) {
            System.out.println(name + " is working very hard!");
        } else {
            System.out.println(name + " can't work any more!");
        }
    }

}