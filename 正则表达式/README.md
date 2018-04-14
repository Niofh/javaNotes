#### 正则

* 正则字符遇到 \ 代表转义，正则需要2个"\\"才对

1. 匹配：  `String.matches(String reg)` 匹配字符串正则，成功返回true,失败返回false。
    > 栗子：MatchesDemo.java

2. 切割：`String.split(String reg)` 切割字符串，返回一个数组；

    > 例子：SplitDemo.java
    
3. 替换：`String.replaceAll(String reg,String replaceStr)`
    > 栗子： ReplaceDemo.java

4. 将正则转化成对象: 有好多对正则操作的方法
    ```
    Pattern p = Pattern.compile(String reg); 
    Matcher m = p.matcher(String str);
    ```
    > 栗子：PatternDemo.java

5. 练习 
    > 栗子： 
        1.基本练习：Exercise.java
        2.爬虫练习和文件练习：
    
