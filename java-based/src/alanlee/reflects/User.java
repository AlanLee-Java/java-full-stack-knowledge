package alanlee.reflects;

/**
 * 获取Class对象的三种方式
 *
 * @author AlanLee
 * @date 2023-08-21
 */
public class User {

    private String name = "init";

    private int age;

    public User() {
    }

    public User(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    private String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 获取Class对象的三种方式
        System.out.println("根据类名:  \t" + User.class);
        System.out.println("根据对象:  \t" + new User().getClass());
        System.out.println("根据全限定类名:\t" + Class.forName("alanlee.reflects.User"));
        // 常用的方法
        Class userClass = User.class;
        System.out.println("获取全限定类名:\t" + userClass.getName());
        System.out.println("获取类名:\t" + userClass.getSimpleName());
        System.out.println("实例化:\t" + userClass.newInstance());
    }

}