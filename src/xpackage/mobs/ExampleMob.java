package xpackage.mobs;

public class ExampleMob extends Mob{
    private String name = "小怪";//名称
    private Double HP = 100.0;//生命值
    private Double damage = 30.0;//伤害
    private Double DEF = 10.0;//防御力
    public String GETname(){
        return this.name;
    }
    public Double GETHP(){
        return this.HP;
    }
    public Double GETdamage(){
        return this.damage;
    }
    public Double GETDEF(){
        return this.DEF;
    }
    public void SETname(String name){
        this.name = name;
    }
    public void SETHP(Double HP){
        this.HP = HP;
    }
    public void SETdamage(Double damage){
        this.damage = damage;
    }
    public void SETDEF(Double DEF){
        this.DEF = DEF;
    }
}
