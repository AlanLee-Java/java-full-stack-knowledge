package alanlee;

/**
 * 保证可见性的原理：内存模型和happens-before规则
 * @author AlanLee
 * @date 2022-11-13
 */
public class MonitorDemo {

    private int a = 0;

    public synchronized void writer() {     // 1
        a++;                                // 2
    }                                       // 3

    public synchronized void reader() {    // 4
        int i = a;                         // 5
    }                                      // 6

}