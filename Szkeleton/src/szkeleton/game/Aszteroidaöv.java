package szkeleton.game;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aszteroidaöv {
	private List<Aszteroida> aszteroidak;
	private List<Entitás> jatekosok;
	
	public Aszteroidaöv() {
		Main.printer.print("[" + this + ".Aszteroidaöv()]");
		aszteroidak = new ArrayList<Aszteroida>();
		jatekosok = new ArrayList<>();
	}
	
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
	
	public void AddJatekos(Entitás e) {
		Main.printer.print("[" + this + ".AddJatekos(" + e + ")]");
		jatekosok.add(e);
	}
	
	@Override
	public String toString() { 
		return "Aszteroidaöv";
	} 
}
