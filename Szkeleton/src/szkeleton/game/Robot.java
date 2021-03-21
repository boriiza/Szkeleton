package szkeleton.game;

import java.util.List;
import java.util.Random;

public class Robot extends Entitás {
	
	public Robot() {
		//Main.printer.print("["+this.toString()+"].[Robot()]");
		Main.printer.print("[" + this + ".Robot()]");
	}
	/**
	 * Robot mozgása a véletlenszerûen kapott szomszédra.
	 * @param Az a szomszéd a paraméter, amelyre az robot mozogni fog.
	 * @return Nincs visszatérési értéke.
	 */
	public void Mozgas(Szomszéd a) {
		//Main.printer.inc();
		Main.printer.print("["+this+".Mozgas("+a+")]");
		Main.printer.inc();
		aszteroida.Ledob(this);
		a.Befogad(this);
		Main.printer.dec();
	}
	
	/**
	 *Az aszteroida felrobbanásakor hívódik meg, a robot felrobbantására szolgál.
	 *robbanáskor a robot az aszteroidája egyik random szomszédjára repül át
	 *@param paraméter nélküli függvény
	 *@return nem rendelkezik visszatérési értékkel
	 */
	public void Felrobban() {
		Main.printer.print("["+this+".Felrobban()]");
		Main.printer.inc();
		Szomszéd a= aszteroida.SzomszedotAd();		//random szomszédot kér
		this.Mozgas(a);
		Main.printer.dec();
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
