package design.pattern1;

/**
 * 懒汉式单例 线程安全  如果高并发 性能不是很高
 */
public class Singleton2 {
    private static Singleton2 singleton2;

    private Singleton2() {
    }

    public static synchronized Singleton2 getInstance() {

        if (singleton2 == null) {

            return new Singleton2();
        }
        return singleton2;
    }


}
