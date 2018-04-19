package 工厂模式;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * porperties文件的读取
 * https://blog.csdn.net/wobushilw/article/details/51983886 文件路径问题
 */
public class PropertiesReader {
    public static String getClassName(String filePath, String key) {
        try {
            Properties properties = new Properties();

            // PropertiesReader.class 当前项目src的绝对路径
            InputStream resourceAsStream = PropertiesReader.class.getResourceAsStream(filePath);

            properties.load(resourceAsStream);
            String property = properties.getProperty(key);
            return property;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
