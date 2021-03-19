package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.*;


public class uranfuras {

	Aszteroida aszteroida;
	Telepes t;
	Robot r;
	
	public void SetUp() {
		aszteroida=new Aszteroida();
		t= new Telepes();
		r=new Robot();
		Urán u= new Urán();
		aszteroida.SetAnyag(u);
		aszteroida.AddEntitas(t);
		aszteroida.AddEntitas(r);
		
	}
	
	public void furas() {
		System.out.println("Milyen vastag a köpeny?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		if (num > 1) {
			aszteroida.SetKopeny(num);
			t.Furas();
			System.out.println("Az aszteroida kérgének vastagsága"+ aszteroida.GetKopeny());
		}
		if(num==1) {
		System.out.println("Napközelben van asz aszteroida?");
		String be=in.next();
		if (be=="i") {
			t.Furas();
			Nyersanyag anyag=aszteroida.AnyagKinyeres();
			anyag.Napkozel();
			aszteroida.Robban();
		}
			
		}
		else {
			if(num==0) {
				System.out.println("Nem fúrhat tovább, bányássza ki a nyersanyagot");
			}
			else {
				System.out.println("Érvénytelen érték");
			}
	}
	
}
