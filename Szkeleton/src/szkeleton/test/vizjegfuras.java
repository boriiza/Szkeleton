package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.*;

public class vizjegfuras {

	Aszteroida a;
	Telepes t;
	Nyersanyag belsoAnyag;
	
	public void init() {
		a= new Aszteroida();
		t= new Telepes();
		belsoAnyag= new Vízjég();
		a.AddEntitas(t);
		a.SetAnyag(belsoAnyag);
		
	}
	public void exec() {
		System.out.println("Milyen vastag a köpeny?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (num > 1) {
			a.SetKopeny(num);
			t.Furas();
			System.out.println("Az aszteroida kérgének vastagsága"+ a.GetKopeny());
		}
		else {
			if(num==1) {
				Main.printer.inc();
				t.Furas();
				System.out.println("Napközelben van az aszteroida?      i/n");
				String be= in.next();
				in.close();
				if(be=="i") {
					Main.printer.inc();
					Nyersanyag anyag=a.AnyagKinyeres();
					anyag.Napkozel(a);
				}
			}
			else if(num==0) {
				System.out.println("Nem fúrhat tovább, bányássza ki a nyersanyagot");
			}
			else {
				System.out.println("Érvénytelen érték");
			}
		}
	}
}
