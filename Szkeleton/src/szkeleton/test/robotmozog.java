package szkeleton.test;

import java.util.List;

import szkeleton.game.Aszteroida;
import szkeleton.game.Robot;
import szkeleton.game.Szomszéd;
import szkeleton.game.Telepes;
import szkeleton.game.Teleportkapu;
import szkeleton.game.Main;

public class robotmozog implements teszt{
	Aszteroida aszteroidaA;
	Aszteroida aszteroidaB;
	Robot robot;
	Teleportkapu kapu;
	
	@Override
	public void init() {
		aszteroidaA = new Aszteroida();
		aszteroidaB = new Aszteroida();
		robot = new Robot();
		kapu = new Teleportkapu();
		
		aszteroidaA.AddEntitas(robot);
		aszteroidaA.SetSzomszed(aszteroidaB);
		aszteroidaA.SetSzomszed(kapu);
		aszteroidaB.SetSzomszed(aszteroidaA);
		aszteroidaA.SetKapu(kapu);
	}

	@Override
	public void exec() {
		Main.printer.print("Init");
		robot.Mozgas(aszteroidaA.GetSzomszed(num));
		// TODO Auto-generated method stub
		
	}

}