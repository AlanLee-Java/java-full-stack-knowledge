package alanlee.generics;

/**
 * 上限
 *
 * @author AlanLee
 * @date 2023-08-03
 */
public class Demo1 {

    public static void main(String args[]) {
        Info1<Integer> i1 = new Info1<Integer>();        // 声明Integer的泛型对象
        i1.setVar(1);
        System.out.println(i1.toString());
    }

}

class Info1<T extends Number> {    // 此处泛型只能是数字类型

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