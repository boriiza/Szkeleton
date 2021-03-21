package szkeleton.test;
import java.util.List;
import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Telepes;
import szkeleton.game.Teleportkapu;
import szkeleton.game.Main;

import szkeleton.game.Szomszéd;



public class telepesmozog implements teszt{
	Aszteroida aszteroidaA;
	Aszteroida aszteroidaB;
	Aszteroida aszteroidaC;
	Telepes telepes;
	Teleportkapu kapu1;
	Teleportkapu kapu2;
	
	
	@Override
	public void init() {
		Main.printer.print("Init");
		aszteroidaA = new Aszteroida();
		aszteroidaB = new Aszteroida();
		aszteroidaC = new Aszteroida();
		telepes = new Telepes();
		kapu1 = new Teleportkapu();
		kapu2 = new Teleportkapu();
		
		telepes.SetAszteroida(aszteroidaA);
		aszteroidaA.AddEntitas(telepes);
		aszteroidaA.SetSzomszed(aszteroidaB);
		aszteroidaB.SetSzomszed(aszteroidaA);
		aszteroidaA.SetKapu(kapu1);
		aszteroidaC.SetKapu(kapu2);
		kapu1.SetParja(kapu2);
		kapu1.SetAszteroida(aszteroidaA);
		kapu2.SetParja(kapu1);
		kapu2.SetAszteroida(aszteroidaB);
		
		
	}

	@Override
	public void exec() {
		Main.printer.print("Exec");
		Main.printer.print(">Hova lépjen a Telepes? (0 = aszteroidaB, 1 = aszteroidaC) "); 
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		//in.close();
		
		if(num == 0) {
			telepes.Mozgas(aszteroidaB);		
		}
		if(num == 1) {
			telepes.Mozgas(kapu1);
		}
		else {
			Main.printer.print(">A Telepes nem lép."); 
		}
		
		
		// TODO Auto-generated method stub
		
	}

}
