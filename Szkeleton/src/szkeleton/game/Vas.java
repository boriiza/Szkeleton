package szkeleton.game;

import java.util.Scanner;

public class Vas extends Nyersanyag {	
	
	public Vas() {
		Main.printer.print("[" + this + ".Vas()]");
	}

	/**
	 * A Nyersanyag tulajdonba vételérõl szóló függvény. A Telepes itt veszi magához a kibányászott nyersanyagot,
	 * jelen esetben a Vasat.
	 * @param A Telepes, aki bányászik.
	 * @return Nincs.
	 */
	public void Betolt(Telepes a) {
		Main.printer.print("[" + this + ".Betolt(a)]");
		a.AddNyersanyag(this);
	}

	public void Napkozel(Aszteroida a) {
		Main.printer.print("[" + this + ".Napkozel(a)]");
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
		Main.printer.print(">return: " + answer);
		if(answer.equals("i")) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public String toString() {
		return "Vas";
	}
}
