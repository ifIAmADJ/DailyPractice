import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;

public class DataGetDemo {

    public static void main(String[] args)throws Exception {

        File file=new File("src","order.txt");

        if(file.isFile())
        {
            FileInputStream get=new FileInputStream(file);

            DataInputStream dis=new DataInputStream(get);

            for(int i=0;i<3;i++)
            {

                String name;
                double price;
                double num;

                name=dis.readUTF();

                price=Double.parseDouble(dis.readUTF());

                num=Integer.parseInt(dis.readUTF());

                System.out.println("物品:"+name+"\n名称："+price+"\n数量:"+num+"\n\n");
            }

            dis.close();
        }else
        {
            throw new FileException();
        }

    }

}

class FileException extends Exception
{
    FileException()
    {
        System.out.println("文件丢失:"+super.getMessage());
    }
}

