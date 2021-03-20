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
	Útmutató utmutato;
	Aszteroida aszteroida;
	Vas vas;
	Szén szen;
	Urán uran;
	List<Nyersanyag> recept;
	
	@Override
	public void init() {
		
		telepes = new Telepes();
		aszteroida = new Aszteroida();
		szen = new Szén();
		vas = new Vas();
		uran = new Urán();
		recept.add(szen);
		recept.add(vas);
		recept.add(uran);
		utmutato = new Útmutató(recept);
		aszteroida.AddEntitas(telepes);
	}

	@Override
	public void exec() {
		Main.printer.print("Init");
		Robot robot = telepes.RobotEpit();
		aszteroida.AddEntitas(robot);
		// TODO Auto-generated method stub
		
	}

}