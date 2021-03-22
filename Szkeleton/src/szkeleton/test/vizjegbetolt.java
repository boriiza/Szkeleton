package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;
import szkeleton.game.Telepes;
import szkeleton.game.Vizjeg;

public class vizjegbetolt implements teszt {

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
		Main.printer.print("Üreges az aszteroidal? ('i' = igen, 'n' = nem)");
		String answer = in.nextLine();
		if(answer.equals("i"))
		{
			Main.printer.print("Van vízjég a telepesnél? ('i' = igen, 'n' = nem)");
			answer = in.nextLine();
			if(answer.equals("i"))
				{
				t.AddNyersanyag(new Vizjeg());
				Main.printer.print("Napközelben van az aszteroida? ('i' = igen, 'n' = nem)");
				answer = in.nextLine();
				if(answer.equals("i"))
					aszteroida.SetNapkozel(true);
				Main.printer.inc();
				t.Visszatolt();
				if(aszteroida.AnyagKinyeres() != null)
					Main.printer.print("Az aszteroida belsõ anyaga :"+ aszteroida.AnyagKinyeres().toString());
				else
					Main.printer.print("Az aszteroida belsõ anyaga : üreges");
				}
			else {
				if(answer.equals("n")) {
					Main.printer.print("Az akció nem hajtható végre : A telepesnél nincs vízjég");
				}
				else {
					Main.printer.print("Érvénytelen válasz");
				}
			}
		}
		else{
			if(answer.equals("n")) {
				Main.printer.print("Az akció nem hajtható végre : Az aszteroida nem üreges");
			}
			else {
				Main.printer.print("Érvénytelen válasz");
			}
		}
	}
}