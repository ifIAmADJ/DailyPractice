import java.io.FileOutputStream;

import java.io.ObjectOutputStream;

public class Serializable {

    public static void main(String[] args) {

        Box blackbox=new Box(100,200,20176714);

        try {
            FileOutputStream fs = new FileOutputStream("src/box.txt");  //将创建的对象小黑盒进行序列化。
            System.out.println("文件创建成功");
            ObjectOutputStream os = new ObjectOutputStream(fs);
            os.writeObject(blackbox);
            os.close();
        }catch (Exception e)
        {
            e.printStackTrace();
            System.out.println("因为以上问题，文件创建失败。");
        }


    }
}

class Box implements java.io.Serializable
{
     private static final long serialVersionUID =3787013348808454525L; //显式声明local UID
                                                    //与stream classdesc serialVersion一致才可以进行序列化
    private int height;
    private int width;
    transient private int password;

    Box(int height,int width,int password)
    {
        this.height=height;
        this.width=width;
        this.password=password;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getPassword()
    {
        return password;
    }
}



