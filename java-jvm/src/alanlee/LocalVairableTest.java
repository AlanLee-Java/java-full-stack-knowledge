package alanlee;

/**
 * 局部变量表
 */
public class LocalVairableTest {

    public void test() {
        int a = 1;
        {
            int b = 2;
            b = a + 1;
        }
        int c = a + 1;
    }

}