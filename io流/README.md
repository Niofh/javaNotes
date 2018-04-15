#### 常用的io流

[io流的全部总结](http://www.cnblogs.com/xdp-gacl/p/3634409.html)

##### 1.乱码问题: 什么样的文件对应什么样的编码(utf-8文字对应utf-8文件)，不然会出现乱码;

##### 2.File类常用API介绍
  * java.io.File类用于表示文件（目录）的信息（名称，大小等）,不能用于文件内容的访问;
  * File方法：
    * file.exists(); 判断文件是否存在;
    * file.mkdir(); 创建文录；
    * file.mkdirs(); 创建多级目录；
    * file.createNewFile(); 创建一个文件；
    * file.delete(); 删除文件；
    * file.isDirectory; 判断是否一个目录;
    * file.isFile; 判断是否一个文件；
    * file.getName(); 获取文件名称；
    * file.getAbsolutePath(); 获取文件的绝对路径；
    * file.getParent(); 获取文件的父目录；
  * file的工具类： `FileUtils.java`
  
##### 3.RandomAccessFile 读写文件的二进制(rw（读写）,r（写）)

##### 4.字节流(输入输出流) 可以解决字符流输出的乱码字符
  * 1.InputStream（输入）、OutputStream（输出） 抽象类；
  * 2.读到-1就读到结尾；
  * 3.输入流(InputStream)基本方法：
      * `int b =in.read();` 读取一个字节无符号填充到int低八位，-1为结束
      * `in.read(byte[] buf);` 读取数据填充到字节数组buf
      * `in.read(byte[] buf,int start,int len);`  读取数据填充到字节数组buf，从start开始读，存放len长度的数据
  * 4.输出流(OutputStream)基本方法
      * `out.wirte(int b);` 写出一个字节到流
      * `out.wirte(byte[] buf);` 写入一个字节数组到流里
      * `out.wirte(byte[] buf,int start,int len);` ....
  
  * 5 FileInputStream (InputSteam子类) -->具体实现了在文件上读取数据；
      * 案例 IOUtlis.java (readFile)
      
  * 6 FileOutputStream -->具体实现了文件上的写入
      * 案例：IOUtlis.java (copyFile)
  
  * 7. 缓冲流 BufferedInputStream和BufferedOutputStream;

##### 5.字符流（操作文字内容）IOUtilis.java有案列
  * API跟字符流的API差不多
  * 写入文件字符（FileWrite类）
  * 读取字符文件字符（FileReader类）
  * 缓冲流 BufferedWriter和BufferedReader;
  
##### 6. 对象要实现序列化才能读写到文件 使用类是ObjectInputStream/out这2个类；



  

    
  


