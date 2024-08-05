package alanlee.oop;

/**
 * 继承：继承实现了 IS-A 关系，例如 Cat 和 Animal 就是一种 IS-A 关系，因此 Cat 可以继承自 Animal，从而获得 Animal 非 private 的属性和方法。
 * 继承应该遵循里氏替换原则，子类对象必须能够替换掉所有父类对象。
 * Cat 可以当做 Animal 来使用，也就是说可以使用 Animal 引用 Cat 对象。父类引用指向子类对象称为 向上转型 。
 * 猫类
 */
public class Cat extends Animal {

    public static void main(String[] args) {
        Animal animal = new Cat();
    }

}