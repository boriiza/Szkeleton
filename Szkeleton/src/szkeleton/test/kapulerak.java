package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Main;
import szkeleton.game.Telepes;
import szkeleton.game.Teleportkapu;

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
		
		Main.printer.print(">A Telepesnel van teleportkapu? (‘i’ = igaz, ‘h’ = hamis)");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		
		if (answer.equals("i")) {
			Teleportkapu tk = new Teleportkapu();
			Teleportkapu k2 = new Teleportkapu();
			t.AddKapu(tk);
			t.AddKapu(k2);
			tk.SetParja(k2);
			k2.SetParja(tk);
			
		}
		t.KapuLerak();

	}
}
