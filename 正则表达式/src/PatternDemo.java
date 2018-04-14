import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternDemo {

    public static void main(String[] args) {


        String str = "aaa ming tian fang jia";

        String reg = "\\w+";

        // 封装对象有很多方法，具体看Api
        Pattern regObj = Pattern.compile(reg);

        // matcher 有好多方法
        Matcher matcher = regObj.matcher(str);

        while (matcher.find()) {
            // 获取匹配的值
            System.out.println(matcher.group());
            // 获取匹配的索引
            System.out.println(matcher.start() + "...." + matcher.end());
        }


    }
}
