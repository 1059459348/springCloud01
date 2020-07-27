package singleton;

/**
 * 单例模式  双检锁
 * 双重校验锁   综合了懒汉式和饿汉式两者的优缺点整合而成
 * 保证了线程安全，又比直接上锁提高了执行效率，还节省了内存空间。
 * 双检锁方式可在实例域需要延迟初始化时使用
 */
public class DoubleCheck {
    private static volatile DoubleCheck doubleCheck;

    private DoubleCheck() {
        System.out.println("双检锁私有化构造方法");
    }

    public static DoubleCheck getInstance() {
        if (null == doubleCheck) {
            synchronized (DoubleCheck.class) {
                if (null == doubleCheck) {
                    doubleCheck = new DoubleCheck();
                }
            }
        }
        return doubleCheck;
    }
}
