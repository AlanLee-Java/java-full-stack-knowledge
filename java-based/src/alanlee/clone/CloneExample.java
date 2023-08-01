package alanlee.clone;

/**
 * clone cloneable
 *
 * @author AlanLee
 * @date 2022-11-03
 */
public class CloneExample implements Cloneable {

    private int a;

    private int b;

    @Override
    protected CloneExample clone() throws CloneNotSupportedException {
        return (CloneExample) super.clone();
    }

    public static void main(String[] args) {
        CloneExample e1 = new CloneExample();
        // CloneExample e2 = e1.clone(); // 'clone()' has protected access in 'java.lang.Object'
        try {
            CloneExample e2 = e1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}