package szkeleton.test;

import szkeleton.game.Aszteroida;
import szkeleton.game.Aszteroidaöv;
import szkeleton.game.Main;
import szkeleton.game.Robot;
import szkeleton.game.Telepes;

public class napvihar {
	
	private Aszteroidaöv jatekter;
	private Aszteroida a;
	private Telepes t;
	private Robot r;
	
	public void init() {
		Main.printer.print("Init");
		jatekter = new Aszteroidaöv();
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
	
	public void exec() {
		Main.printer.print("Exec");
		jatekter.DoNapvihar();
	}
	
}
