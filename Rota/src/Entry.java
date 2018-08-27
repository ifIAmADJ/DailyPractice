import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Random;

public class Entry {

    public static String getOne(BufferedReader re) throws Exception
    {
        ArrayList<String> LuckyGuys=new ArrayList<>();

        Random rand=new Random();

        int mumber_count=0;

        String readin;

        while ((readin=re.readLine())!=null)
        {
            mumber_count++;

            rand.nextInt(mumber_count);

            LuckyGuys.add(readin);
        }

        return LuckyGuys.get(rand.nextInt(mumber_count));
    }

    static String toChineseChar(int day)
    {
        String ChineseCh;
        switch (day)
        {
            case 0:ChineseCh="一";break;
            case 1:ChineseCh="二";break;
            case 2:ChineseCh="三";break;
            case 3:ChineseCh="四";break;
            case 4:ChineseCh="五";break;
            default:ChineseCh="NaN";break;
        }

        return ChineseCh;
    }


    public static void main(String[] args) throws Exception{

        String[] Department_List={"src/Table/cw.txt","src/Table/cy.txt","src/Table/gg.txt","src/Table/kj.txt","src/Table/lt.txt"
        ,"src/Table/rs.txt","src/Table/sj.txt","src/Table/xc.txt","src/Table/xm.txt","src/Table/yq.txt","src/Table/zc.txt"
        ,"src/Table/xw.txt"};      //这是暂时的一个文档。

        int classes=8;                                                   //按一天排八个班次来计算。

        ArrayList<String> Ifrepeat=new ArrayList<>();                    //用于查重的集合类。它是永久生效的，不可以写在循环里头

        for(int day=0;day<5;day++) {

            System.out.println("周"+toChineseChar(day)+"值班:\n");

            for (int i = 0; i < classes; i++) {

                Random rand = new Random();

                int Ip = rand.nextInt(Department_List.length);                     //有多少个部门，就从多少个部门开始随机抽人。

                File file = new File(Department_List[Ip]);                         //创建文件类。指向的是Name_List引用的路径。

                FileReader scan = new FileReader(file);

                BufferedReader reader = new BufferedReader(scan);

                String luckyDog = Entry.getOne(reader);

                reader.close();

                if (Ifrepeat.indexOf(luckyDog) == -1) {       //这一步是在查重。拿获取的名字去搜索“已存在名单”里。

                    System.out.println(luckyDog);

                    Ifrepeat.add(luckyDog);
                } else {

                    i--;  //如果发现了重名，本次循环作废。次数-1。

                }

            }

            System.out.println("\n\n");
        }

    }

}
