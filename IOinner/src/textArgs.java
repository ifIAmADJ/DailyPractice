import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class textArgs {

    public static void main(String[] args) throws SettingException{

        File file =new File("src/textfld","text.txt");


        if(file.isFile()) {
            String getName = file.getParent();

            System.out.println("获取了文件名称:" +getName);
        }else
        {
            throw new SettingException();
        }

        try {

            FileOutputStream pen = new FileOutputStream(file);

            byte in[]="12345678".getBytes();

            pen.write(in,0,8);

            System.out.println("写入到了文件当中。");

            pen.close();  //关闭输出流。


        }catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        try{
            FileInputStream get=new FileInputStream(file);

            byte out[]=new byte[1024];

            int len=get.read(out);

            System.out.println("文件当中有多少个字符："+len);

            System.out.println("文件当中的信息："+new String(out,0,len));

            get.close();
        }
        catch (Exception e){

            System.out.println(e.getMessage());

        }


    }

}

class SettingException extends Exception
{

   SettingException()
   {
       System.out.println("文件不存在哦？");
   }

}
