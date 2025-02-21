package alanlee;

/**
 * 寻找类加载器小例子
 *
 * @author AlanLee
 * @date 2025-02-21
 */
public class ClassLoaderTest {

    public static void main(String[] args) {
        ClassLoader loader = Thread.currentThread().getContextClassLoader();
        System.out.println(loader);
        System.out.println(loader.getParent());
        System.out.println(loader.getParent().getParent());
    }

}