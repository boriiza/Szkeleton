package szkeleton.game;

import java.util.List;
import java.util.Random;

public class Robot extends Entitás {
	
	public Robot() {
		Main.printer.print("["+this.toString()+"].[Robot()]");
		Main.printer.print("[" + this + ".Robot()]");
	}
	
	public void Mozgas(Szomszéd a) {
		Main.printer.print("["+this+"].[Mozgas("+a+")]");
		
		Main.printer.inc();
		aszteroida.Ledob(this);
		Main.printer.dec();
		Main.printer.inc();
		a.Befogad(this);
		Main.printer.dec();
	}
	
	public void Felrobban() {
		Main.printer.print("["+this+"].[Felrobban()]");
		Main.printer.inc();
		Szomszéd a= aszteroida.SzomszedotAd();		//random szomszédot kér
		this.aszteroida.Ledob(this);
		this.Mozgas(a);
		a.Befogad(this);
	}
	
	/**
	 * A Robot halálát intézõ függvény.
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void Halal() {
		Main.printer.print("[" + this + ".Halal()]");
		Main.printer.dec();	
	}
	
	public void Lep() {
	}
	
	@Override 
	public String toString() {
		return "Robot";
	}
	
}
