package szkeleton.game;

public abstract class Nyersanyag {

	private Aszteroida aszteroida;
	private Aszteroida belsoAnyag;
	private Telepes nyersanyagok;
	
	public Nyersanyag() {
		Main.printer.print("[" + this + ".Nyersanyag()]");
		//Main.printer.dec();
	}
	
	public abstract void Betolt(Telepes a);
	public abstract void Napkozel(Aszteroida a);
	public abstract boolean Kompatibilis(Nyersanyag ny);
}
