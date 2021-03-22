package szkeleton.test;

import szkeleton.game.*;


public class uranfuras implements teszt {

	Aszteroida aszteroida;
	Aszteroida szomszed;
	Telepes t;
	Robot r;
	
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
