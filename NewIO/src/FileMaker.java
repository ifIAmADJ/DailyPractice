import java.io.*;

public class FileMaker {

    public static void main(String[] args) {

        File file=new File("src/packet","textFile");

        try{

            file.createNewFile();

            FileOutputStream pen=new FileOutputStream(file);

            byte putMessage[]="我骑着一头小毛驴".getBytes();

            pen.write(putMessage);

            FileInputStream read=new FileInputStream(file);

            byte getMessage[] =new byte[1024];

            int len=read.read(getMessage); //输入流读取了file文件当中byte字节内容，把内容存储到了get字节数组当中
                                            //并返回读取到的字节的长度。

            System.out.println(new String(getMessage,0,len));  //new一个String，接收getMessage数组的内容。

            pen.close();
            read.close();

        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }


}
