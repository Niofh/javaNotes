public class MatchesDemo {

    public static void main(String[] args) {
        checkPhone("13049865313");
    }


    /**
     * 匹配手机号,手机号匹配1开头，11位数
     */
    public static void checkPhone(String tel) {
        String reg = "1[358]\\d{9}";
        System.out.println(tel.matches(reg));
    }
}
