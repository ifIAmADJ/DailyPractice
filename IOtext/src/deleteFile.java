import java.io.File;
import java.util.Scanner;

public class deleteFile {

    public static void main(String[] args) {

        String filename;

        System.out.println("请输入要删除的文件名:");

        Scanner input =new Scanner(System.in);

        filename=input.next();

        filename=filename+".txt";

        File file =new File("src/Files",filename);

        if(file.exists())
        {
            file.delete();

            System.out.println("文件删除成功！");

        }else
        {
            System.out.println("该文件不存在！");
        }


    }
}
