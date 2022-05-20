package xpackage.armors;

public class ExampleArmor extends Armor{
	private Double DEF = 30.0;//盔甲的防御力
	private Integer endurance = 10;//盔甲的耐久度
	public Double GETDEF() {
		return this.DEF;
	}
	public Integer GETendurance() {
		return this.endurance;
	}
	public void SETDEF(Double DEF) {
		this.DEF = DEF;
	}
	public void SETendurance(Integer endurance) {
		this.endurance = endurance;
	}
}
