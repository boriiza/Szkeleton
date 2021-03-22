package szkeleton.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Aszteroida extends Szomszed {
	private int kopenyVastagsag;
	private List<Teleportkapu> kapuk;
	private List<Entitas> entitasok;
	private List<Szomszed> szomszedok;
	private Nyersanyag belsoAnyag;
	private boolean napkozel;

	public Aszteroida() {
		Main.printer.print("[" + this + ".Aszteroida()]");
		kapuk = new ArrayList<Teleportkapu>();
		entitasok = new ArrayList<Entitas>();
		szomszedok = new ArrayList<Szomszed>();
		napkozel = false;
	}

	public void SetAnyag(Nyersanyag n) {
		belsoAnyag = n;
		Main.printer.print("[" + this + ".SetAnyag(" + n + ")]");
	}

	public int GetKopeny() {
		Main.printer.print(">return: " + kopenyVastagsag);
		return kopenyVastagsag;
	}

	public void SetKopeny(int i) {
		kopenyVastagsag = i;
	}

	/*
	public List<Szomszed> GetSzomszedok() {
		return this.szomszedok;
	}*/

	/**
	 * A paraméterként kapott Entitást hozzáadja az entitások listájához, így az
	 * aszteroidára kerül egy entitás.
	 * 
	 * @param Egy Entitás, amit hozzá kell adnia az Entitások listájához.
	 * @return Nincs visszatérési értéke.
	 */
	public void AddEntitas(Entitas e) {
		Main.printer.print("[" + this + ".AddEntitas(" + e + ")]");
		entitasok.add(e);
	}

	public void SetNapkozel(boolean b) {
		napkozel = b;
	}

	/**
	 * Visszaadja az aszteroida belsejében lévõ Nyersanyagot.
	 * @param Nincs átadott paramétere.
	 * @return Az aszteroida belsejében lévõ Nyersanyag.
	 */
	public Nyersanyag AnyagKinyeres() {
		Main.printer.print(">return: Nyersanyag");
		return belsoAnyag;
	}

	
	/**
	 * Az aszteroidát elhagyó Entitást kiveszi az Aszteroida az entitások listájából.
	 * @param a - Az Aszteroidát elhagyó Entitás.
	 * @return Nincs visszatérési értéke.
	 */
	public void Ledob(Entitas a) {
		Main.printer.print("["+this+".Ledob("+a+")]");
	}

	
	/**
	 *Az Aszteroidára érkezõ Entitást hozzáadja az enitátsok listájához.
	 *@param nincs átadott paramétere.
	 *@return Nincs visszatérési értéke.
	 */
	public void Befogad(Entitas a) {
		Main.printer.print("["+this+".Befogad("+a+")]");
		entitasok.add(a);
	}

	/**
	 * Az Aszteroidaövben létrejött Napvihar kezeli. Ha üres az aszteroida, akkor
	 * túlélik a rajta lévõ entitások. Ha nem üreges az aszteroida, akkor meghalnak
	 * a rajta lévõ entitások.
	 * 
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void Napvihar() {
		Main.printer.print("[" + this + ".Napvihar()]");
		Main.printer.print(">Ureges es atfurt az aszteroida? ('i' = igaz, 'h' = hamis)");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		Main.printer.print(">Ertek: " + answer);
		if (answer.equals("i")) {
			Main.printer.print(">A Telepesek es a Robotok el tudtak bujni");
		} else {
			for (Entitas e : entitasok) {
				Main.printer.inc();
				e.Halal();
			}
		}
		Main.printer.dec();
	}

	
	/**
	 * Kitörli a szomszédok listából a paraméterként kapott eddigi Szomszédját.
	 * @param a - Egy szomszéd, amit törölni kell a szomszédok listából.
	 * @return Nincs visszatérési értéke.
	 */
	public void SzomszedTorol(Szomszed a) {
		Main.printer.print("[" + this + ".SzomszedTorol()]");
		szomszedok.remove(a);

	}

	
	/**
	 * Létrehozza a Bázis megépítéséhez szükséges Útmutatót, és meghívja a rajta lévõ 
	 * Entitásokon a BazisEpit() függvényüket. Ezzel elindítja a bázis építést.
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void BazisEpit() {
		Main.printer.print("[" + this + ".BazisEpit()]");
		
		List<Nyersanyag> kell = new ArrayList<Nyersanyag>();
		Main.printer.inc();
		
		kell.add(new Uran());
		kell.add(new Uran());
		kell.add(new Uran());
		
		kell.add(new Vas());
		kell.add(new Vas());
		kell.add(new Vas());
		
		kell.add(new Vizjeg());
		kell.add(new Vizjeg());
		kell.add(new Vizjeg());
		
		kell.add(new Szen());
		kell.add(new Szen());
		kell.add(new Szen());
		
		Utmutato tkapu = new Utmutato(kell);
		
		for (int j = 0; j < entitasok.size(); j++) {
			entitasok.get(j).BazisEpit();
		}
		Main.printer.dec();
	}

	/**
	 * A telepes Furas() függvénye hívja meg. Az aszteroida kérgét csökkenti. ha a 
	 * kéreg vastagsága 0-ra csökken, megkérdezi, hogy napközelben van-e az aszteroida, 
	 * és ha igen, az aszteroida belsõ anyagán meghívja a Napkozel(Aszteroida a) függvényét.
	 * @param paraméterrel nem rendelkezik
	 * @return visszatérési értéke nincs
	 */
	public void KeregCsokken() {
		Main.printer.print("[" + this + ".KeregCsokken()]");
		kopenyVastagsag--;
		if (kopenyVastagsag == 0 && belsoAnyag != null) {
			Main.printer.print("Napkozelben van az aszteroida?   (i=igen, n=nem)");
			Scanner in = new Scanner(System.in);
			String sz = in.next();
			if (sz.equals("i")) {
				Main.printer.inc();
				this.belsoAnyag.Napkozel(this);
				Main.printer.dec();
			}
			Main.printer.print(">Nem lehet tovabb furni");
		}
	}

	
	/**
	 *Az aszteroida felrobbanása. Urán napközelbe kerülésekor hívódik meg, felrobbantja a rajta lévõ entitásokat,
	 *és kitörli az aszteroida magját.
	 *@param nincs paramétere
	 *@return nincs visszatérési értéke
	 */
	public void Robban() {
		Main.printer.print("[" + this + ".Robban()]");
		Main.printer.inc();
		for (Entitas e : entitasok) {
			e.Felrobban();
		}
		AnyagTorol();
		Main.printer.dec();

	}

	
	/**
	 * Az Aszteroida kiválasztja véletlenszerûen egy Szomszédját, amit visszaad.
	 * @param Nincs átadott paramétere.
	 * @return Az aaszteroida által kiválasztott szomszédot adja vissza.
	 */
	public Szomszed SzomszedotAd() { 
		Random rand = new Random(); 
		int randomNum = rand.nextInt(szomszedok.size());
		Main.printer.print("[" + this + ".SzomszedotAd()]");
		Main.printer.print(">return: Szomszed");
		return szomszedok.get(randomNum);
	}

	/**
	 * A nyersanyagok aszteroidába való betöltésére szolgáló függvény
	 * amennyiben az aszteroida éppen napközelben van, a nyersanyag Napkozel() függvénye meghívódik
	 * @param a Nyersanyag típusú paraméter, amelyet beállít az aszteroida belsõ magjaként
	 * @return nincs visszatérési értéke
	 */
	public void Raktaroz(Nyersanyag a) {
		Main.printer.print("[" + this + ".Raktaroz(Nyersanyag a)]");
		Main.printer.inc();
		belsoAnyag = a;
		if (napkozel) {
			a.Napkozel(this);
		}
		Main.printer.dec();
	}

	
	/**
	 * Kitörli a belsejében lévõ Nyersanyagot.
	 * @paramm Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void AnyagTorol() {
		Main.printer.print("[" + this + ".AnyagTorol()]");
		belsoAnyag = null;
	}

	public void SetSzomszed(Szomszed a) {
		Main.printer.print("[" + this + ".SetSzomszed(Szomszed a)]");
		szomszedok.add(a);
	}

	public void SetKapu(Teleportkapu t) {
		Main.printer.print("[" + this + ".SetKapu(Teleportkapu t)]");
		kapuk.add(t);
	}

	public Szomszed GetSzomszed(int n) {
		Main.printer.print("[" + this + ".GetSzomszed(int n)]");
		Main.printer.print(">return: Szomszed");
		return szomszedok.get(n);
	}

	@Override
	public String toString() {
		return "Aszteroida";
	}

}
