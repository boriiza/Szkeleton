package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Szen;
import szkeleton.game.Telepes;
import szkeleton.game.Uran;
import szkeleton.game.Vas;
import szkeleton.game.Vizjeg;
import szkeleton.game.Main;

public class banyaszas implements teszt{
	Telepes telepes;
	Aszteroida aszteroida;
	Szen szen;
	Vas vas;
	Vizjeg viz;
	Uran uran;
	
	/**
	 * Létrehoztunk egy Telepest és egy aszteroidát, a Telepes ezen az aszteroidán áll.
	 * Az aszteroida belsejében lévõ nyersanyagot, amit a Telepes ki fog bányászni
	 * a tesztelõ választja ki.
	 */
	@Override
	public void init() {
		Main.printer.print("Init");
		telepes = new Telepes();
		aszteroida = new Aszteroida();
		
		aszteroida.AddEntitas(telepes);
		telepes.SetAszteroida(aszteroida);
		
		
	}
	/**
	 * Amennyiben az aszteroida kérge nem 0, a Telepes nem tud bányászni. 
	 * Ha nulla, akkor a tesztelõ eldöntheti, hogy mit szeretne kibányászni.
	 * (Természetesen ez csak a tesztelés miatt, az igazi játékban
	 * alapból benne van az aszteroidában)
	 */
	@Override
	public void exec() {
		Main.printer.print("Exec");
		
		System.out.println(">Milyen vastag az aszteroida kerge?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		System.out.println(">Mit banyaszik a Telepes? (0 = vas, 1 = szen, 2 = vizjeg, 3 = uran)");
		int anyag = in.nextInt();
		switch(anyag) {
			case 0: Main.printer.inc(); vas = new Vas(); aszteroida.SetAnyag(vas); Main.printer.dec(); break;
			case 1: Main.printer.inc(); szen = new Szen(); aszteroida.SetAnyag(szen); Main.printer.dec(); break;
			case 2: Main.printer.inc(); viz = new Vizjeg(); aszteroida.SetAnyag(viz); Main.printer.dec(); break;
			case 3: Main.printer.inc(); uran = new Uran(); aszteroida.SetAnyag(uran); Main.printer.dec(); break;
		}
		if(num == 0) {
			telepes.Banyaszat();
		}
		else {
			System.out.print(">Meg nincs kifurva az aszteroida\n");
		}
		
		
	}

}