import  java.io.*;
import java.io.Serializable;

public class Deserializable implements Serializable{

    public static void main(String[] args)  {

        try {
            FileInputStream  fi = new FileInputStream("src/box.obj");
            ObjectInputStream os = new ObjectInputStream(fi);
            Box clonebox=(Box)os.readObject();
            System.out.println("对象解序列化成功。");


            System.out.println(clonebox.getWidth());
            System.out.println(clonebox.getHeight());

            System.out.println("transient修饰的password没有被序列成功，显示为：");
            System.out.println(clonebox.getPassword());

        }catch (Exception E)
        {
            System.out.println(E.getMessage());
        }

    }
}
