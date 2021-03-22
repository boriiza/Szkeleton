package szkeleton.game;

public class Jatek {
	private Aszteroidaov jatekter;
	
	public Jatek() {
		Main.printer.print("[" + this + ".Játék()]");
		jatekter = new Aszteroidaov();
	}
	
	public void Start() {
	}
	
	public void Kor() {
	}
	
	public void Vege(boolean a) {
		Main.printer.print("[" + this + ".Vege()]");
		Main.printer.inc();
		Main.printer.print("> A játék véget ért.");
		if (a)
			Main.printer.print(">Eredmény: Gyõzelem");
		else
			Main.printer.print(">Eredmény: Veszteség");
		Main.printer.dec();
	}
	
	@Override
	public String toString() {
		return "Játék";
	}
	
}
