import java.io.File;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class creatFile {

    public static void main(String[] args) {

        String filename;
        boolean flag=true;
        Date now=new Date();
        Scanner input =new Scanner(System.in);

        System.out.println("现在的时间是：");
        System.out.println(String.format(Locale.CHINA,"%tc",now));

        while(true) {
            System.out.println("输入您的文件名字:");

            filename = input.next();

            filename=filename+".txt";

            File file = new File("src/Files", filename);

            if (file.exists()) {
                System.out.println("该文件已经存在！请确认。\n");

            }else{
                try{
                    file.createNewFile();
                }catch (Exception e)
                {
                    System.out.println(e.getMessage());
                    flag=false;
                }

                if(flag)
                {

                    fileInfo dreftInfo=new fileInfo(file);

                    dreftInfo.putInfo();

                }

                break;
            }
        }



    }

}

class fileInfo{

    private File file;

    fileInfo(File file)
    {
        this.file=file;
    }

    void putInfo(){
        System.out.println("文件创建成功！返回文件名:"+file.getName());
        System.out.println("文件所在的文件夹："+file.getParent());
        System.out.println("文件现在所处的绝对路径:"+file.getAbsolutePath());
        System.out.println("文件的长度:"+file.length());

    }


}