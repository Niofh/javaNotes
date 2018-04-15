import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileUtlis {


    /**
     * 查找所有文件目录下的文件
     * @param dir 文件目录
     * @return File集合
     * @throws Exception
     */
    public static List<File> findFile(File dir) throws Exception {
        if (!dir.exists()) {
            throw new Exception(dir + "不存在！");
        }

        if (!dir.isDirectory()) {
            throw new Exception(dir + "不是一个目录！");
        }

        // 获取文件夹下所有的文件对象
        File[] files = dir.listFiles();
        ArrayList<File> fileArrayList = new ArrayList<>();
        if (files != null && files.length > 0) {
            for (File file : files) {
                if (file.isDirectory()) {
                    findFile(file);
                } else {
                    fileArrayList.add(file);
                }
            }
        }

        return fileArrayList;
    }
}
