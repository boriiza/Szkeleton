package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.*;

public class vizjegfuras {

	Aszteroida a;
	Telepes t;
	Nyersanyag belsoAnyag;
	
	public void init() {
		a= new Aszteroida();
		t= new Telepes();
		belsoAnyag= new Vízjég();
		a.AddEntitas(t);
		a.SetAnyag(belsoAnyag);
		t.SetAszteroida(a);
		
	}
	public void exec() {
		Main.printer.inc();
		t.Furas();
		Main.printer.dec();
	}
}
