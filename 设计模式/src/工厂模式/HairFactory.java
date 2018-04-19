package 工厂模式;

import java.lang.reflect.Constructor;

/**
 * 制作发型的工厂
 */
public class HairFactory {
    /**
     * 通过Properties文件映射关系通过key找到相应的反射（最好模式）
     */
    public HairInterface getClassKeyHair(String key) {

        String className = PropertiesReader.getClassName("hair.properties", key);

        return getClassHair(className);

    }


    /**
     * 通过类的反射获取实例。
     *
     * @param className 类的项目全路径
     * @return
     */
    public HairInterface getClassHair(String className) {
        try {
            Constructor<HairInterface> constructor = (Constructor<HairInterface>) Class.forName(className).getConstructor();
            HairInterface hairInterface = constructor.newInstance();
            return hairInterface;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * if-else 来判断创建那个对象 （这种方式效率最低）
     */
    public HairInterface getKey(String key) {
        if ("left".equals(key)) {
            return new LeftHair();
        } else if ("right".equals(key)) {
            return new RightHair();
        }
        return null;
    }
}

