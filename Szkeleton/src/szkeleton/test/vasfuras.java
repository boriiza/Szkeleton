package szkeleton.test;
import java.util.Scanner;

import szkeleton.game.*;


public class vasfuras {
	
	Aszteroida aszteroida;
	Telepes t;
	
	
	public void init() {
		aszteroida= new Aszteroida();
		Vas v= new Vas();
		aszteroida.SetAnyag(v);
		t= new Telepes();
	}
	
	public void exec() {
		System.out.println("Milyen vastag a köpeny?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		if (num > 0) {
			aszteroida.SetKopeny(num);
			t.Furas();
			System.out.println("Az aszteroida kérgének vastagsága"+ aszteroida.GetKopeny());
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
}
