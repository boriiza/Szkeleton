package szkeleton.test;
import java.util.Scanner;

import szkeleton.game.*;


public class vasfuras {
	
	Aszteroida aszteroida;
	Telepes t;
	
	
	/**
	 * A vas belsejû aszteroida fúrásának teszteléséhez létrehozunk egy aszteroidát, egy vasat, amely az aszteroida magja lesz, 
	 * valamint egy telepest, aki az aszteroidán tartózkodik és fúrást tud végezni
	 */
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
