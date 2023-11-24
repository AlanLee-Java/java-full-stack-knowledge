package alanlee.reflects;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射机制执行的流程
 */
public class HelloReflect {

    public static void main(String[] args) {
        try {
            // 1. 使用外部配置的实现，进行动态加载类
            HelloReflect test = (HelloReflect)Class.forName("alanlee.reflects.HelloReflect").newInstance();
            test.sayHello("call directly");
            // 2. 根据配置的函数名，进行方法调用（不需要通用的接口抽象）
            Object t2 = new HelloReflect();
            Method method = t2.getClass().getDeclaredMethod("sayHello", String.class);
            method.invoke(test, "method invoke");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e ) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void sayHello(String word) {
        System.out.println("hello," + word);
    }

}
