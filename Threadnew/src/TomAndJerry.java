public class TomAndJerry implements Runnable{

    private Bankaccount account=new Bankaccount();

    public static void main(String[] args) {

        TomAndJerry theJob=new TomAndJerry();

        Thread one=new Thread(theJob);   //让两个线程完成同一个实例化的任务，这样就会存取一个账户
        Thread two=new Thread(theJob);

        one.setName("Tom");              //给第一个取钱的人取名叫Tom
        two.setName("Jerry");            //给第二个取钱的人取名叫Jerry

        one.start();                     //让两个线程真正的开始运行。
        two.start();

    }

    @Override
    public void run()
    {
        while (account.getBalance()>0)
        {
            makeWithdrawal(10); //每个人一次能取10块钱。

        }

        System.out.println("账户已经没钱了！");
    }

    private synchronized void makeWithdrawal(int amount)//取钱模拟
    {
        if(account.getBalance()>=amount)//如果账户里还有足够提现的钱的话，就让当前的人去取。
        {
            System.out.println(Thread.currentThread().getName()+"要取钱了");

            /*先让这个人睡0.5秒再去取钱。*/
            try{

                System.out.println(Thread.currentThread().getName()+"要去小睡一会");

                Thread.sleep(500);
            }catch (Exception e)
            {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName()+"醒过来了。去取钱。");

            account.withdraw(10);  //醒来了之后从银行里拿走10块钱。
        }else
        {
            System.out.println(Thread.currentThread().getName()+"没有足够的钱可以拿了！");
        }

    }

}
