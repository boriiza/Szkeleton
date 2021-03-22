package szkeleton.game;

public class Játék {
	private Aszteroidaöv jatekter;
	
	public Játék() {
		Main.printer.print("[" + this + ".Játék()]");
		jatekter = new Aszteroidaöv();
	}
	
	public void Start() {
	}
	
	public void Kor() {
	}
	
	public void Vege(boolean a) {
		Main.printer.print("[" + this + ".Vege()]");
		Main.printer.print("> A játék véget ért.");
		Main.printer.inc();
		if (a)
			Main.printer.print(">Eredmény: Gyõzelem");
		else
			Main.printer.print(">Eredmény: Veszteség");
		Main.printer.dec();
	}
}
