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
