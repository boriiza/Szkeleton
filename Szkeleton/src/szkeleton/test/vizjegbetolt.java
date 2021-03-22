package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;
import szkeleton.game.Telepes;
import szkeleton.game.Vizjeg;

public class vizjegbetolt implements teszt {

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
	 *Üreges-e az aszteroida, van-e a betölteni kívánt nyersanyagból a telepesnél, napközelben van-e az aszteroida.
	 *Majd ezek beállítása után meghívja a Visszatöltés függvényt.
	 */
	@Override
	public void exec() {
		Scanner in = new Scanner(System.in);
		Main.printer.print("Ureges az aszteroida? ('i' = igen, 'n' = nem)");
		String answer = in.nextLine();
		if(answer.equals("i"))
		{
			Main.printer.print("Van vizjeg a telepesnel? ('i' = igen, 'n' = nem)");
			answer = in.nextLine();
			if(answer.equals("i"))
				{
				t.AddNyersanyag(new Vizjeg());
				Main.printer.print("Napkozelben van az aszteroida? ('i' = igen, 'n' = nem)");
				answer = in.nextLine();
				if(answer.equals("i"))
					aszteroida.SetNapkozel(true);
				Main.printer.inc();
				t.Visszatolt();
				if(aszteroida.AnyagKinyeres() != null)
					Main.printer.print("Az aszteroida belso anyaga :"+ aszteroida.AnyagKinyeres().toString());
				else
					Main.printer.print("Az aszteroida belso anyaga : ureges");
				}
			else {
				if(answer.equals("n")) {
					Main.printer.print("Az akcio nem hajtható vegre : A telepesnel nincs vizjeg");
				}
				else {
					Main.printer.print("Ervenytelen valasz");
				}
			}
		}
		else{
			if(answer.equals("n")) {
				Main.printer.print("Az akcio nem hajthato vegre : Az aszteroida nem ureges");
			}
			else {
				Main.printer.print("Ervenytelen valasz");
			}
		}
	}
}