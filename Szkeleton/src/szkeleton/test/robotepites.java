package szkeleton.test;

import java.util.List;

import szkeleton.game.Aszteroida;
import szkeleton.game.Szén;
import szkeleton.game.Telepes;
import szkeleton.game.Urán;
import szkeleton.game.Vas;
import szkeleton.game.Útmutató;
import szkeleton.game.Main;
import szkeleton.game.Nyersanyag;
import szkeleton.game.Robot;

public class robotepites implements teszt{
	Telepes telepes;
	
	@Override
	public void init() {
		Main.printer.print("Init");
		telepes = new Telepes();
	}

	@Override
	public void exec() {
		Main.printer.print("Exec");
		telepes.RobotEpit();
		
		
	}

}