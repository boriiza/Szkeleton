package szkeleton.test;

import szkeleton.game.*;

public class vizjegfuras {

	Aszteroida a;
	Telepes t;
	Nyersanyag belsoAnyag;
	
	/**
	 * A vízjég maggal rendelkezõ aszteroida fúrásának teszteléséhez létrehozunk egy aszteroidát, 
	 * egy vízjeget, amelyet beállítunk az aszteroida magjának, valamint egy telepest, aki az aszteroidán tartózkodik. 
	 * Ez a telepes fog fúrni.
	 */
	public void init() {
		Main.printer.print("Init");
		a= new Aszteroida();
		t= new Telepes();
		belsoAnyag= new Vizjeg();
		a.AddEntitas(t);
		a.SetAnyag(belsoAnyag);
		t.SetAszteroida(a);
		
	}
	
	public void exec() {
		Main.printer.print("Exec");
		t.Furas();
	}
}
