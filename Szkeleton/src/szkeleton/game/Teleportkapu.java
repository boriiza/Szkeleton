package szkeleton.game;

import java.util.Scanner;

/**
 * @author 
 *
 */

public class Teleportkapu extends Szomszéd {
	private Aszteroida aszteroida;
	private Teleportkapu parja;
	private Telepes kapuk;
	
	public Teleportkapu() {
		Main.printer.print("[" + this + ".Teleportkapu()]");
		//Main.printer.dec();
	}
	
	public Aszteroida ParHelye() {
		Main.printer.print("[" + this + ".ParHelye()]");
		return parja.aszteroida;
	}
	
	public void Robban() {
	}
	
	public void Befogad(Entitás a) {
		Main.printer.print("[" + this + ".Befogad()]");
		Main.printer.print(">Aktív a kapu? (0 = nem, 1 = igen)");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		
		if(num == 1) {
			Main.printer.inc();
			parja.aszteroida.Befogad(a);
			Main.printer.dec();
		}
		else{
			Main.printer.inc();
			aszteroida.Befogad(a);
			Main.printer.dec();
		}
		
	}
	
	/**
	 * A Teleportkapu beállítja a paraméterként kapott Teleportkaput párjának.
	 * @param Egy Teleportkapau, amit be kell állítania a párjának.
	 * @return Nincs visszatérési értéke.
	 */
	public void SetParja(Teleportkapu tk) {
		Main.printer.print("[" + this + ".SetParja(" + this + ")]");
		parja = tk;
		//Main.printer.dec();
	}
	public void SetAszteroida(Aszteroida a) {
		Main.printer.print("[" + this + ".SetAszteroida(" + this + ")]");
		aszteroida = a;
		//Main.printer.dec();
	}
	@Override
	public String toString() { 
		return "Teleportkapu";
	}
	
	
}
