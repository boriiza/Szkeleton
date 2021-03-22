package szkeleton.game;


import java.util.ArrayList;
import java.util.List;

public class Aszteroidaov {
	private List<Aszteroida> aszteroidak;
	private List<Entitas> jatekosok;
	
	public Aszteroidaov() {
		Main.printer.print("[" + this + ".Aszteroidaov()]");
		aszteroidak = new ArrayList<Aszteroida>();
		jatekosok = new ArrayList<>();
	}
	
	/**
	 * Intézi az Aszteroidaövben a napvihart, meghívja az Aszteroidákon a Napvihar függvényüket.
	 * @param Nincs étadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void DoNapvihar() {
		Main.printer.print("[" + this + ".DoNapvihar()]");
		Main.printer.inc();
		aszteroidak.get(0).Napvihar();
	}
	
	public void MinuszAszteroida(Aszteroida a) {
	}
	
	public void AddAszteroida(Aszteroida a) {
		Main.printer.print("[" + this + ".AddAszteroida(" + a + ")]");
		aszteroidak.add(a);
	}
	
	public void AddJatekos(Entitas e) {
		Main.printer.print("[" + this + ".AddJatekos(" + e + ")]");
		jatekosok.add(e);
	}
	
	@Override
	public String toString() { 
		return "Aszteroidaov";
	} 
}
