package xpackage;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import xpackage.mobs.ExampleMob;
import xpackage.mobs.Mob;
import xpackage.weapons.*;

//测试控制类
public class Test_control {
    /**
     * 目前看来
     * 方法一切正常
     * 希望如此
     * @param args
     */
    public static void main(String[] args) {
        JFrame jf = new TFrame();
        Weapon weapon = new ExampleWeapon();
        Mob mob = new ExampleMob();
        JButton jb = new JButton("Text");
        jb.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                mob.SETHP(weapon.Attack(mob.GETHP(), mob.GETDEF()));
                System.out.println(mob.GETHP());
            }
            
        });
        jf.add(jb);
    }    
}
class TFrame extends JFrame{
    public TFrame(){
        setTitle("测试窗口");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(100,100,200,200);
        setLayout(new FlowLayout());

        setVisible(true);
    }
}