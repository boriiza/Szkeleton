package szkeleton.test;

import szkeleton.game.Aszteroida;
import szkeleton.game.Telepes;
import szkeleton.game.Main;

public class robotepites implements teszt{
	Telepes telepes;
	Aszteroida a;
	
	@Override
	public void init() {
		Main.printer.print("Init");
		telepes = new Telepes();
		a = new Aszteroida();
		a.AddEntitas(telepes);
		telepes.SetAszteroida(a);
	}

	@Override
	public void exec() {
		Main.printer.print("Exec");
		telepes.RobotEpit();
		
		
	}

}