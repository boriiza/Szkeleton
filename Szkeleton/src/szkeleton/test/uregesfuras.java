package szkeleton.test;

import szkeleton.game.Telepes;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;

public class uregesfuras implements teszt{

	Telepes t;
	Aszteroida a;
	
	public void init() {
		Main.printer.print("Init");
		a = new Aszteroida();
		t = new Telepes();
		t.SetAszteroida(a);
		a.AddEntitas(t);
	}
	
	public void exec() {
		Main.printer.print("Exec");
		t.Furas();
	}
}
