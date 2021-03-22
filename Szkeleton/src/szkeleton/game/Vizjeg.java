package szkeleton.game;

import java.util.Scanner;

public class Vizjeg extends Nyersanyag {
	
	public Vizjeg() {
		Main.printer.print("[" + this.toString() + ".Vizjeg()]");
	}
	
	/**
	 * A Nyersanyag tulajdonba vételérõl szóló függvény. A Telepes itt veszi magához a kibányászott nyersanyagot,
	 * jelen esetben a Vízjeget.
	 * @param A Telepes, aki bányászik.
	 * @return Nincs.
	 */
	public void Betolt(Telepes a) {
		Main.printer.print("[" + this + ".Betolt(a)]");
		a.AddNyersanyag(this);
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
	
	/**
	 * A vízjég nöpkezlebn való viselkedését valósítja meg, kitörli a paraméterként kapott 
	 * aszteroida belsõ anyagát.
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke. 
	 */
	@Override
	public void Napkozel(Aszteroida a) {
		Main.printer.print("[" + this + ".Napkozel(a)]");
		Main.printer.inc();
		a.AnyagTorol();
		Main.printer.dec();
	}

	@Override
	public String toString() {
		return "Vizjeg";
	}

	
}
