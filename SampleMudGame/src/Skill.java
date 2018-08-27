import java.security.PublicKey;

abstract class Skill {   //在此处声明Skill抽象类。

    public String SKILLNAME;
    private int COLD_TIME;  //所有的技能都应该具有冷却时间。

    Skill(String skill_name,int setting_cold_time)  //在外部规定冷却时间。
    {
        COLD_TIME=setting_cold_time;
        SKILLNAME=skill_name;
    }

    public int getCOLD_TIME() {
        return COLD_TIME;
    }

    public String getSKILLNAME() {
        return SKILLNAME;
    }
}

class Active_Skill extends Skill{

    private int hit;  //主动技能造成的伤害值。

    Active_Skill(String skill_name,int cold_time,int hit)
    {
        super(skill_name,cold_time);
        this.hit=hit;
    }

    public int getHit() {
        return hit;
    }

}
