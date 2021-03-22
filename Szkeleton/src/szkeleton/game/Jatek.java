package szkeleton.game;

public class Jatek {
	private Aszteroidaov jatekter;
	
	public Jatek() {
		Main.printer.print("[" + this + ".Jatek()]");
		jatekter = new Aszteroidaov();
	}
	
	public void Start() {
	}
	
	public void Kor() {
	}
	
	
	/**
	 * A játék végét kezelõ függvény, ha igaz paramétert kap, akkor gyõznek a játékosok,
	 * ha hamisat, akkor vesztenek.
	 * @param a - A játék vágkimenetlét eldöntõ logikai változó.
	 * @return Nincs visszatérési értéke.
	 */
	public void Vege(boolean a) {
		Main.printer.print("[" + this + ".Vege()]");
		Main.printer.inc();
		Main.printer.print("> A jatek veget ert.");
		if (a)
			Main.printer.print(">Eredmeny: Gyozelem");
		else
			Main.printer.print(">Eredmeny: Veszteseg");
		Main.printer.dec();
	}
	
	@Override
	public String toString() {
		return "Jatek";
	}
	
}
