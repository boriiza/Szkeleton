package szkeleton.game;

import java.util.ArrayList;
import java.util.List;

public class Telepes extends Entitás {
	
	private List<Teleportkapu> kapuk;
	private List<Nyersanyag> nyersanyagok;
	
	public Telepes() {
		Main.printer.print("[" + this + ".Telepes()]");
		kapuk = new ArrayList<>();
		nyersanyagok = new ArrayList<>();
	}
	
	public void Felrobban() {
		Main.printer.print("["+this+".Felrobban()]");
		Main.printer.inc();
		
		for (int i = 0; i < kapuk.size(); i++)
			kapuk.get(i).Robban();
		
		Halal();
		Main.printer.dec();
	
	}
	
	/**
	 * A Telepes mozgatásáért felelõs függvény. 
	 * @param Az a szomszéd a paraméter, amelyre az Telepes mozogni fog.
	 * @return Nincs visszatérési értéke.
	 */
	public void Mozgas(Szomszéd a) {
		Main.printer.print("["+this+".Mozgas(" + a + ")]");
		Main.printer.inc();
		aszteroida.Ledob(this);
		Main.printer.dec();
		Main.printer.inc();
		a.Befogad(this);
		Main.printer.dec();

	}
	
	public void Banyaszat() {
		Main.printer.print("["+this+".Banyaszat()]");
		Main.printer.inc();
		Nyersanyag ny = aszteroida.AnyagKinyeres();
		if(nyersanyagok.size()<10) {
			ny.Betolt(this);
		}
		aszteroida.AnyagTorol();
		Main.printer.dec();
	}
	
	public void Visszatolt() {
		Main.printer.print("["+this+".Visszatolt()]");
		Main.printer.inc();
		aszteroida.Raktaroz(nyersanyagok.get(nyersanyagok.size()-1));
		nyersanyagok.remove(nyersanyagok.size()-1);
		Main.printer.dec();
	}
	
