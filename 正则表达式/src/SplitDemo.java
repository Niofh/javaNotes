public class SplitDemo {
    public static void main(String[] args) {
        // 1.因为切割要使用的参数要正则， `.`代表任意字符，所以要转义`.`
        String str = "1.2.3";
        split(str, "\\.");

        // 2. 切割叠词分割
        String str2 = "aa123bb456cc789";
        // `\1`获取第一个括号的符号，所以"\\1"代表一个字符（跟一个字符没区别）
        split(str2, "(.)\\1");

        String str3 = "aaa1234bbb34556";
        split(str3,"(.)\\1+");


    }

    public static void split(String str, String reg) {
        String[] split = str.split(reg);
        for (String s : split) {
            System.out.println(s);
        }
    }

}
