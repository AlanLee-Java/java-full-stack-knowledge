package alanlee;

/**
 * 每个线程维护了一个“序列号”
 *
 * @author AlanLee
 * @date 2022-11-24
 */
public class SerialNum {

    // The next serial number to be assigned
    private static int nextSerialNum = 0;

    private static ThreadLocal serialNum = new ThreadLocal() {
        protected synchronized Object initialValue() {
            return new Integer(nextSerialNum++);
        }
    };

    public static int get() {
        return ((Integer) (serialNum.get())).intValue();
    }

}