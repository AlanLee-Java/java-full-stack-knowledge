package alanlee.statics;

public class A {

    static {
        System.out.println("123");
    }

    private int x;         // 实例变量
    private static int y;  // 静态变量

    public static void func1() {
        int a = y;
        // int b = x;  // Non-static field 'x' cannot be referenced from a static context
        // int b = this.x;     // 'A.this' cannot be referenced from a static context
    }

    public static void main(String[] args) {
        // int x = A.x;  // Non-static field 'x' cannot be referenced from a static context
        A a = new A();
        int x = a.x;
        int y = A.y;
    }

}