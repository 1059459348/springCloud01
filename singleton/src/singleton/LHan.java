package singleton;

/**
 * 单例模式  懒汉
 * 只有一个实例，自己负责自己创建对象
 * 这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象
 */
public class LHan {
    private static LHan lHan;

    private LHan() {
        System.out.println("懒汉私有构造方法");
    }

    public static LHan getInstance() {
        if (null == lHan) {
            lHan = new LHan();
        }
        return lHan;
    }
}
