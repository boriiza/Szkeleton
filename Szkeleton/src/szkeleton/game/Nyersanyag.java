package szkeleton.game;

public abstract class Nyersanyag {
	
	public Nyersanyag() {
		Main.printer.print("[" + this + ".Nyersanyag()]");
	}
	
	public abstract void Betolt(Telepes a);
	public abstract void Napkozel(Aszteroida a);
	
	/**
	 *Kompatibilitási vizsgálatot hajt végre a paraméterként kapott nyersanyag és aközött, amelyre a függvényt meghívták.
	 *@param Nyersanyag ny: Az a nyersanyag, amellyel összehasonlít
	 *@return kompatibilitás esetén true, inkompatibilitás esetén false értékkel tér vissza 
	 */
	public abstract boolean Kompatibilis(Nyersanyag ny);
}
