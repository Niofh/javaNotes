package 单例模式;

/**
 * 单例模式
 * 作用：保证整个应用程序中某个实例有且只有一个
 * 类型：懒汉式，饿汉式
 */
public class Singleton {
    // 饿汉模式
    // 1.将构造方法私有化，不允许外部直接创建对象
    private Singleton() {

    }

    // 2. 创建类的唯一实例
    private static Singleton instance = new Singleton();

    // 3.提供一个用于获取实例的方法
    public static Singleton getInstance() {
        return instance;
    }
}
