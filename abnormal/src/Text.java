import java.util.Scanner;

public class Text {

    public static void main(String[] args) {

        Student per=new Student();

        try{
            per.speak();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

    }

}

class Student{

    void speak()throws Exception{

        Scanner scan=new Scanner(System.in);
        String talk=scan.next();

        if(talk.equalsIgnoreCase("shit")){
            throw new Exception("公堂之上不得使用粗鄙之语！");
        }else
        {
            System.out.println("他说了:"+talk);
        }

    }


}
