package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;
import szkeleton.game.Szen;
import szkeleton.game.Telepes;


public class szenbetolt implements teszt {

	Aszteroida aszteroida;
	Telepes t;
	
	
	/**
	 *A betöltés szempontjából fontos objektumok létrejönnek és összekapcsoljuk õket:
	 *A 0 köpenyû aszteroida és a rajta álló telepes.
	 */
	@Override
	public void init() {
		Main.printer.print("Init:");
		aszteroida= new Aszteroida();
		aszteroida.SetAnyag(null);
		aszteroida.SetKopeny(0);
		t= new Telepes();
		t.SetAszteroida(aszteroida);
		aszteroida.AddEntitas(t);
	}
	
	
	/**
	 *A betöltés szempontjából fontos feltételeket megkérdezi a tesztelõtõl:
	 *Üreges-e az aszteroida, van-e a betölteni kívánt nyersanyagból a telepesnél.
	 *Majd ezek beállítása után meghívja a Visszatöltés függvényt.
	 */
	@Override
	public void exec() {
		Scanner in = new Scanner(System.in);
		Main.printer.print("Ureges az aszteroida? ('i' = igen, 'n' = nem)");
		String answer = Main.scanner.nextLine();
		if(answer.equals("i")) {
			Main.printer.print("Van szen a telepesnél? ('i' = igen, 'n' = nem)");
			answer = Main.scanner.nextLine();
			if(answer.equals("i")) {
				t.AddNyersanyag(new Szen());
				Main.printer.inc();
				t.Visszatolt();
				if(aszteroida.AnyagKinyeres() != null)
					Main.printer.print("Az aszteroida belso anyaga :"+ aszteroida.AnyagKinyeres().toString());
				else
					Main.printer.print("Az aszteroida belso anyaga : ureges");
			}
			else {
				if(answer.equals("n")) {
					Main.printer.print("Az akcio nem hajthato vegre : A telepesnel nincs szen");
				}
				else {
					Main.printer.print("Ervenytelen valasz");
				}
			}
		}
		else {
			if(answer.equals("n")) {
				Main.printer.print("Az akció nem hajtható végre: Nem üreges az aszteroida");
			}
			else {
				Main.printer.print("Érvénytelen válasz");
			}
		}
	}



}