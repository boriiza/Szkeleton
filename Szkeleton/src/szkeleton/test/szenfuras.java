package szkeleton.test;

import java.util.Scanner;
import szkeleton.game.*;

public class szenfuras {
	Aszteroida aszteroida;
	Telepes t;
	
	
	/**
	 * A szén belsejû aszteroida fúrásának teszteléséhez létrehozunk egy aszteroidát, egy szenet,
	 *  amelyet beállítunk az aszteroida magjaként, valamint egy telepest, aki az aszteroidán tartózkodik és aki a fúrást fogja végezni
	 */
	public void init() {
		Main.printer.print("Init");
		aszteroida= new Aszteroida();
		Szén s= new Szén();
		aszteroida.SetAnyag(s);
		t= new Telepes();
		t.SetAszteroida(aszteroida);
	}
	
	public void exec() {
		Main.printer.print("Exec");
		t.Furas();
	}
}
