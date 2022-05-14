package xpackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import xpackage.bosses.Boss;
import xpackage.bosses.ExampleBoss;
import xpackage.mobs.ExampleMob;
import xpackage.mobs.Mob;
import xpackage.weapons.*;

//测试控制类
public class Test_control {
    /**
     * 目前看来
     * 方法一切正常
     * 希望如此
     */
    public static void main(String[] args) {
        JFrame jf = new TFrame();
        Weapon weapon = new ExampleWeapon();
//        Mob mob = new ExampleMob();
        Boss boss = new ExampleBoss();
        JButton jb = new JButton("攻击");
        System.out.println(weapon.GETdamage());
        jb.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                boss.SETHP(weapon.Attack(boss.GETHP(), boss.GETDEF()));
                System.out.println(boss.GETHP());
            }
            
        });
        jf.add(jb);
        jf.validate();
    }    
}
class TFrame extends JFrame{
    public TFrame(){
        setTitle("测试窗口");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,300,300);
        setLayout(new FlowLayout());

        setVisible(true);
    }
}