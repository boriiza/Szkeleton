package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.*;


public class uranfuras implements teszt {

	Aszteroida aszteroida;
	Telepes t;
	Robot r;
	
	public void init() {
		Main.printer.print("Init:");
		aszteroida=new Aszteroida();
		t= new Telepes();
		r=new Robot();
		Urán u= new Urán();
		aszteroida.SetAnyag(u);
		aszteroida.AddEntitas(t);
		aszteroida.AddEntitas(r);
		
	}
	
	public void exec() {
		Main.printer.print("Exec:");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (num > 1) {
			aszteroida.SetKopeny(num);
			t.Furas();
			System.out.println("Az aszteroida kérgének vastagsága"+ aszteroida.GetKopeny());
		}
		else if(num==1) {
		System.out.println("Napközelben van asz aszteroida?   i/n");
		String be=in.next();
		in.close();
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
			if(num==0) {
				System.out.println("Nem fúrhat tovább, bányássza ki a nyersanyagot");
			}
			else
				System.out.println("Érvénytelen érték");
			
		}
	}
	
}
