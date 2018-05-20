import java.io.*;

public class DataPut {

    public static void main(String[] args) {

        File file=new File("src/packet","newText.txt");

        try{

            file.createNewFile();

            FileOutputStream fo=new FileOutputStream(file);

            DataOutputStream dow=new DataOutputStream(fo);

            dow.writeUTF("HelloWorld");
            dow.writeUTF("Are you Ok?");

            dow.close();
            fo.close();

            FileInputStream fi=new FileInputStream(file);

            DataInputStream di=new DataInputStream(fi);

            System.out.println(di.readUTF());
            System.out.println(di.readUTF());

        }
        catch (Exception e)
        {
            e.getStackTrace();
        }

    }
}
