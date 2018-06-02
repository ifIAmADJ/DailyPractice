import java.util.Scanner;

public class interFaceTest{
    
    public static void main(String[] args) throws Exception{

        double moved_distance=0; //模拟设置起点。

        Scanner move=new Scanner(System.in);
        Scanner choose=new Scanner(System.in);

        int Characher_HP=500;  //设定主角的HP。

        int real_hit;  //记录实际造成的伤害。
        int injured;   //记录实际受到的伤害。
        int wating_time=0; //记录需要等待的技能回合数。默认为0.

        boolean yourturn=false;
        boolean itsturn=true;
        int yourchice;


        System.out.println("GMAE START!");

        System.out.println("Chose a weapon!");

        Sword sword=new Sword("全村最好的剑",999,0);

        Monster BOSS=new Monster(8000,40,40,50,100);
        Active_Skill storm=new Active_Skill("强攻击",3,1000);

        while(moved_distance<50) {
            System.out.println("Where should we go?");
            moved_distance+=Behavior.jump(move.nextDouble());
        }

        System.out.println("Find a Monster!");

        for(int i=0;i<15;i++)
        {
            Thread.sleep(150);
            System.out.print(">");
        }
        System.out.println("\nYour hit         Boss hit");


        while (itsturn) //以怪物血量为0作为游戏胜利的条件。
        {

                do{

                System.out.println("攻击还是使用技能？");

                yourchice=choose.nextInt();

                switch (yourchice) {
                    case 1: {

                        real_hit = sword.attack() - BOSS.getPhysical_Defend();//计算实际伤害。

                        if (real_hit>0) {
                            System.out.println("<" + real_hit + ">");
                            BOSS.Hit_point -= (sword.attack() - BOSS.getPhysical_Defend());
                        } else if(real_hit<=0){
                            System.out.println("miss!");
                        }

                        if (wating_time != 0)  //如果最近使用过技能，减少1次冷却时间。
                        {
                            wating_time--;
                        }

                        yourturn=false; //如果最近因为错误指令导致循环开始，就停止循环。
                    }break;
                    case 2: {
                        if (wating_time != 0) {
                            System.out.println("冷却时间没有完毕！剩余: "+wating_time+" 回合");
                            yourturn=true;
                        } else {

                            System.out.println("使用技能: "+storm.getSKILLNAME());
                            BOSS.Hit_point -= storm.getHit();
                            wating_time = storm.getCOLD_TIME();
                            System.out.println("<<"+storm.getHit()+"!>>");
                        }
                    }
                    break;
                    default:
                    {
                        System.out.println("错误的指令！");
                        yourturn=true;
                    }//break;//没有输入正确的指令，重新循环。
                }
            }while (yourturn);

            Characher_HP-=BOSS.attack();
            if(BOSS.Hit_point<0)
            {
                System.out.println("you won!");
                break;
            }

            injured=BOSS.attack();

            if(injured!=0) {
                System.out.println("                    *" + injured + "*");
            }else
            {
                System.out.println("                    miss!");
            }

            if(Characher_HP<=0)    //主角如果挂了就退出游戏。
            {
                System.out.println("You lose!");
                break;
            }
        }

        System.out.println("GAME OVER");
    }

}

