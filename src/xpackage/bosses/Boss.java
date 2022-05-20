package xpackage.bosses;

import java.util.Random;

import xpackage.heros.Hero;

public class Boss {
    /**
     * 所有boss的基类
     * 已取得阶段性成功
     */
	private String name;//名称
	private Double HP;//生命值
	private Double DEF;//防御力
	private Double damage;//攻击力
	private Integer critical_sr;//暴击率
	private Boolean armor_breaking;//是否能无视防御
	private Boolean shield_breaking;//是否能破盾
	public Random random = new Random();
	public Double Attack(Double HP/*被攻击者的生命值*/,Double DEF/*被攻击者的防御力*/) {
		if(GETarmor_breaking()){//如果破甲则执行
            DEF = 0.0;
        }
		Double final_damage = GETdamage() + (random.nextInt(21)-10)/**这一部分为伤害浮动 ±10 */;//最终的理论伤害
		Double hp = HP;
        if(final_damage < 0){//防止伤害小于0
            final_damage = 0.0;
        }
        if(Choose(GETcritical_sr())){//判断是否暴击
            final_damage = final_damage * 2;
        }
        Double damage_hp = Math.max(final_damage-DEF,0);//计算最终剩余生命值
        hp = hp - damage_hp;
        if(hp < 0){//防止生命值小于0
            hp = 0.0;
        }
        return hp;
	}
	public Double Attack(Hero hero/*被攻击的英雄*/) {//Attack优化方法
		Double hp = hero.GETHP();//生命值
		Double def;//防御力
		Boolean hasArmor;//是否有护甲
		if(!hero.GETarmor().equals(null) && hero.GETarmor().GETendurance() > 0) {
			def = hero.GETDEF() + hero.GETarmor().GETDEF();
			hasArmor = true;
		}else {
			def = hero.GETDEF();
			hasArmor = false;
		}
		if(GETarmor_breaking()){//如果破甲则执行
            def = 0.0;
        }
		Double final_damage = GETdamage() + (random.nextInt(21)-10)/**这一部分为伤害浮动 ±10 */;//最终的理论伤害
        if(final_damage < 0){//防止伤害小于0
            final_damage = 0.0;
        }
        if(Choose(GETcritical_sr())){//判断是否暴击
            final_damage = final_damage * 2;
        }
        Double damage_hp = Math.max(final_damage-def,0);//计算最终剩余生命值
        hp = hp - damage_hp;
        if(hp < 0){//防止生命值小于0
            hp = 0.0;
        }
        if(hasArmor && hero.GETarmor().GETendurance() > 0) {//如果有盔甲则减少盔甲耐久度
        	hero.GETarmor().SETendurance(hero.GETarmor().GETendurance() - 1);
        }
        return hp;
	}
	public Boolean Choose(Integer chance/**几率 */){//输入几率，有该几率的可能性返回true
        Integer randomnum = random.nextInt(100) + 1;
        if(randomnum <= chance){
            return true;
        }else{
            return false;
        }
    }
	/**
	 *获取和设置属性方法 
	 */
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
