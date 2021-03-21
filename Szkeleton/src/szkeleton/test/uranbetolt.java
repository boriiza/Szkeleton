package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;
import szkeleton.game.Telepes;
import szkeleton.game.Urán;

public class uranbetolt implements teszt {
	Aszteroida aszteroida;
	Telepes t;
	
	@Override
	public void init() {
		Main.printer.print("Init");
		aszteroida= new Aszteroida();
		aszteroida.SetAnyag(null);
		aszteroida.SetKopeny(0);
		t= new Telepes();
		t.SetAszteroida(aszteroida);
		aszteroida.AddEntitas(t);
	}
	
	@Override
	public void exec() {
		Main.printer.print("Exec");
		Main.printer.print("Van urán a telepesnél? ('i' = igaz, 'h' = hamis)");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		if(answer.equals("i")) 
		{
			t.AddNyersanyag(new Urán());
			Main.printer.print("Napközelben van az aszteroida? ('i' = igaz, 'h' = hamis)");
			answer = in.nextLine();
			if(answer.equals("i"))
				aszteroida.SetNapkozel(true);
			Main.printer.inc();
			t.Visszatolt();
			Main.printer.dec();
			if(aszteroida.AnyagKinyeres() != null)
				Main.printer.print("Az aszteroida belsõ anyaga :"+ aszteroida.AnyagKinyeres().toString());
			else
				Main.printer.print("Az aszteroida belsõ anyaga : üreges");
		}
		else {
			if(answer.equals("h")) {
				Main.printer.print("Az akció nem hajtható végre : A telepesnél nincs urán");
			}
			else {
				Main.printer.print("Érvénytelen válasz");
			}
		}
	}
}
