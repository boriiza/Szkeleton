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
	Telepes telepes;
	Teleportkapu kapu;
	
	
	@Override
	public void init() {
		Main.printer.print("Init");
		aszteroidaA = new Aszteroida();
		aszteroidaB = new Aszteroida();
		telepes = new Telepes();
		kapu = new Teleportkapu();
		
		aszteroidaA.AddEntitas(telepes);
		aszteroidaA.SetSzomszed(aszteroidaB);
		aszteroidaA.SetSzomszed(kapu);
		aszteroidaB.SetSzomszed(aszteroidaA);
		aszteroidaA.SetKapu(kapu);
		
	}

	@Override
	public void exec() {
		Main.printer.print("Init");
		System.out.println("Melyik szomszedra lepjen a Telepes?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		telepes.Mozgas(aszteroidaA.GetSzomszed(num));
		
		// TODO Auto-generated method stub
		
	}

}
