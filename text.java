import java.lang.reflect.Field;

public class text {
    public static void main(String[] args) {

        Class sample=MoreFields.class;
        MoreFields victim=new MoreFields();

        Field[] allArguments=sample.getDeclaredFields();

        for(Field i:allArguments) {

            boolean flag=true; //若没有异常则不会重新运行。

            Field fld = i;
            System.out.println("获得的变量名称:" + i.getName());

            i.getType();
            System.out.println("获得的变量类型:" + i.getType());

            while (flag)  //没有异常则不会重新运行。
            {
                flag=false;//没有异常则不会重新运行。
                try {
                    if (i.getType().equals(int.class)) {

                        System.out.println("通过field类来获取a成员的值:"+i.getInt(victim));

                        System.out.println("通过field类来改变值:10");

                        i.setInt(victim, 10);

                    } else if (i.getType().equals(float.class)) {

                        System.out.println("通过field类来获取b成员的值:"+i.getFloat(victim));

                        System.out.println("通过field类来改变值:12.0");

                        i.setFloat(victim, 12);
                    } else if (i.getType().equals(double.class)) {
                        System.out.println("通过field类来获取c成员的值:"+i.getDouble(victim));

                        System.out.println("通过field类来改变值:14.00");
                        i.setDouble(victim, 14.00);
                    } else if (i.getType().equals(char.class)) {
                        System.out.println("通过field类来获取d成员的值:"+ i.getChar(victim));

                        System.out.println("通过field类来改变d成员的值:");
                        i.setChar(victim, 'a');
                    }

                    }
                    catch (Exception e)
                    {
                        System.out.println("\n..发生了错误,有一个私有属性的变量阻止了重新赋值。");
                        i.setAccessible(true);  //设置为允许访问。
                        flag = true;         //打开while循环。
                    }
            }

        }

        System.out.println("victim的int a变量的值："+victim.a);
        System.out.println("victim的int b变量的值："+victim.b);
        System.out.println("victim的int c变量的值："+victim.c);
        System.out.println("victim的int d变量的值："+victim.getD());

    }
}

class MoreFields{


    int a= 0;   //四种不同权限，不同类型的成员变量
    public float b=0;
    protected double c=0;
    private char d='0';

    public char getD() {
        return d;
    }
}