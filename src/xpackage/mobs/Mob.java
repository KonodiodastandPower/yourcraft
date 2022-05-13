package xpackage.mobs;

import java.util.Random;

public class Mob {
    /**
     * 小怪的基类
     * 施工中...
     * 
     */
    private String name;//名称
    private Double HP;//生命值
    private Double damage;//伤害
    private Double DEF;//防御力
    public Random random = new Random();
    public Double Attack(Double HP,Double DEF/**被攻击者的生命值和防御力 */){//攻击方法,返回剩余的生命值
        Double final_damage = Math.max(0.0, GETdamage() + random.nextInt(21) - 10 - DEF);
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
