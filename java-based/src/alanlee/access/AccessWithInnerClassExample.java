package alanlee.access;

/**
 * 如果是包级私有的类或者私有的嵌套类，那么直接暴露成员不会有特别大的影响
 */
public class AccessWithInnerClassExample {

    private class InnerClass {
        int x;
    }

    private InnerClass innerClass;

    public AccessWithInnerClassExample() {
        innerClass = new InnerClass();
    }

    public int getValue() {
        return innerClass.x;  // 直接访问
    }

}