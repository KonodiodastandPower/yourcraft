package xpackage.bosses;

public class ExampleBoss extends Boss{
	private Double HP = 500.0;//生命值
	private Double DEF = 50.0;//防御力
	private Double damage = 10.0;//攻击力
	private Integer critical_sr = 50;//暴击率
	private Boolean armor_breaking = false;//是否能无视防御
	private Boolean shield_breaking = false;//是否能破盾
	/**
	 *获取和设置属性方法 
	 */
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
