package szkeleton.test;

import java.util.Scanner;

import szkeleton.game.Aszteroida;
import szkeleton.game.Jatek;
import szkeleton.game.Main;
import szkeleton.game.Telepes;

public class bazisepites implements teszt {
	
	Telepes t1;
	Telepes t2;
	Aszteroida a;
	Jatek j;
	/**
	 * Mivel egy Telepesnél nem lehet elegendõ nyersanyag egy bázishoz, ezért 2 Telepest
	 * hozunk létre. Mindketten az a aszteroidán állnak. 
	 * Valamint létrehoztunk egy j Játékot, amely vége függvénye meghívódik, ha
	 * a bázis valóban megépül, tehát ha a Telepesek nyernek.
	 */
	@Override
	public void init() {
		Main.printer.print("Init");
		t1 = new Telepes();
		t2 = new Telepes();
		a = new Aszteroida();
		a.AddEntitas(t1);
		a.AddEntitas(t2);
		t1.SetAszteroida(a);
		t2.SetAszteroida(a);
		j = new Jatek();
	}

	/**
	 * Ha van elég nyersanyaguk a Telepeseknek a bázis megépülhet, ha nincs akkor
	 * sikertelen az építés.
	 */
	@Override
	public void exec() {
		Main.printer.print("Exec");
		a.BazisEpit();
		
		Main.printer.print("> Osszesitve van eleg nyersanyag a telepeseknel? (‘i’ = igaz, ‘h’ = hamis)");
		Scanner in = new Scanner(System.in);
		String answer = in.nextLine();
		
		if (answer.equals("i")) j.Vege(true);
		else
			Main.printer.print("> A bazis epitese sikertelen");
		
	}

}
