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
			case 0: notover = false; printer.print("Viszlat!"); break;
			case 1:
				break;
			case 2:
				break;
			case 3:
				uranfuras ur= new uranfuras();
				ur.init();
				ur.exec();
				break;
			case 4:
				vizjegfuras vf= new vizjegfuras();
				vf.init();
				vf.exec();
				break;
			case 5:
				vasfuras vs= new vasfuras();
				vs.init();
				vs.exec();
				break;
				
			case 6:
				szenfuras sf= new szenfuras();
				sf.init();
				sf.exec();
				break;
			case 7: 
				uregesfuras uf = new uregesfuras();
				uf.init();
				uf.exec();
				break;
			case 8:
				break;
			case 9:
				napvihar np = new napvihar();
				np.init();
				np.exec();
				break;
			case 10:
				break;
			case 11:
				robotepites ro = new robotepites();
				ro.init();
				ro.exec();
				break;
			case 12:
				teleportkapuEpites tkp = new teleportkapuEpites();
				tkp.init();
				tkp.exec();
				break;
			case 13:
				break;
			case 14:
				break;
			case 15:
				break;
			case 16:
				break;
			case 17:
				szenbetolt tszb = new szenbetolt();
				tszb.init();
				tszb.exec();
				break;
			case 18:
				break;
		}
		}
		
	}
}
