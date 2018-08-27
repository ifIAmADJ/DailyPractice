public class testarea {

    public static void main(String[] args) {

        Father Tony=new Father();

        Son Sandy=new Son();

        try{

            Sandy.re_weath();

            Sandy.Dontedit();

            Sandy.ableedit();

            Tony.ableedit();

            Tony.re_weath();

        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }


    }

}

class Father{

    private void weath()
    {
        System.out.println("父类独有的构造方法");
    }

    void re_weath()
    {
        weath();
        System.out.println("只允许通过公共的方法才可以去访问。");
    }


    final void Dontedit(){

        System.out.println("不允许子类修改这个方法，但是允许继承。");

    }

    void ableedit()
    {
        System.out.println("允许子类去修改这个方法。");
    }

    }

class Son extends Father{

    @Override
    void ableedit()
    {
        System.out.println("子类成功覆盖（重写）了这个方法。");
    }

   // @Override// void Dontedit()
   // {
   //     System.out.println("可以被重写吗？当你不打算让子类去修改你的方法，去把父类的对应方法加上final来限定。");
   // }
}
