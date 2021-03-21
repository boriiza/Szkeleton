package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.*;


public class uranfuras implements teszt {

	Aszteroida aszteroida;
	Aszteroida szomszed;
	Telepes t;
	Robot r;
	
	public void init() {
		Main.printer.print("Init:");
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
		Main.printer.print("Exec:");
		//Main.printer.print("Milyen vastag az aszteroida köpenye?");
		//Scanner in = new Scanner(System.in);
		//int sz = in.nextInt();
		//if (sz > 1) {
			Main.printer.inc();
			//aszteroida.SetKopeny(sz);
			t.Furas();
			Main.printer.dec();
		}
		/*else if(sz==1) {
		Main.printer.print("Napközelben van az aszteroida?   (i=igen, n=nem");
		String be=in.next();
		if (be=="i") {
			Main.printer.inc();
		
			t.Furas();
			Nyersanyag anyag=aszteroida.AnyagKinyeres();
			anyag.Napkozel(aszteroida);
			aszteroida.Robban();
			Main.printer.dec();
		}
		else if (be=="n") {
			Main.printer.inc();
			t.Furas();
			Main.printer.dec();
		}
			
		}
		else {
			if(sz==0) {
				Main.printer.print("Nem fúrhat tovább, bányássza ki a nyersanyagot");
			}
			else
				Main.printer.print("Érvénytelen érték");
			
		}
		in.close();
		}
*/
	
	
}
