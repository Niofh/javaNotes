import java.util.ArrayList;
import java.util.Arrays;


/**
 * 正则练习
 */
public class Exercise {
    public static void main(String[] args) {
        test1();
        test2();
    }

    public static void test1() {
        String string = "我我我....爱...爱...学学...编编...程程";
        // 把所有的点去掉
        string = string.replaceAll("\\.+", "");
        // 之后吧所有重复的名字替换成一个；
        string = string.replaceAll("(.)\\1+", "$1");
        System.out.println(string);
    }


    public static void test2() {
        // 排序ip地址
        String[] ints = {"192.168.1", "2.22.22", "11.21.31"};
        StringBuilder stringBuilder = new StringBuilder();

        for (String anInt : ints) {
            stringBuilder.append(anInt + ",");
        }

        // 先转化为字符串
        String s = stringBuilder.toString().substring(0, stringBuilder.length() - 1);
        System.out.println(s);

        // 之后把数字位数对齐
        String s1 = s.replaceAll("(\\d+)", "00$1");
        String[] split = s1.split(",");

        // 排序
        Arrays.sort(split);

        ArrayList<String> stringList = new ArrayList<>();
        for (String s2 : split) {
            // 把前缀为0+的数字替换成没有前缀0的
            String $1 = s2.replaceAll("0*(\\d+)", "$1");
            stringList.add($1);
        }

        System.out.println(stringList);

    }
}
