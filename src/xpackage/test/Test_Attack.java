package xpackage.test;

public class Test_Attack {
	public static void main(String[] args) {
		double damage = 100.0;//攻击力
		double def = 10.0;//防御力
		double armor_def = 10.0;//盔甲防御力
		double fdamage = Math.max(0, damage - (def + armor_def));//之前的攻击算法
		System.out.println(fdamage);
	}
}
