package szkeleton.game;

import java.util.ArrayList;
import java.util.List;

public class Utmutato {
	
	private List<Nyersanyag> hozzavalok;
	private List<Nyersanyag> megvanLista;
	
	public Utmutato(List<Nyersanyag> kellenek) {
		Main.printer.print("["+this.toString()+ ".Útmutató()]");
		hozzavalok = new ArrayList<Nyersanyag>();
		for(Nyersanyag n : kellenek) {
			hozzavalok.add(n);
		}
		megvanLista = new ArrayList<Nyersanyag>();
	}
	
	
	/**
	 * Összehasonlítja a hozzávalók listán lévõ Nyersanyagokkal a paraméterként kapott Nyersanyagot, úgy 
	 * , hogy meghívja a Nyersanyagok Kompatibilis függvényét, és igazzal tér vissza, ha egyezést talál
	 * @param ny - Egy Nyersanyag, amit össze kell hasonlítani a hozzávalók listán lévõ nyersanyagokkal
	 * @return Egy logikai változó, ami megmondja, hogy egyezett-e egy, a listán lévõ 
	 * Nyersanyaggal a paraméterként kapott Nyersanyag
	 */
	public boolean MindMegvan(Nyersanyag ny) {
		Main.printer.print("[" + this + ".Mindmegvan(" + this + ")]");
		Main.printer.inc();
		boolean answer;
		for(Nyersanyag n : hozzavalok) {
			answer = n.Kompatibilis(ny);
			if(answer) {
				Main.printer.dec();
				return true;
			}
		}
		Main.printer.dec();
		return false;
	}
	public String toString() { 
		return "Útmutató";
	}

}





