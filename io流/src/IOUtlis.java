import java.io.*;

public class IOUtlis {


    /**
     * 字符流读取文件内容；
     *
     * @param file 文件
     * @throws IOException
     */
    public static void readFile(File file, Writer fileWriter) throws IOException {
        FileReader fileReader = new FileReader(file);
        writeLoginc(fileReader, fileWriter);
    }


    /**
     * 获取文件内容写入新的文件
     *
     * @param file           源文件
     * @param targetFileName 目标文件
     * @param isAppend       是否追加
     * @throws IOException
     */
    public static void writeFile(File file, String targetFileName, boolean isAppend) throws IOException {
        // 没有文件会自动创建文件
        try (FileWriter fileWriter = new FileWriter(targetFileName, isAppend);
             BufferedWriter bfw = new BufferedWriter(fileWriter)
        ) {
            readFile(file, bfw);
        }
    }

    /**
     * 把字符串写入文件
     *
     * @param str            字符串内容
     * @param targetFileName 目标文件
     * @param isAppend       是否追加
     * @throws IOException
     */

    public static void writeFile(String str, String targetFileName, boolean isAppend) throws IOException {
        // 先把字符串转化为字节流
        ByteArrayInputStream inputStream = new ByteArrayInputStream(str.getBytes());
        // 再把自己留转化为字符流
        InputStreamReader inReader = new InputStreamReader(inputStream);

        try (FileWriter fileWriter = new FileWriter(targetFileName, isAppend);
             BufferedWriter bfw = new BufferedWriter(fileWriter);
        ) {

            writeLoginc(inReader, fileWriter);
        }
    }


    /**
     * 字符流写入逻辑操作
     *
     * @param reader
     * @param writer
     * @throws IOException
     */
    private static void writeLoginc(Reader reader, Writer writer) throws IOException {
        try (BufferedReader in = new BufferedReader(reader)) {
            int len = 0;
            char[] buf = new char[1024];
            while ((len = in.read(buf, 0, buf.length)) > 0) {
                if (null != writer) {
                    writer.write(new String(buf, 0, len));
                }
            }
        }
    }

    /**
     * 字节流复制文件
     *
     * @param src    源文件路径
     * @param targer 输出路径
     */
    public static void copyFile(String src, String targer) throws IOException {
        try (FileInputStream in = new FileInputStream(src);
             BufferedInputStream bin = new BufferedInputStream(in);
             FileOutputStream out = new FileOutputStream(targer);
             BufferedOutputStream bout = new BufferedOutputStream(out)) {
            int len = 0;
            byte[] buf = new byte[1024];
            while ((len = bin.read(buf, 0, buf.length)) > 0) {
                bout.write(buf, 0, len);
            }
        }
        System.out.println("复制成功");
    }


}
