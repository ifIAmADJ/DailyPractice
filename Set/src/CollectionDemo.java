import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionDemo {

    public static void main(String[] args) {

        Set<People> namelist=new HashSet<People>();

        namelist.add(new People("Zeng haoyan","20175491"));
        namelist.add(new People("Wang minjun","20175490"));
        namelist.add(new People("Li junhu","20176714"));

            Iterator <People> it=namelist.iterator();

            while (it.hasNext())
            {
                People temp=it.next();  //接受迭代器中的每一个元素。

                System.out.println("id:"+temp.getId()+"name:"+temp.getName());

                System.out.println("id是否合法？"+temp.islegalID());

            }

    }

}
