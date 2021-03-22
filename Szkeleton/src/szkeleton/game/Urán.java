package szkeleton.game;

import java.util.Scanner;

public class Urán extends Nyersanyag {

	public Urán() {
		Main.printer.print("[" + this + ".Uran()]");
		//Main.printer.dec();

	}
	/**
	 * A Nyersanyag tulajdonba vételérõl szóló függvény. A Telepes itt veszi magához a kibányászott nyersanyagot,
	 * jelen esetben az Uránt.
	 * @param A Telepes, aki bányászik.
	 * @return Nincs.
	 */
	public void Betolt(Telepes a) {
		Main.printer.print("[" + this + ".Betolt(a)]");
		a.AddNyersanyag(this);
	}
	

	/**
	 *Az urán viselkedését valósítja meg, ha az napközelbe kerül, tehát felrobbantja a paraméterként kapott aszteroidát
	 *@param Aszteroida a: az az aszteroida, amelyen a robbanás megtörténik, ennek az aszteroidának a magja az adott urán.
	 *@return visszatérési értékkel nem rendelkezik
	 */
	@Override
	public void Napkozel(Aszteroida a) {
		Main.printer.print("[" + this + "].Napkozel(a)");	
		Main.printer.inc();
		a.Robban();
		Main.printer.dec();
	}

	/**
	 * A Nyersanyagok összehasonlítását végzõ függvény.
	 * @param A Nyersanyag, amivel össze kell hasonlítania önmagát.
	 * @return Egy logikai változó, ami megmondja, hogy ugyanolyan fajátjúak-e az összehasonlított Nyersanyagok.
	 */
	public boolean Kompatibilis(Nyersanyag ny) {
		Main.printer.print("[" + this + ".Kompatibilis(" + this + ")]");
		Main.printer.print(">Megfelel a nyersanyag? ('i' = igaz, 'h' = hamis)");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		if(answer.equals("i")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Urán";
	}
	
}
