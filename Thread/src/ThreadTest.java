public class ThreadTest{

    public static void main(String[] args) {

        Runnable a=new Program();
        Runnable b=new Program2();

        Program3 soil=new Program3();

        Thread ta=new Thread(a);
        Thread tb=new Thread(b);
        Thread tc=new Thread(soil);

        ta.setName("alpha");
        tb.setName("beta");
        tc.setName("Gamma");

        ta.start();
        tb.start();
        tc.start();

    }
}

class Program implements Runnable
{
    @Override
    public void run()
    {

        String Threadname=Thread.currentThread().getName();

        for(int i=0;i<25;i++) {
            System.out.println(Threadname + " is running.");
        }
    }
}

class Program2 implements Runnable
{
    @Override
    public void run()
    {
        String Threadname=Thread.currentThread().getName();

        for(int i=0;i<25;i++) {
            System.out.println(Threadname + " is running.");
        }
    }
}

class Program3 implements Runnable
{
    @Override
    public void run()
    {
        String Threadname=Thread.currentThread().getName();

        for(int i=0;i<25;i++) {
            System.out.println(Threadname + " is running.");
        }
    }
}
