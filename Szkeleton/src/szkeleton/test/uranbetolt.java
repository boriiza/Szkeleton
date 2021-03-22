package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;
import szkeleton.game.Telepes;
import szkeleton.game.Uran;

public class uranbetolt implements teszt {
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
		Main.printer.print("Ureges az aszteroida('i' = igen, 'n' = nem)");
		String answer = in.nextLine();
		if(answer.equals("i")) 
		{
			Main.printer.print("Van uran a telepesnel? ('i' = igen, 'n' = nem)");
			answer = in.nextLine();
			if(answer.equals("i")) 
			{
				t.AddNyersanyag(new Uran());
				Main.printer.print("Napkozelben van az aszteroida? ('i' = igen, 'n' = nem)");
				answer = in.nextLine();
				if(answer.equals("i"))
					aszteroida.SetNapkozel(true);
				Main.printer.inc();
				t.Visszatolt();
				if(aszteroida.AnyagKinyeres() != null)
					Main.printer.print("Az aszteroida belso anyaga :"+ aszteroida.AnyagKinyeres().toString());
				else
					Main.printer.print("Az aszteroida belso anyaga : ureges");
			}
			else {
				if(answer.equals("n")) {
					Main.printer.print("Az akcio nem hajthato vegre : A telepesnel nincs uran");
				}
				else {
					Main.printer.print("Ervenytelen valasz");
				}
			}
		}
		else {
			if(answer.equals("n")) {
				Main.printer.print("Az akció nem hajtható végre : Az aszteroida nem üreges");
			}
			else {
				Main.printer.print("Érvénytelen válasz");
			}
		}
	}
}