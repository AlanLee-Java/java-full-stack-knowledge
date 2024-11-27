package alanlee.finals;

public class MyString {

    private String innerString;

    // ...init & other methods

    // 支持老的方法
    public int length() {
        return innerString.length(); // 通过innerString调用老的方法
    }

    // 添加新方法
    public String toMyString() {
        return innerString;
    }

}