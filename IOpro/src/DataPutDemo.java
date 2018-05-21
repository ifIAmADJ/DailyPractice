import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;

public class DataPutDemo {

    public static void main(String[] args)throws Exception {

        File file =new File("src/","order.txt");

        file.createNewFile();//创建文件。

        FileOutputStream put=new FileOutputStream(file);

        DataOutputStream dos=new DataOutputStream(put); //data输出流是File输出流的子类。

        String names[]={"衬衫","手套","毛巾"};

        double prices[]={98.2,56.1,23.3};

        int nums[]={1,3,4};

        for(int i=0;i<names.length;i++)
        {
            dos.writeUTF(names[i]);

            dos.writeUTF(String.valueOf(prices[i]));

            dos.writeUTF(String.valueOf(nums[i]));

        }
            dos.close();
    }

}
