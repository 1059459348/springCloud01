package singleton;

/**
 * 单例模式 饿汉
 * 在初始化的时候就进行实例化，不管有没有用到，没有线程安全问题，但是会浪费内存空间
 */
public class EHan {
    private static EHan eHan = new EHan();

    private EHan() {
        System.out.println("饿汉私有构造方法");
    }

    public static EHan getInstance() {
        return eHan;
    }
}
