package IODemo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String args[]) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("E:\\ideaCodes\\javaBase\\src\\main\\java\\wsad.txt");
                    out = new FileOutputStream("E:\\ideaCodes\\javaBase\\src\\main\\java\\aaa.txt");
            // 指明要写入数据的文件，如果指定的路径中不存在StudentNew.java这样的文件，则系统会自动创建一个
            while ((b = in.read()) != -1) {
                out.write(b);
            // 调用write(int c)方法把读取到的字符全部写入到指定文件中去
            }
            in.close();
            out.close();
        } catch (FileNotFoundException e) {
            System.out.println("文件读取失败");
            System.exit(-1);// 非正常退出
        } catch (IOException e1) {
            System.out.println("文件复制失败！");
            System.exit(-1);
        }
        System.out.println("Done");
    }
}
