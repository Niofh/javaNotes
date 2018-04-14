public class ReplaceDemo {
    public static void main(String[] args) {

        // 把叠词替换成#
        String s = "aaa2bbb3".replaceAll("(.)\\1+", "#");
        System.out.println(s);
    }
}
