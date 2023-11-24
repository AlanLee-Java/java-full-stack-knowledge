package alanlee.reflects;

import java.lang.reflect.Constructor;
import java.lang.reflect.Type;

/**
 * Constructor类及其用法
 *
 * @author AlanLee
 * @date 2023-11-24
 */
public class ConstructionTest {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = null;

        //获取Class对象的引用
        clazz = Class.forName("alanlee.reflects.ConstructionUser");

        //第一种方法，实例化默认构造方法，User必须无参构造函数,否则将抛异常
        ConstructionUser user = (ConstructionUser) clazz.newInstance();
        user.setAge(20);
        user.setName("Jack");
        System.out.println(user);

        System.out.println("--------------------------------------------");

        //获取带String参数的public构造函数
        Constructor cs1 = clazz.getConstructor(String.class);
        //创建User
        ConstructionUser user1 = (ConstructionUser) cs1.newInstance("hiway");
        user1.setAge(22);
        System.out.println("user1:" + user1.toString());

        System.out.println("--------------------------------------------");

        //取得指定带int和String参数构造函数,该方法是私有构造private
        Constructor cs2 = clazz.getDeclaredConstructor(int.class, String.class);
        //由于是private必须设置可访问
        cs2.setAccessible(true);
        //创建user对象
        ConstructionUser user2 = (ConstructionUser) cs2.newInstance(25, "hiway2");
        System.out.println("user2:" + user2.toString());

        System.out.println("--------------------------------------------");

        //获取所有构造包含private
        Constructor<?> cons[] = clazz.getDeclaredConstructors();
        // 查看每个构造方法需要的参数
        for (int i = 0; i < cons.length; i++) {
            //获取构造函数参数类型
            Class<?> clazzs[] = cons[i].getParameterTypes();
            System.out.println("构造函数[" + i + "]:" + cons[i].toString());
            System.out.print("参数类型[" + i + "]:(");
            for (int j = 0; j < clazzs.length; j++) {
                if (j == clazzs.length - 1)
                    System.out.print(clazzs[j].getName());
                else
                    System.out.print(clazzs[j].getName() + ",");
            }
            System.out.println(")");
        }

        Constructor cs3 = clazz.getDeclaredConstructor(int.class,String.class);
        System.out.println("-----getDeclaringClass-----");
        Class uclazz=cs3.getDeclaringClass();
        //Constructor对象表示的构造方法的类
        System.out.println("构造方法的类:"+uclazz.getName());

        System.out.println("-----getGenericParameterTypes-----");
        //对象表示此 Constructor 对象所表示的方法的形参类型
        Type[] tps=cs3.getGenericParameterTypes();
        for (Type tp:tps) {
            System.out.println("参数名称tp:"+tp);
        }
        System.out.println("-----getParameterTypes-----");
        //获取构造函数参数类型
        Class<?> clazzs[] = cs3.getParameterTypes();
        for (Class claz:clazzs) {
            System.out.println("参数名称:"+claz.getName());
        }
        System.out.println("-----getName-----");
        //以字符串形式返回此构造方法的名称
        System.out.println("getName:"+cs3.getName());

        System.out.println("-----getoGenericString-----");
        //返回描述此 Constructor 的字符串，其中包括类型参数。
        System.out.println("getoGenericString():"+cs3.toGenericString());
    }
}

class ConstructionUser {
    private int age;
    private String name;

    public ConstructionUser() {
        super();
    }

    public ConstructionUser(String name) {
        super();
        this.name = name;
    }

    /**
     * 私有构造
     *
     * @param age
     * @param name
     */
    private ConstructionUser(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
