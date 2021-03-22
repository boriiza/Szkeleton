package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;
import szkeleton.game.Telepes;

public class kapulerak implements teszt{
	
	Telepes t;
	Aszteroida a;

	public void init() {
		Main.printer.print("Init");
		t = new Telepes();
		a = new Aszteroida();
		t.SetAszteroida(a);
		a.Befogad(t);
	}
	
	public void exec() {
		Main.printer.print("Exec");
		
		Main.printer.print(">A Telepesnél van teleportkapu? (‘i’ = igaz, ‘h’ = hamis)");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		
		if (answer.equals("i")) {
			t.KapuEpit();
		}
		t.KapuLerak();
		
		
		

	}
}
