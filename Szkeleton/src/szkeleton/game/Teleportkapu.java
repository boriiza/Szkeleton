package szkeleton.game;

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
		return parja.aszteroida;
	}
	
	public void Robban() {
	}
	
	public void Befogad(Entitás a) {
	}
	
	/**
	 * A Teleportkapu beállítja a paraméterként kapott Teleportkaput párjának.
	 * @param Egy Teleportkapau, amit be kell állítania a párjának.
	 * @return Nincs visszatérési értéke.
	 */
	public void SetParja(Teleportkapu tk) {
		Main.printer.print("[" + this + ".SetParja(" + this + ")]");
		parja = tk;
		Main.printer.dec();
	}
	
	@Override
	public String toString() { 
		return "Teleportkapu";
	}
}
