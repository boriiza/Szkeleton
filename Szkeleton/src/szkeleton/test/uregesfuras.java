package szkeleton.test;

import szkeleton.game.Telepes;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;

public class uregesfuras implements teszt{

	Telepes t;
	Aszteroida a;
	
	/**
	 * Létrehozza a tesztesethez szükséges, Telepest és Aszteroidát, és beállítja a köztük lévõ kapcsolatot.
	 * @param Nincs étadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void init() {
		Main.printer.print("Init");
		a = new Aszteroida();
		t = new Telepes();
		t.SetAszteroida(a);
		a.AddEntitas(t);
	}
	
	public void exec() {
		Main.printer.print("Exec");
		t.Furas();
	}
}
