package xpackage.armors;

public class Armor implements Armors{
    /**
     * 所有护甲的基类
     * 已取得阶段性成功
     */
	private Double DEF;//盔甲的防御力
	private Integer endurance;//盔甲的耐久度
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
