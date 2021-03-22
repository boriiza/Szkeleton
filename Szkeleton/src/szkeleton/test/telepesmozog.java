package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Telepes;
import szkeleton.game.Teleportkapu;
import szkeleton.game.Main;


public class telepesmozog implements teszt{
	Aszteroida aszteroidaA;
	Aszteroida aszteroidaB;
	Aszteroida aszteroidaC;
	Telepes telepes;
	Teleportkapu kapu1;
	Teleportkapu kapu2;
	
	/**
	 * Létrehoztunk egy Telepest. A Telepes az aszteroidaA-n áll. 
	 * Az aszteroidaA közvetlen szomszédja az aszteroidaB.
	 * Az aszteroidaA-ról a Telepes elérheti az aszteroidaC-t teleportkapun keresztül.
	 * Az aszteroidaA teleportkapuja a kapu1, az aszteroidaC teleportkapuja a kapu2.
	 */
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
	/**
	 * A tesztelõ választhat, hogy az aszteroidaA melyik szomszédjára kíván elmenni.
	 * Az aszteroidaC esetén teleportkapukon keresztül fog utazni.
	 * Amennyiben nem 0-t vagy 1-t ír a tesztelõ a Telepes nem tud elmenni.
	 */
	@Override
	public void exec() {
		Main.printer.print("Exec");
		Main.printer.print(">Hova lepjen a Telepes? (0 = aszteroidaB, 1 = aszteroidaC) "); 
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(num == 0) {
			telepes.Mozgas(aszteroidaB);		
		}
		else if(num == 1) {
			telepes.Mozgas(kapu1);
		}
		else {
			Main.printer.print(">A Telepes nem lép."); 
		}
		
	}

}
