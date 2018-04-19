package 单例模式;

/**
 * 懒汉模式
 */
public class Singleton2 {
    // 1.首先私有化构造函数
    private Singleton2() {

    }

    // 2.创建一个变量
    private static Singleton2 instance;

    // 3。判断有无实例。无实例创建对象，有实例不创建对象
    public static Singleton2 getInstance() {
        if (null == instance) {
            instance = new Singleton2();
        }
        return instance;
    }
}
