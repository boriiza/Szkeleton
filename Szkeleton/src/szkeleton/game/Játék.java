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
