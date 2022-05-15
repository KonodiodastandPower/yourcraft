package xpackage.test;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import xpackage.XFrame;
import xpackage.bosses.Boss;
import xpackage.bosses.ExampleBoss;
import xpackage.heros.ExampleHero;
import xpackage.heros.Hero;
import xpackage.mobs.ExampleMob;
import xpackage.mobs.Mob;
import xpackage.weapons.ExampleWeapon;
import xpackage.weapons.Weapon;

public class Test_2020515 {
	/**
	 *这是测试
	 */
	public static void main(String[] args) {
		XFrame xf = new XFrame();
		xf.setTitle("Test");
		xf.setLayout(new BorderLayout());
		
		ExampleWeapon weapon = new ExampleWeapon();
		ExampleMob mob = new ExampleMob();
		ExampleBoss boss = new ExampleBoss();
		Hero hero = new ExampleHero();
		
		JTextArea jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		
		PrintAll(weapon,mob,boss,hero,jta);
		
		JButton jb = new JButton("攻击boss");
		JButton jb2 = new JButton("攻击mob");
		jb.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				jta.append("\n你攻击了老板");
				boss.SETHP(weapon.Attack(boss.GETHP(), boss.GETDEF(),jta));
				jta.append("\n你遭到了老板的反击");
				hero.SETHP(boss.Attack(hero.GETHP(), hero.GETDEF(),jta));
			}
		});
		jb2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				jta.append("\n你攻击了小怪");
				mob.SETHP(weapon.Attack(mob.GETHP(), mob.GETDEF(),jta));
				jta.append("\n你遭到了小怪的反击");
				hero.SETHP(mob.Attack(hero.GETHP(), hero.GETDEF(),jta));
			}
		});
		
		
		
		xf.add(jsp,BorderLayout.CENTER);
		xf.add(jb,BorderLayout.NORTH);
		xf.add(jb2,BorderLayout.SOUTH);
		xf.validate();
	}

	private static void PrintAll(Weapon weapon,Mob mob,Boss boss,Hero hero,JTextArea jtextarea) {
		jtextarea.append("你的名字:"+hero.GETname()+";你的生命值:"+hero.GETHP()+";你的基本防御力:"+hero.GETDEF());
		jtextarea.append("\n武器名称:"+weapon.GETname()+";武器伤害:"+weapon.GETdamage()+";武器暴击率:"+weapon.GETcritical_sr()+"%");
		jtextarea.append("\n武器是否无视防御:"+weapon.GETarmor_breaking()+";武器耐久度:"+weapon.GETendurance());
		jtextarea.append("\n小怪名称:"+mob.GETname()+";小怪伤害:"+mob.GETdamage()+";小怪生命:"+mob.GETHP()+";小怪防御力:"+mob.GETDEF());
		jtextarea.append("\n老板名称:"+boss.GETname()+";老板伤害:"+boss.GETdamage()+";老板暴击率:"+boss.GETcritical_sr()+"%"+";老板生命值:"+boss.GETHP()+";老板防御力:"+boss.GETDEF());
	}
}
