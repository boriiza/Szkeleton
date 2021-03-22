package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Jatek;
import szkeleton.game.Main;
import szkeleton.game.Telepes;

public class telepesmeghal implements teszt {

	Telepes t;
	Jatek j;
	
	@Override
	public void init() {
		Main.printer.print("Init");
		t = new Telepes();
		j = new Jatek();
	}
	
	@Override
	public void exec() {
		Main.printer.print("Exec");
		t.Felrobban();
		
		System.out.println(">Van mas telepes is az aszteroidaovben? (‘i’ = igaz, ‘h’ = hamis)");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		
		if (answer.equals("h")) j.Vege(false);
	}
}
