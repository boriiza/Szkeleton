package szkeleton.game;

import java.util.Scanner;

public class Szén extends Nyersanyag {
	
	/*public Szén() {
		Main.printer.print("["+this.toString()+ "].[Szén()]");
	}*/


	public Szén() {
		Main.printer.print("[" + this + ".Szen()]");
		Main.printer.dec();
	}
	
	/**
	 * A Nyersanyag tulajdonba vételérõl szóló függvény. A Telepes itt veszi magához a kibányászott nyersanyagot,
	 * jelen esetben a Szenet.
	 * @param A Telepes, aki bányászik.
	 * @return Nincs.
	 */
	public void Betolt(Telepes a) {
		Main.printer.print("[" + this + ".Betolt(a)]");
		a.AddNyersanyag(this);
	}
	
	@Override
	public void Napkozel(Aszteroida a) {
		Main.printer.print("[" + this + ".Napkozel(a)]");
		Main.printer.dec();
	}
	
	/**
	 * A Nyersanyagok összehasonlítását végzõ függvény.
	 * @param A Nyersanyag, amivel össze kell hasonlítania önmagát.
	 * @return Egy logikai változó, ami megmondja, hogy ugyanolyan fajátjúak-e az összehasonlított Nyersanyagok.
	 */
	public boolean Kompatibilis(Nyersanyag ny) {
		Main.printer.print("[" + this + ".Kompatibilis(ny)]");
		Main.printer.print(">Megfelel a nyersanyag? ('i' = igaz, 'h' = hamis)");
		//Scanner in = new Scanner(System.in);
		String answer = Main.scanner.nextLine();
		//in.close();
		if(answer.equals("i")) {
			Main.printer.dec();
			return true;
		}
		else {
			Main.printer.dec();
			return false;
		}
	}

	@Override 
	public String toString() {
		return "Szén";
	}

}
