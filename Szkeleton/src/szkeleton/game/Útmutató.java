package szkeleton.game;

import java.util.ArrayList;
import java.util.List;

public class Útmutató {
	
	private List<Nyersanyag> hozzavalok;
	private List<Nyersanyag> megvanLista;
	
	public Útmutató(List<Nyersanyag> kellenek) {
		
		Main.printer.print("["+this.toString()+ ".Útmutató()]");
		hozzavalok = new ArrayList<Nyersanyag>();
		for(Nyersanyag n : kellenek) {
			hozzavalok.add(n);
		}
		megvanLista = new ArrayList<Nyersanyag>();
		//Main.printer.dec();
	}
	
	public boolean MindMegvan(Nyersanyag ny) {
		Main.printer.print("[" + this + ".Mindmegvan(n)]");
		boolean answer;
		for(Nyersanyag n : hozzavalok) {
			Main.printer.inc();
			answer = n.Kompatibilis(ny);
			if(answer) {
				Main.printer.dec();
				return true;
			}
		}
		Main.printer.dec();
		return false;
	}
	public String toString() { return "Útmutató";}

}





