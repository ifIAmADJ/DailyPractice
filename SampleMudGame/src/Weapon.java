class Weapon {
    public String Weapon_name;    //可以查看武器名称。
    private int Physical_Attack;  //一旦初始化生成武器之后，不允许外部直接对内部属性进行更改。
    private int Magic_Attack;

    Weapon(String Weapon_name,int Physical_Attack,int Magic_Attack)
    {
        this.Weapon_name=Weapon_name;
        this.Physical_Attack=Physical_Attack;
        this.Magic_Attack=Magic_Attack;
    }

    int getPhysical_Attack()
    {
        return Physical_Attack;
    }

    int getMagic_Attack()
    {
        return Magic_Attack;
    }


}

class Sword extends Weapon implements Attack
{
    Sword(String Weapon_name,int Physical_Attack,int Magic_Attack)
    {
        super(Weapon_name,Physical_Attack,Magic_Attack);
    }

    @Override
    public int attack()
    {
        return (int)( Math.random()*super.getPhysical_Attack()); //基于设定武器的物理攻击设定伤害
    }
}

class Staff extends Weapon implements Attack
{
    Staff(String Weapon_name,int Physical_Attack,int Magic_Attack)
    {
        super(Weapon_name,Physical_Attack,Magic_Attack);
    }

    @Override
    public int attack()
    {
        return  Math.abs((int)(Math.random()*super.getMagic_Attack()));  //基于设定武器的强度设定伤害
    }
}