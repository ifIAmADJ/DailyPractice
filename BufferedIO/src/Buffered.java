import java.io.File;
import java.io.*;

public class Buffered {

    public static void main(String[] args) {

        String contant[]={"J2SE","JDBC","JavaWeb","J2EE"};

        File file=new File("src/packet","newFile.txt");

        try{

            file.createNewFile();

            FileWriter fw=new FileWriter(file);

            BufferedWriter bufw=new BufferedWriter(fw);  //创建一个缓存器，用于缓存FileWriter

            for(int i=0;i<contant.length;i++)
            {
                    bufw.write(contant[i]);

                    bufw.newLine();

            }

            bufw.close();

            fw.close();

        }catch (Exception e)
        {

            e.printStackTrace();

        }

        try{

            FileReader fr=new FileReader(file);

            BufferedReader bufr=new BufferedReader(fr);

            String s=null;

            int i=0;

            while((s=bufr.readLine())!=null)
            {
                i++;

                System.out.println("第"+i+"行:"+s);

            }

            bufr.close();

            fr.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }


    }

}
