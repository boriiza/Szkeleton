package szkeleton.test;
import java.util.Scanner;

import szkeleton.game.*;


public class vasfuras {
	
	Aszteroida aszteroida;
	Telepes t;
	
	
	public void init() {
		Main.printer.print("Init");
		aszteroida= new Aszteroida();
		Vas v= new Vas();
		aszteroida.SetAnyag(v);
		t= new Telepes();
		t.SetAszteroida(aszteroida);
	}
	
	public void exec() {
		Main.printer.print("Exec");
		t.Furas();
	}
}
