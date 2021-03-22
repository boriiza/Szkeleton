package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Aszteroidaov;
import szkeleton.game.Main;
import szkeleton.game.Robot;
import szkeleton.game.Telepes;

public class napvihar {
	
	private Aszteroidaov jatekter;
	private Aszteroida a;
	private Telepes t;
	private Robot r;
	
	/**
	 * A tesztesethez szükséges pálya beállítása, létrehoz egy Aszteroidaövet, egy 
	 * Telepest, egy Aszteroidát és egy Robotot. Az Aszteroidaövhöz hozzáadja az entitásokat és az aszteroidát.
	 * Beállítja az entitások és az aszteroidák kapcsolatát.
	 */
	public void init() {
		Main.printer.print("Init");
		jatekter = new Aszteroidaov();
		a = new Aszteroida();
		t = new Telepes();
		r = new Robot();
		
		jatekter.AddAszteroida(a);
		jatekter.AddJatekos(t);
		jatekter.AddJatekos(r);
		a.AddEntitas(t);
		a.AddEntitas(r);
		t.SetAszteroida(a);
		r.SetAszteroida(a);
	}
	
	/**
	 * Megkérdezi a tesztelõt, hogy legyen-e napvihar. Ha igaz, akkor meghívódik az aszteroidövön a DoNapvihar() függvény,
	 * és végrehajtódik a npavihar. Ha hamis, akkor nem történik semmi.
	 */
	public void exec() {
		Main.printer.print("Exec");
		Main.printer.print("Letrejon napvihar? ('i' = igaz, 'h' = hamis)");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		if(answer.equals("i"))
			jatekter.DoNapvihar();
		else
			Main.printer.print("Nem jott letre napvihar");
	}
	
}
