package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;
import szkeleton.game.Szen;
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
		aszteroida.AddEntitas(t);
	}
	
	@Override
	public void exec() {
		Scanner in = new Scanner(System.in);
		Main.printer.print("Üreges az aszteroida? ('i' = igen, 'n' = nem)");
		String answer = Main.scanner.nextLine();
		if(answer.equals("i")) {
			Main.printer.print("Van szén a telepesnél? ('i' = igen, 'n' = nem)");
			answer = Main.scanner.nextLine();
			if(answer.equals("i")) {
				t.AddNyersanyag(new Szen());
				Main.printer.inc();
				t.Visszatolt();
				if(aszteroida.AnyagKinyeres() != null)
					Main.printer.print("Az aszteroida belsõ anyaga :"+ aszteroida.AnyagKinyeres().toString());
				else
					Main.printer.print("Az aszteroida belsõ anyaga : üreges");
			}
			else {
				if(answer.equals("n")) {
					Main.printer.print("Az akció nem hajtható végre : A telepesnél nincs szén");
				}
				else {
					Main.printer.print("Érvénytelen válasz");
				}
			}
		}
		else {
			if(answer.equals("n")) {
				Main.printer.print("Az akció nem hajtható végre: Nem üreges az aszteroida");
			}
			else {
				Main.printer.print("Érvénytelen válasz");
			}
		}
	}



}