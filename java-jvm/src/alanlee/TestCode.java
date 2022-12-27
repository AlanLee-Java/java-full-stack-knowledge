package alanlee;

public class TestCode {

    public int foo() {
        int x;
        try {
            x = 1;
            return x;
        } catch (Exception e) {
            x = 2;
            return x;
        } finally {
            x = 3;
        }
    }

    public static void main(String[] args) {
        TestCode testCode = new TestCode();
        System.out.println(testCode.foo());
    }

}