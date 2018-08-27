import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Maptext {

    public static void main(String[] args) {

        Map<String,String> dic=new HashMap<String, String>();

        dic.put("香蕉","banana");
        dic.put("苹果","apple");
        dic.put("牛奶","milk");
        dic.put("白学长","高数挂科里分最高的");

        System.out.println("请输入一个文字，我会翻译出它的英文意思");

        Scanner textarea=new Scanner(System.in);

        String search=textarea.next();

        if(dic.get(search)!=null)
        System.out.println(dic.get(search));
        else
            System.out.println("没有找到此元素！");

        System.out.println(dic.keySet());

    }
}
