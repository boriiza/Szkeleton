package szkeleton.game;

import java.util.Scanner;

import szkeleton.test.*;

public class Main {

	public static Print printer;
	public static Scanner scanner;
	
	public static void main(String[] args) {
		printer = new Print();
		printer.setInc(0);
		scanner = new Scanner(System.in);
		boolean notover = true;
		while(notover) {
			int input = printer.menu(new Scanner(System.in));
			switch(input) {
			case 0: notover = false; printer.print("Viszlat!"); break;
			case 1:
				telepesmozog tm = new telepesmozog();
				tm.init();
				tm.exec();
				break;
			case 2:
				robotmozog rm = new robotmozog();
				rm.init();
				rm.exec();
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
				banyaszas ba = new banyaszas();
				ba.init();
				ba.exec();
				break;
			case 9:
				napvihar np = new napvihar();
				np.init();
				np.exec();
				break;
			case 10:
				telepesmeghal th = new telepesmeghal();
				th.init();
				th.exec();
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
				bazisepites bep = new bazisepites();
				bep.init();
				bep.exec();
				break;
			case 14:
				kapulerak kep = new kapulerak();
				kep.init();
				kep.exec();
				break;
			case 15:
				uranbetolt tub = new uranbetolt();
				tub.init();
				tub.exec();
				break;
			case 16:
				vizjegbetolt tvjb = new vizjegbetolt();
				tvjb.init();
				tvjb.exec();
				break;
			case 17:
				szenbetolt tszb = new szenbetolt();
				tszb.init();
				tszb.exec();
				break;
			case 18:
				vasbetolt tvb = new vasbetolt();
				tvb.init();
				tvb.exec();
				break;
		}
		}
		
	}
}
