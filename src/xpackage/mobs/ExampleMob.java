package xpackage.mobs;

import javax.swing.JTextArea;

public class ExampleMob extends Mob{
    private String name = "小怪";//名称
    private Double HP = 100.0;//生命值
    private Double damage = 30.0;//伤害
    private Double DEF = 10.0;//防御力
    public Double Attack(Double HP,Double DEF/**被攻击者的生命值和防御力 */,JTextArea j){//攻击方法,返回剩余的生命值
    	j.append("-------------------------");
    	j.append("你的生命值:"+HP);
        Double final_damage = Math.max(0.0, GETdamage() + random.nextInt(21) - 10 - DEF);
        j.append("最终伤害为:"+final_damage);
        j.append("你剩余的生命值为:"+(HP - final_damage));
        j.append("-------------------------");
        return (HP - final_damage);
    }
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
