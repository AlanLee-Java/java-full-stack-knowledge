package alanlee.generics;

/**
 * 泛型类案例
 *
 * @author AlanLee
 * @date 2023-08-03
 */
public class GenericsDemo06 {

    public static void main(String args[]) {
        Point<String> p = new Point<String>();     // 里面的var类型为String类型
        p.setVar("it");                            // 设置字符串
        System.out.println(p.getVar().length());   // 取得字符串的长度
    }

}

/**
 * 泛型类
 *
 * @param <T>
 * @author AlanLee
 */
class Point<T> {         // 此处可以随便写标识符号，T是type的简称

    private T var;     // var的类型由T指定，即：由外部指定

    public T getVar() {  // 返回值的类型由外部决定
        return var;
    }

    public void setVar(T var) {  // 设置的类型也由外部决定
        this.var = var;
    }

}