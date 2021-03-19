package szkeleton.test;

import java.util.Scanner;
import szkeleton.game.*;

public class szenfuras {
	Aszteroida aszteroida;
	Telepes t;
	
	
	public void SetUp() {
		aszteroida= new Aszteroida();
		Szén s= new Szén();
		aszteroida.SetAnyag(s);
		t= new Telepes();
	}
	
	public void furas() {
		System.out.println("Milyen vastag a köpeny?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.close();
		if (num > 0) {
			aszteroida.SetKopeny(num);
			aszteroida.KeregCsokken();
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
