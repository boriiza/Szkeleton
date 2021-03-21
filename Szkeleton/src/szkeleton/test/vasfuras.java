package szkeleton.test;
import java.util.Scanner;

import szkeleton.game.*;


public class vasfuras {
	
	Aszteroida aszteroida;
	Telepes t;
	
	
	public void init() {
		aszteroida= new Aszteroida();
		Vas v= new Vas();
		aszteroida.SetAnyag(v);
		t= new Telepes();
		t.SetAszteroida(aszteroida);
	}
	
	public void exec() {
		Main.printer.inc();
		t.Furas();
		Main.printer.dec();
	}
}
