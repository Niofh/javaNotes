import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReptileDemo {


    public static void main(String[] args) throws Exception {
        getImgUrl();
    }

    /**
     * 爬网页上的图片地址
     */

    public static void getImgUrl() throws Exception {
        String urlStr = "https://game.hao123.com/";
        URL url = new URL(urlStr);

        // 访问网址
        URLConnection urlConnection = url.openConnection();

        // 获取流
        InputStream inputStream = urlConnection.getInputStream();

        // 包装流变成可读
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);

        // 包装流加入缓冲
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);


        String line = null;
        String regExp = "<img.*?(?:>|/>)";
        Pattern p = Pattern.compile(regExp);
        ArrayList<String> strings = new ArrayList<>();

        // 每一次都读取一行
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = p.matcher(line);
            // 找到匹配正则的值，打印出来
            while (matcher.find()) {
                strings.add(matcher.group());
            }
        }
        bufferedReader.close();


        String regExp1= "[\'\"]([^\'\"]*)[\'\"]";
        Pattern p1 = Pattern.compile(regExp1);
        for (String string : strings) {
            Matcher matcher = p1.matcher(string);
            while (matcher.find()) {
                String group = matcher.group();
                if(group.indexOf("http")>0){
                    System.out.println(group);

                }
            }
        }
    }


    /**
     * 爬文件里面的邮箱
     */
    public static void getMail() throws Exception {

        // 邮箱的的正则
        String regMail = "\\w+@\\w+(\\.\\w+)+";
        // 正则转化成对象
        Pattern p = Pattern.compile(regMail);

        // 获取文件内容
        FileReader fileReader = new FileReader("mail.txt");

        // 把内容获取缓冲区
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = null;
        // 每一次都读取一行
        while ((line = bufferedReader.readLine()) != null) {
            Matcher matcher = p.matcher(line);
            // 找到匹配正则的值，打印出来
            while (matcher.find()) {
                System.out.println(matcher.group());
            }

        }

    }


}
