package alanlee.generics;

/**
 * 下限
 *
 * @author AlanLee
 * @date 2023-08-03
 */
public class GenericsDemo21 {

    public static void main(String args[]) {
        Info2<String> i1 = new Info2<String>();        // 声明String的泛型对象
        Info2<Object> i2 = new Info2<Object>();        // 声明Object的泛型对象
        i1.setVar("hello");
        i2.setVar(new Object());
        fun(i1);
        fun(i2);
    }

    public static void fun(Info2<? super String> temp) {    // 只能接收String或Object类型的泛型，String类的父类只有Object类
        System.out.print(temp + ", ");
    }

}

class Info2<T> {

    private T var;        // 定义泛型变量

    public void setVar(T var) {
        this.var = var;
    }

    public T getVar() {
        return this.var;
    }

    public String toString() {    // 直接打印
        return this.var.toString();
    }

}