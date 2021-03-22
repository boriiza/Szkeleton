package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.*;


public class uranfuras implements teszt {

	Aszteroida aszteroida;
	Aszteroida szomszed;
	Telepes t;
	Robot r;
	
	/**
	 *az urán maggal rendelkezõ aszteroida fúrását szimuláló teszt. az init()függvényben létrejön egy telepes és egy robot és két
	 *aszteroida. Az egyik, amelyen az entitások találhatók,a másik pedig az elõbbi aszteroida szomszédja.
	 *a telepest és a robotot feltesszük az aszteroidára, az aszteroidát pedig beállítjuk az entitások attribútumaként.
	 *A szomszéd aszteroidára azért van szükség, hogy a robbanás során a robot el tudjon repülni.
	 */
	public void init() {
		Main.printer.print("Init");
		aszteroida=new Aszteroida();
		szomszed=new Aszteroida();
		t= new Telepes();
		r=new Robot();
		Urán u= new Urán();
		t.SetAszteroida(aszteroida);
		r.SetAszteroida(aszteroida);
		aszteroida.SetAnyag(u);
		aszteroida.AddEntitas(t);
		aszteroida.AddEntitas(r);
		aszteroida.SetSzomszed(szomszed);
		szomszed.SetSzomszed(aszteroida);
		
	}
	
	public void exec() {
		Main.printer.print("Exec");
		t.Furas();
		}
}
