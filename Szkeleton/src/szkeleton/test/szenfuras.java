package szkeleton.test;

import java.util.Scanner;
import szkeleton.game.*;

public class szenfuras {
	Aszteroida aszteroida;
	Telepes t;
	
	
	public void init() {
		Main.printer.print("Init:");
		aszteroida= new Aszteroida();
		Szén s= new Szén();
		aszteroida.SetAnyag(s);
		t= new Telepes();
		t.SetAszteroida(aszteroida);
	}
	
	public void exec() {
		Main.printer.inc();
		t.Furas();
		Main.printer.dec();
	}
}
