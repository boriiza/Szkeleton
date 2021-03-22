package szkeleton.game;

import java.util.Scanner;

public class Teleportkapu extends Szomszed {
	private Aszteroida aszteroida;
	private Teleportkapu parja;
	private Telepes kapuk;
	
	public Teleportkapu() {
		Main.printer.print("[" + this + ".Teleportkapu()]");
	}
	
	/**
	 * Megadja, hogy a teleportkapu párja melyik aszteroidán helyezkedik el
	 * @param nem rendelkezik paraméterrel
	 * @return Aszteroida visszatérési értékkel rendelkezik, ez az az aszteroida, amely elérhetõ az adott kapun keresztül
	 */
	public Aszteroida ParHelye() {
		Main.printer.print("[" + this + ".ParHelye()]");
		Main.printer.print(">return: Aszteroida");
		return parja.aszteroida;
	}
	
	public void Robban() {
		Main.printer.print("["+this+".Robban()]");
		parja.SetParja(null);
	}
	
	/**
	 *Az entitás mozgása során hívódik meg, feladata, hogy a kiválasztott kapun átlépve
	 * eljuttassa az entitást az azon keresztül elérhetõ aszteroidára.
	 * Amennyiben a kapu párja nem aktív, az entitás az aktuális aszteroidán marad.
	 * @param Entitas a: az az Entitás, akit el kell szállítani a megfelelõ aszteroidára.
	 * @return visszatérési értékkel nem rendelkezik
	 */
	public void Befogad(Entitas a) {
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
	}
	
	public void SetAszteroida(Aszteroida a) {
		Main.printer.print("[" + this + ".SetAszteroida(" + this + ")]");
		aszteroida = a;
	}
	
	@Override
	public String toString() { 
		return "Teleportkapu";
	}
	
	
}
