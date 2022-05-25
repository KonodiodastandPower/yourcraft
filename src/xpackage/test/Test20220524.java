package xpackage.test;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import xpackage.weapons.ExampleWeapon;

public class Test20220524 {
	public static void main(String[] args) {
		try {
			File file = new File("C:\\tmd.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			FileOutputStream fos = new FileOutputStream(file);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(new ExampleWeapon());
			oos.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
