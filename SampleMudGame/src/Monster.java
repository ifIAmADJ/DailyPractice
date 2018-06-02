class Monster implements Attack{

    double Hit_point;
    private int Physical_Attack;
    private int Magic_Attack;
    private int Physical_Defend;
    private int Magic_Defend;

    Monster(int hit_point,int physical_Attack,int magic_Attack,int physical_Defend,int magic_Defend)
    {
        this.Hit_point=hit_point;
        this.Physical_Attack=physical_Attack;
        this.Magic_Attack=magic_Attack;
        this.Physical_Defend=physical_Defend;
        this.Physical_Defend=magic_Defend;
    }


    int getPhysical_Defend()
    {
        return Physical_Defend;
    }

    int getMagic_Defend()
    {
        return Magic_Defend;
    }

    @Override
    public int attack()
    {
        return (int)(Math.random()*Physical_Attack);
    }

}
