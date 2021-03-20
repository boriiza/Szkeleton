package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;
import szkeleton.game.Szén;
import szkeleton.game.Telepes;

public class szenbetolt implements teszt {

	Aszteroida aszteroida;
	Telepes t;
	
	@Override
	public void init() {
		Main.printer.print("Init:");
		aszteroida= new Aszteroida();
		aszteroida.SetAnyag(null);
		aszteroida.SetKopeny(0);
		t= new Telepes();
		t.SetAszteroida(aszteroida);
	}
	
	@Override
	public void exec() {
		Main.printer.print("Van szén a telepesnél? ('i' = igaz, 'h' = hamis");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		in.close();
		if(answer.equals("i")) {
			t.AddNyersanyag(new Szén());
			Main.printer.inc();
			t.Visszatolt();
			System.out.println("Az aszteroida belsõ anyaga :"+ aszteroida.AnyagKinyeres().toString());
		}
		else {
			if(answer.equals("h")) {
				System.out.println("Az akció nem hajtható végre : A telepesnél nincs szén");
			}
			else {
				System.out.println("Érvénytelen válasz");
			}
		}
	}



}
