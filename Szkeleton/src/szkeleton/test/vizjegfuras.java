package szkeleton.test;

import szkeleton.game.*;

public class vizjegfuras {

	Aszteroida a;
	Telepes t;
	Nyersanyag belsoAnyag;
	
	public void init() {
		Main.printer.print("Init");
		a= new Aszteroida();
		t= new Telepes();
		belsoAnyag= new Vízjég();
		a.AddEntitas(t);
		a.SetAnyag(belsoAnyag);
		t.SetAszteroida(a);
		
	}
	public void exec() {
		Main.printer.print("Exec");
		t.Furas();
	}
}
