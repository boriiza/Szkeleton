package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Jatek;
import szkeleton.game.Main;
import szkeleton.game.Telepes;

/**
 * Telepes halálát szimuláló teszteset.
 * Szükséges attribútumok: egy telepes és egy játék.
 * Inicializálás: Az attribútumok létrejönnek, egymástól a teszt szempontjából függetlenek.
 * Végrehajtás: Felrobbantjuk a telepest, majd a tesztelõ válasza alapján vagy vereséggel zárjuk a játékot, vagy nem csinálunk semmit.
 */

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
