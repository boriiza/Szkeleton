package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Szén;
import szkeleton.game.Telepes;
import szkeleton.game.Urán;
import szkeleton.game.Vas;
import szkeleton.game.Vízjég;
import szkeleton.game.Main;

public class banyaszas implements teszt{
	Telepes telepes;
	Aszteroida aszteroida;
	Szén szen;
	Vas vas;
	Vízjég viz;
	Urán uran;
	
	@Override
	public void init() {
		Main.printer.print("Init");
		telepes = new Telepes();
		aszteroida = new Aszteroida();
		
		aszteroida.AddEntitas(telepes);
		telepes.SetAszteroida(aszteroida);
		
		
	}

	@Override
	public void exec() {
		Main.printer.print("Exec");
		
		System.out.println(">Milyen vastag az aszteroida kérge?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		System.out.println(">Mit bányászik a Telepes? (0 = vas, 1 = szén, 2 = vízjég, 3 = urán)");
		int anyag = in.nextInt();
		switch(anyag) {
			case 0: Main.printer.inc(); vas = new Vas(); aszteroida.SetAnyag(vas); Main.printer.dec(); break;
			case 1: Main.printer.inc(); szen = new Szén(); aszteroida.SetAnyag(szen); Main.printer.dec(); break;
			case 2: Main.printer.inc(); viz = new Vízjég(); aszteroida.SetAnyag(viz); Main.printer.dec(); break;
			case 3: Main.printer.inc(); uran = new Urán(); aszteroida.SetAnyag(uran); Main.printer.dec(); break;
		}
		if(num == 0) {
			telepes.Banyaszat();
		}
		else {
			System.out.print(">Még nincs kifúrva az aszteroida\n");
		}
		
		
	}

}