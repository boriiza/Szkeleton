package szkeleton.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import szkeleton.game.Main;

/**
 * @author
 *
 */

public class Aszteroida extends Szomszéd {
	private int kopenyVastagsag;
	private List<Teleportkapu> kapuk;
	private List<Entitás> entitasok;
	private List<Szomszéd> szomszedok;
	private Nyersanyag belsoAnyag;
	private boolean napkozel;

	public Aszteroida() {
		Main.printer.print("[" + this + ".Aszteroida()]");
		kapuk = new ArrayList<Teleportkapu>();
		entitasok = new ArrayList<Entitás>();
		szomszedok = new ArrayList<Szomszéd>();
		napkozel = false;
	}

	public void SetAnyag(Nyersanyag n) {
		belsoAnyag = n;
		Main.printer.print("[" + this + ".SetAnyag(" + n + ")]");
	}

	public int GetKopeny() {
		return kopenyVastagsag;
	}

	public void SetKopeny(int i) {
		kopenyVastagsag = i;
	}

	public List<Szomszéd> GetSzomszedok() {
		return this.szomszedok;
	}

	/**
	 * A paraméterként kapott Entitást hozzáadja az entitások listájához, így az
	 * aszteroidára kerül egy entitás.
	 * 
	 * @param Egy Entitás, amit hozzá kell adnia az Entitások listájához.
	 * @return Nincs visszatérési értéke.
	 */
	public void AddEntitas(Entitás e) {
		Main.printer.print("[" + this + "].[AddEntitas(" + e + ")]");
		entitasok.add(e);
	}

	public void SetNapkozel(boolean b) {
		napkozel = b;
	}

	public Nyersanyag AnyagKinyeres() {
		return belsoAnyag;
	}

	public void Ledob(Entitás a) {
		Main.printer.print("["+this+".Ledob("+a+")]");
		entitasok.remove(a);
	}

	public void Befogad(Entitás a) {
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
			for (Entitás e : entitasok) {
				Main.printer.inc();
				e.Halal();
			}
		}
		Main.printer.dec();
		// in.close();
	}

	public void SzomszedTorol(Szomszéd a) {
		Main.printer.print("[" + this + ".SzomszedTorol()]");
		szomszedok.remove(a);

	}

	public void BazisEpit() {
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
		if (kopenyVastagsag == 0) {
			Main.printer.print("Napkozelben van az aszteroida?   (i=igen, n=nem)");
			Scanner in = new Scanner(System.in);
			String sz = in.next();
			if (sz.equals("i")) {
				this.belsoAnyag.Napkozel(this);
			}
			Main.printer.print(">Nem lehet tovabb furni");

		}
		Main.printer.dec();
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
		for (Entitás e : entitasok) {
			e.Felrobban();
		}
		AnyagTorol();
		Main.printer.dec();

	}

	public Szomszéd SzomszedotAd() { // random szomszédot ad
		Random rand = new Random(); // a szomszédok listából
		int randomNum = rand.nextInt(szomszedok.size());
		Main.printer.print("[" + this + "].[SzomszedotAd()]");
		return szomszedok.get(randomNum);
	}

	/**
	 * A nyersanyagok aszteroidába való betöltésére szolgáló függvény
	 * amennyiben az aszteroida éppen napközelben van, a nyersanyag Napkozel() függvénye meghívódik
	 * @param a Nyersanyag típusú paraméter, amelyet beállít az aszteroida belsõ magjaként
	 * @return nincs visszatérési értéke
	 */
	public void Raktaroz(Nyersanyag a) {
		Main.printer.print("[" + this + "].[Raktaroz(Nyersanyag a)]");
		belsoAnyag = a;
		if (napkozel) {
			Main.printer.inc();
			a.Napkozel(this);
		}
		Main.printer.dec();
	}

	public void AnyagTorol() {
		Main.printer.print("[" + this + "].[AnyagTorol()]");
		belsoAnyag = null;
	}

	public void SetSzomszed(Szomszéd a) {
		Main.printer.print("[" + this + "].[SetSzomszéd(Szomszéd a)]");
		szomszedok.add(a);
	}

	public void SetKapu(Teleportkapu t) {
		Main.printer.print("[" + this + "].[SetKapu(Teleportkapu t)]");
		kapuk.add(t);
	}

	public Szomszéd GetSzomszed(int n) {
		Main.printer.print("[" + this + "].[GetSzomszed(int n)]");
		return szomszedok.get(n);
	}

	@Override
	public String toString() {
		return "Aszteroida";
	}

}
