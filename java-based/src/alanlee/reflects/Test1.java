package alanlee.reflects;

/**
 * getName、getCanonicalName与getSimpleName的区别
 *
 * @author AlanLee
 * @date 2023-08-21
 */
public class Test1 {

    private class Inner {
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //普通类
        System.out.println(Test.class.getSimpleName()); //Test
        System.out.println(Test.class.getName()); //com.cry.Test
        System.out.println(Test.class.getCanonicalName()); //com.cry.Test
        //内部类
        System.out.println(Inner.class.getSimpleName()); //inner
        System.out.println(Inner.class.getName()); //com.cry.Test$inner
        System.out.println(Inner.class.getCanonicalName()); //com.cry.Test.inner
        //数组
        System.out.println(args.getClass().getSimpleName()); //String[]
        System.out.println(args.getClass().getName()); //[Ljava.lang.String;
        System.out.println(args.getClass().getCanonicalName()); //java.lang.String[]
        //我们不能用getCanonicalName去加载类对象，必须用getName
        //Class.forName(inner.class.getCanonicalName()); 报错
        Class.forName(Inner.class.getName());
    }

}