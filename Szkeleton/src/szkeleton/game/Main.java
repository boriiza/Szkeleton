package szkeleton.game;

import java.util.Scanner;

import szkeleton.test.Print;
import szkeleton.test.*;

public class Main {

	public static final Print printer = new Print();
	public static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		boolean notover = true;
		while(notover) {
			int input = printer.menu(new Scanner(System.in));
			switch(input) {
			case 0: notover = true; break;
			case 1:
			case 2:
			case 3:
				uranfuras ur= new uranfuras();
				ur.init();
				ur.exec();
				break;
			case 4:
			case 5:
				
			case 6:
			case 7: 
				uregesfuras uf = new uregesfuras();
				uf.init();
				uf.exec();
				break;
			case 8:
			case 9:
				napvihar np = new napvihar();
				np.init();
				np.exec();
				break;
			case 10:
			case 11:
			case 12:
				teleportkapuEpites tkp = new teleportkapuEpites();
				tkp.init();
				tkp.exec();
				break;
			case 13:
			case 14:
			case 15:
			case 16:
			case 17:
				szenbetolt tszb = new szenbetolt();
				tszb.init();
				tszb.exec();
				break;
			case 18:
		}
		}
		
	}
}
