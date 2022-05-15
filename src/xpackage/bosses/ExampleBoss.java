package xpackage.bosses;

import javax.swing.JTextArea;

public class ExampleBoss extends Boss{
	private String name = "迪亚波罗";//名称
	private Double HP = 500.0;//生命值
	private Double DEF = 50.0;//防御力
	private Double damage = 30.0;//攻击力
	private Integer critical_sr = 50;//暴击率
	private Boolean armor_breaking = false;//是否能无视防御
	private Boolean shield_breaking = false;//是否能破盾
	/**
	 *获取和设置属性方法 
	 */
	public Double Attack(Double HP/*被攻击者的生命值*/,Double DEF/*被攻击者的防御力*/,JTextArea j) {//测试方法
		j.append("\n-------------------------");
		if(GETarmor_breaking()){//如果破甲则执行
            DEF = 0.0;
            j.append("\n破甲了");
        }
		Double final_damage = GETdamage() + (random.nextInt(21)-10)/**这一部分为伤害浮动 ±10 */;//最终的理论伤害
		Double hp = HP;
		j.append("\n你的生命值:"+hp);
        if(final_damage < 0){//防止伤害小于0
            final_damage = 0.0;
        }
        j.append("\n老板浮动过后的伤害:"+final_damage);
        if(Choose(GETcritical_sr())){//判断是否暴击
            final_damage = final_damage * 2;
            j.append("\n暴击了，目前伤害为:"+final_damage);
        }
        Double damage_hp = Math.max(final_damage-DEF,0);//计算最终剩余生命值
        j.append("\n造成的伤害为:"+damage_hp);
        hp = hp - damage_hp;
        if(hp < 0){//防止生命值小于0
            hp = 0.0;
        }
        j.append("\n你剩余的生命值为:"+hp);
        j.append("\n-------------------------");
        return hp;
	}
	public String GETname() {
		return this.name;
	}
	public Double GETHP() {
		return this.HP;
	}
	public Double GETDEF() {
		return this.DEF;
	}
	public Double GETdamage() {
		return this.damage;
	}
	public Integer GETcritical_sr() {
		return this.critical_sr;
	}
	public Boolean GETarmor_breaking() {
		return this.armor_breaking;
	}
	public Boolean GETshield_breaking() {
		return this.shield_breaking;
	}
	public void SETname(String name) {
		this.name = name;
	}
	public void SETHP(Double HP) {
		this.HP = HP;
	}
	public void SETDEF(Double DEF) {
		this.DEF = DEF;
	}
	public void SETdamage(Double damage) {
		this.damage = damage;
	}
	public void SETcritical_sr(Integer critical_sr) {
		this.critical_sr = critical_sr;
	}
	public void SETarmor_breaking(Boolean armor_breaking) {
		this.armor_breaking = armor_breaking;
	}
	public void SETshield_breaking(Boolean shield_breaking) {
		this.shield_breaking = shield_breaking;
	}
}
