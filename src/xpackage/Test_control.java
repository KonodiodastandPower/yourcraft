package xpackage;

import xpackage.weapons.ExampleWeapon;
import xpackage.weapons.Weapon;

//测试控制类
public class Test_control {
    public static void main(String[] args) {
        ExampleWeapon wp = new ExampleWeapon();
        // System.out.println(wp.Attack(100.0,20.0));
        System.out.println(wp.Attack(100.0, 10000.0));
    }    
}
