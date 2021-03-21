package szkeleton.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author
 *
 */

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
		Halal();
		Main.printer.dec();
	
	}
	
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
		Nyersanyag ny = aszteroida.AnyagKinyeres();
		if(nyersanyagok.size()<10) {
			ny.Betolt(this);
		}
		aszteroida.AnyagTorol();
	}
	
	public void Visszatolt() {
		Main.printer.print("["+this+".Visszatolt()]");
		Main.printer.inc();
		aszteroida.Raktaroz(nyersanyagok.get(nyersanyagok.size()-1));
		nyersanyagok.remove(nyersanyagok.size()-1);
		Main.printer.dec();
	}
	//void lett 
	public void RobotEpit() {
		Main.printer.print("[" + this + ".RobotEpit()]");
		Main.printer.inc();
		List<Nyersanyag> kellRobot = new ArrayList<Nyersanyag>();
		
		Main.printer.inc();
		kellRobot.add(new Szén());
		Main.printer.inc();
		kellRobot.add(new Urán());
		Main.printer.inc();
		kellRobot.add(new Vas());
		Main.printer.inc();
		
		Útmutató robotRecept = new Útmutató(kellRobot);
		Main.printer.print(">Hany Uran van a Telepesnel?");
		int num = Main.scanner.nextInt();
		for(int i = 0; i < num; i++) {
			if(nyersanyagok.size() <= 10) {
				Main.printer.inc();
				nyersanyagok.add(new Urán());
			}
		}
		Main.printer.print(">Hany Szen van a Telepesnel?");
		int sz = Main.scanner.nextInt();
		for(int i = 0; i < sz; i++) {
			if(nyersanyagok.size() <= 10) {
				Main.printer.inc();
				nyersanyagok.add(new Szén());
			}
		}
		Main.printer.print(">Hany Vas van a Telepesnel?");
		int vas = Main.scanner.nextInt();
		for(int i = 0; i < vas; i++) {
			if(nyersanyagok.size() <= 10) {
				Main.printer.inc();
				nyersanyagok.add(new Vas());
			}
		}
		int count = 0;
		for(Nyersanyag n : nyersanyagok) {
			Main.printer.inc();
			boolean answer = robotRecept.MindMegvan(n);
			if(answer)
				count++;
		}
		if(count >= 3) {
			Main.printer.inc();
			Robot r = new Robot();
			Main.printer.inc();
			r.SetAszteroida(this.aszteroida);
			Main.printer.inc();
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
	 * Ezen kívül beállítja, hogy a két teleportkapu egymás párjai.	 * 
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void KapuEpit() {
		Main.printer.print("[" + this + ".KapuEpit()]");
		//Main.printer.inc();
		List<Nyersanyag> kell = new ArrayList<Nyersanyag>();
		Main.printer.inc();
		kell.add(new Urán());
		Main.printer.inc();
		kell.add(new Vas());
		Main.printer.inc();
		kell.add(new Vas());
		Main.printer.inc();
		kell.add(new Vízjég());
		Main.printer.inc();
		Útmutató tkapu = new Útmutató(kell);
		Main.printer.print(">Hany Uran van a Telepesnel?");
		//Scanner in = new Scanner(System.in);
		int num = Main.scanner.nextInt();
		for(int i = 0; i < num; i++) {
			if(nyersanyagok.size() <= 10) {
				Main.printer.inc();
				nyersanyagok.add(new Urán());
			}
		}
		Main.printer.print(">Hany Szen van a Telepesnel?");
		int sz = Main.scanner.nextInt();
		for(int i = 0; i < sz; i++) {
			if(nyersanyagok.size() <= 10) {
				Main.printer.inc();
				nyersanyagok.add(new Szén());
			}
		}
		Main.printer.print(">Hany Vas van a Telepesnel?");
		int vas = Main.scanner.nextInt();
		for(int i = 0; i < vas; i++) {
			if(nyersanyagok.size() <= 10) {
				Main.printer.inc();
				nyersanyagok.add(new Vas());
			}
		}
		Main.printer.print(">Hany Vizjeg van a Telepesnel?");
		int vj = Main.scanner.nextInt();
		for(int i = 0; i < vj; i++) {
			if(nyersanyagok.size() <= 10) {
				Main.printer.inc();
				nyersanyagok.add(new Vízjég());
			}
		}
		int count = 0;
		for(Nyersanyag n : nyersanyagok) {
			Main.printer.inc();
			boolean answer = tkapu.MindMegvan(n);
			if(answer)
				count++;
		}
		if(count >= 4) {
			//Main.printer.inc();
			Teleportkapu k1 = new Teleportkapu();
			//Main.printer.inc();
			Teleportkapu k2 = new Teleportkapu();
			Main.printer.inc();
			kapuk.add(k1);
			Main.printer.inc();
			kapuk.add(k2);
			Main.printer.inc();
			k1.SetParja(k2);
			Main.printer.inc();
			k2.SetParja(k1);
		}
		else {
			Main.printer.print(">Nem epitheto teleportkapu");
		}
		Main.printer.dec();
	}
	
	public void KapuLerak() {
	}
	
	public void BazisEpit() {
	}
	
	/**
	 * A Telepes halálát intézõ függvény.
	 * @param Nincs átadott paramétere.
	 * @return Nincs visszatérési értéke.
	 */
	public void Halal() {
		Main.printer.print("[" + this + ".Halal()]");   //A
		Main.printer.dec();								//A
	}
	
	public void Lep() {
	}
	
	public void AddNyersanyag(Nyersanyag ny) {
		nyersanyagok.add(ny);
		Main.printer.print("[" + this + "].AddNyersanyag("+ny+")");
	}
	
	@Override
	public String toString() { 
		return "Telepes";
	} 
}
