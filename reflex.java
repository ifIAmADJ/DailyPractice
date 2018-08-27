import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class reflex {

    public static void main(String[] args) throws Exception{

        //-----------------------获取dog类---------------
        // Class a=dog.class;  可以直接获取dog的类。

            dog taidi=new dog("black");

            Class a=taidi.getClass();  //这种方法需要实例化dog类的一个对象。

            System.out.println("a所在的包："+a.getPackage());
            System.out.println("a的父类："+a.getSuperclass());
            System.out.println("a所属的类名："+a.getName());

        //-----------------获取dog类的所有方法-----------

            System.out.println("\n获取dog类的所有方法：");
            Method[] actions=a.getDeclaredMethods();

            int methodsCount=0;

            for (Method i:actions) {
                System.out.println("   "+i);
                methodsCount++;
            }
            if (methodsCount==0)
            {
                System.out.println("没有成员方法！");
            }
        //-----------------获取dog类的所有成员变量-------
            System.out.println("\n获取dog类的所有成员变量");
            Field[] feature=a.getDeclaredFields();

            for (Field j:feature) {

                System.out.println("   "+j);
            }

            Field sample=a.getDeclaredField("code");   //Field simple获取了a中指定的code成员变量。

            sample.setInt(taidi,3);    //对实例对象进行设置。code值等于3

            System.out.println("      使用Field获取code并给对象code赋值为:"+taidi.code);

        //--------------获取构造方法-------------------
            System.out.println("\n获取构造方法:");
            Constructor[] newaction=a.getDeclaredConstructors();

            for(Constructor z:newaction)
            {
                System.out.println("   "+z);
                System.out.println("   该构造方法是否带可变数量的参数:"+z.isVarArgs()+"\n");
            }

            System.out.println("      访问带String类型参数的构造方法：");
            System.out.println("      "+a.getDeclaredConstructor(new Class[]{String.class})+"\n");

            System.out.println("      访问带2个String类型参数的构造方法：");
            System.out.println("      "+a.getDeclaredConstructor(String.class,String.class)+"\n");

            Constructor c=a.getDeclaredConstructor(String.class,String.class);

            c.newInstance("Hashiqi","gray");

            c.setAccessible(true);

        //--------------获取dog类的所有子类-------------
            System.out.println("\n获取dog类的所有子类");
            Class[] all=a.getDeclaredClasses();

            int count=0;
            for(Class i:all)
            {
                System.out.println("   "+i);
                count++;
            }

            if(count==0){
                System.out.println("没有任何的子类型");
            }

    }
}

class dog implements eaten{

    public int code;
    static int legs=4;
    public String skinColor;
    private String name;

    void utter(){

        System.out.println("Wang！Wang！");

    }

    class littedog{

        int legs=4;
        public String skinColor;
        private String name;

    }


    @Override
    public void eat(){

        System.out.println("真香！");

    }

    dog(String skinColor){

       this.skinColor=skinColor;
    }

    dog(String name,String skinColor){
        this.skinColor=skinColor;
        this.name=name;
    }

}
