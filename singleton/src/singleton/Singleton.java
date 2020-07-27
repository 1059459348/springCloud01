package singleton;

/**
 * 单例模式  静态内部类
 * 效果类似双检锁  适用于静态域的情况。
 */
public class Singleton {
    private static class SingletonHolder {
        private static Singleton singleton = new Singleton();
    }

    private Singleton() {
        System.out.println("静态内部类构造方法私有化");
    }

    public static Singleton getInstance() {
        return SingletonHolder.singleton;
    }
}
