import java.util.LinkedList;
import java.util.List;


public class Gather {

    public static void main(String[] args) {

        List nameList=new LinkedList();

        nameList.add(0,"Bai shiyu");
        nameList.add(1,"Wang minjun");
        nameList.add(2,"Zhang Qing");
        nameList.add(3,"Zeng haoyan");


        System.out.println("我要抽取一个幸运儿挂科，究竟是谁这么幸运呢？");

        int i=(int)Math.random()*(nameList.size()-1);

        System.out.println("这个人挂科了~！");

        System.out.println(nameList.get(i));
        
        }
    }

