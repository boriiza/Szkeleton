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
		telepes = new Telepes();
		aszteroida = new Aszteroida();
		szen = new Szén();
		vas = new Vas();
		viz = new Vízjég();
		uran = new Urán();
		
		aszteroida.AddEntitas(telepes);
		
	}

	@Override
	public void exec() {
		Main.printer.print("Init");
		
		System.out.println("Milyen vastag az aszteroida kérge?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		
		System.out.println("Mit bányászik a Telepes? (0 = vas, 1 = szén, 2 = vízjég, 3 = urán)");
		Scanner in2 = new Scanner(System.in);
		int anyag = in2.nextInt();
		in2.close();
		switch(anyag) {
			case 0: aszteroida.SetAnyag(vas); break;
			case 1: aszteroida.SetAnyag(szen); break;
			case 2: aszteroida.SetAnyag(viz); break;
			case 3: aszteroida.SetAnyag(uran); break;
		}
		
		if(num == 0) {
			telepes.Banyaszat();
		}
		else {
			System.out.print("Még nincs kifúrva az aszteroida");
		}
		
		
	}

}