package xpackage.heros;

import xpackage.armors.Armor;

public class Hero {
	/**
     * 英雄（人物）的基类
     * 已取得阶段性成功
     */
	private String name;//名字
	private Double HP;//英雄的生命值
	private Double DEF;//英雄的基本防御力
	private Integer hungry;//饥饿值 最高为100
	private Integer level;//等级
	private Double experience;//经验值
	private Armor armor;//英雄的护甲
	public String GETname() {
		return this.name;
	}
	public Double GETHP() {
		return this.HP;
	}
	public Double GETDEF() {
		return this.DEF;
	}
	public Integer GEThungry() {
		return this.hungry;
	}
	public Integer GETlevel() {
		return this.level;
	}
	public Double GETexperience() {
		return this.experience;
	}
	public Armor GETarmor() {
		return this.armor;
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
	public void SEThungry(Integer hungry) {
		this.hungry = hungry;
	}
	public void SETlevel(Integer level) {
		this.level = level;
	}
	public void SETexperience(Double experience) {
		this.experience = experience;
	}
	public void SETarmor(Armor armor) {
		this.armor = armor;
	}
}
