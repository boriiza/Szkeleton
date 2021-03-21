package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Main;

public class Print {
	
	private int inc;
	
	public Print() {
		inc = 0;
	}
	
	public void print(String s) {
		if(inc >= 0) {
			for(int i = 0; i < inc; i++) {
				System.out.print("\t");
			}
		}
		System.out.println(s);
	}
	
	public int getInc() {
		return inc;
	}
	
	public void setInc(int i) {
		inc = i;
	}
	
	public void inc() {
		inc++;
	}
	
	public void dec() {
		inc--;
	}
	
	public int menu(Scanner scan) {
		System.out.println("Program muveletei");
		System.out.println("\t0: Kilepes");
		System.out.println("Mozgas");
		System.out.println("\t1: Telepes mozog");
		System.out.println("\t2: Robot mozog");
		System.out.println("Aszteroida muvelet");
		System.out.println("\t3: Uran furas");
		System.out.println("\t4: Vizjeg furas");
		System.out.println("\t5: Vas furas");
		System.out.println("\t6: Szen furas");
		System.out.println("\t7: Ureges aszteroida furas");
		System.out.println("\t8: Banyaszas");
		System.out.println("Veszhelyzetek");
		System.out.println("\t9: Napvihar inditas");
		System.out.println("\t10: Telepes meghal");
		System.out.println("Epites");
		System.out.println("\t11: Robotepites");
		System.out.println("\t12: Kapuepites");
		System.out.println("\t13: Bazisepites");
		System.out.println("\t14: Kapu lerakas");
		System.out.println("Visszatoltes");
		System.out.println("\t15: Uran visszatoltes");
		System.out.println("\t16: Vizjeg visszatoltes");
		System.out.println("\t17: Szen visszatoltes");
		System.out.println("\t18: Vas visszatoltes");
		System.out.println("Utasitas sorszama ->");
		int num = scan.nextInt();
		//Main.scanner.close();
		//in.close();
return num;
	}
}