	/**
	 * A robot megépítésére szolgáló függvény. A robotot a Telepes építi, ha minden nyersanyag nála van, ami kell.
	 * A teszt során nem ellenõrzi a nyersanyagok típusát, ha 3 igen választ kap, az építés megtörténik
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void RobotEpit() {
		Main.printer.print("[" + this + ".RobotEpit()]");
		Main.printer.inc();
		List<Nyersanyag> kellRobot = new ArrayList<Nyersanyag>();
		
		kellRobot.add(new Szén());
		kellRobot.add(new Urán());
		kellRobot.add(new Vas());
		Útmutató robotRecept = new Útmutató(kellRobot);
		Main.printer.print(">Hany Uran van a Telepesnel?");
		int num = Main.scanner.nextInt();
		for(int i = 0; i < num; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Urán());
			}
		}
		Main.printer.print(">Hany Szen van a Telepesnel?");
		int sz = Main.scanner.nextInt();
		for(int i = 0; i < sz; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Szén());
			}
		}
		Main.printer.print(">Hany Vas van a Telepesnel?");
		int vas = Main.scanner.nextInt();
		for(int i = 0; i < vas; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Vas());
			}
		}
		int count = 0;
		for(Nyersanyag n : nyersanyagok) {
			boolean answer = robotRecept.MindMegvan(n);
			if(answer)
				count++;
		}
		if(count >= 3) {
			Robot r = new Robot();
			r.SetAszteroida(this.aszteroida);
			aszteroida.Befogad(r);
		}
		else {
			Main.printer.print(">Nem epitheto robot");
		}
		Main.printer.dec();
	}
	
	
	/**
	 * A Telepes létrehoz egy Útmutatót, ami alapján megépítheti a Teleportkapu-párt. 
	 * Az Útmutatónak egyesével átadja a nála lévõ nyersanyagokat, ami leellenõrzi, hogy van-e egyezés.
	 * Ha megvan az összes nyersanyag, akkor megépíti a telepes a teleportkapu-párt, és elraktározza.
	 * Ezen kívül beállítja, hogy a két teleportkapu egymás párjai.	 
	 * A teszt során nem ellenõrzi a nyeersanyagok típusát, ha 4 igen választ kap a tesztelõtõl, az építés megtörténik. 
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void KapuEpit() {
		Main.printer.print("[" + this + ".KapuEpit()]");
		List<Nyersanyag> kell = new ArrayList<Nyersanyag>();
		Main.printer.inc();
		kell.add(new Urán());
		kell.add(new Vas());
		kell.add(new Vas());
		kell.add(new Vízjég());
		Útmutató tkapu = new Útmutató(kell);
		Main.printer.print(">Hany Uran van a Telepesnel?");
		int num = Main.scanner.nextInt();
		for(int i = 0; i < num; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Urán());
			}
		}
		Main.printer.print(">Hany Szen van a Telepesnel?");
		int sz = Main.scanner.nextInt();
		for(int i = 0; i < sz; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Szén());
			}
		}
		Main.printer.print(">Hany Vas van a Telepesnel?");
		int vas = Main.scanner.nextInt();
		for(int i = 0; i < vas; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Vas());
			}
		}
		Main.printer.print(">Hany Vizjeg van a Telepesnel?");
		int vj = Main.scanner.nextInt();
		for(int i = 0; i < vj; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Vízjég());
			}
		}
		int count = 0;
		for(Nyersanyag n : nyersanyagok) {
			boolean answer = tkapu.MindMegvan(n);
			if(answer)
				count++;
		}
		if(count >= 4) {
			Teleportkapu k1 = new Teleportkapu();
			Teleportkapu k2 = new Teleportkapu();
			kapuk.add(k1);
			kapuk.add(k2);
			k1.SetParja(k2);
			k2.SetParja(k1);
		}
		else {
			Main.printer.print(">Nem epitheto teleportkapu");
		}
		Main.printer.dec();
	}
	/**
	 * A telepes
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void KapuLerak() {
		Main.printer.print("["+this+".KapuLerak()]");
		Main.printer.inc();
		if (kapuk.size() > 0) {
			aszteroida.SetKapu(kapuk.get(0));
			kapuk.get(0).SetAszteroida(aszteroida);
			kapuk.remove(0);
		}
		else
			Main.printer.print(">A Telepes nem tud kaput lerakni, mert nincs nála");
		
		Main.printer.dec();
	}
	
	public void BazisEpit() {
		
		Main.printer.print("[" + this + ".BazisEpit()]"); // TODO Nem lehet megcsinálni, ha az Útmutató nincs implementálva
		Main.printer.inc();
		Main.printer.print(">Hany Uran van a Telepesnel?");
		int num = Main.scanner.nextInt();
		for(int i = 0; i < num; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Urán());
			}
		}
		Main.printer.print(">Hany Szen van a Telepesnel?");
		int sz = Main.scanner.nextInt();
		for(int i = 0; i < sz; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Szén());
			}
		}
		Main.printer.print(">Hany Vas van a Telepesnel?");
		int vas = Main.scanner.nextInt();
		for(int i = 0; i < vas; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Vas());
			}
		}
		Main.printer.print(">Hany Vizjeg van a Telepesnel?");
		int vj = Main.scanner.nextInt();
		for(int i = 0; i < vj; i++) {
			if(nyersanyagok.size() < 10) {
				nyersanyagok.add(new Vízjég());
			}
		}
		Main.printer.dec();
	}
	
	/**
	 * A Telepes halálát intézõ függvény.
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void Halal() {
		Main.printer.print("[" + this + ".Halal()]");
	}
	
	public void Lep() {
	}
	
	public void AddNyersanyag(Nyersanyag ny) {
		nyersanyagok.add(ny);
		Main.printer.print("[" + this + ".AddNyersanyag("+ny+")");
	}
	
	@Override
	public String toString() { 
		return "Telepes";
	} 
	
	public void AddKapu(Teleportkapu tk) {
		Main.printer.print("[" + this + ".AddNyersanyag("+tk+")");
		kapuk.add(tk);
	}
}
