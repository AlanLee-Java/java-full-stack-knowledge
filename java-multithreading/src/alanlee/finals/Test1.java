package alanlee.finals;

import java.util.Random;

public class Test1 {
    static Random r = new Random();
    final int k = r.nextInt(10);
    static final int k2 = r.nextInt(10);

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        System.out.println("k=" + t1.k + " k2=" + t1.k2);
        Test1 t2 = new Test1();
        System.out.println("k=" + t2.k + " k2=" + t2.k2);
    }

}