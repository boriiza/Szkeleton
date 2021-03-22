package szkeleton.test;

import szkeleton.game.Aszteroida;
import szkeleton.game.Robot;
import szkeleton.game.Teleportkapu;
import szkeleton.game.Main;

public class robotmozog implements teszt{
	Aszteroida aszteroidaA;
	Aszteroida aszteroidaB;
	Aszteroida aszteroidaC;
	Robot robot;
	Teleportkapu kapu1;
	Teleportkapu kapu2;
	
	
	@Override
	public void init() {
		Main.printer.print("Init");
		aszteroidaA = new Aszteroida();
		aszteroidaB = new Aszteroida();
		aszteroidaC = new Aszteroida();
		robot = new Robot();
		kapu1 = new Teleportkapu();
		kapu2 = new Teleportkapu();
		
		robot.SetAszteroida(aszteroidaA);
		aszteroidaA.AddEntitas(robot);
		aszteroidaA.SetSzomszed(aszteroidaB);
		aszteroidaA.SetSzomszed(kapu1);
		aszteroidaB.SetSzomszed(aszteroidaA);
		aszteroidaA.SetKapu(kapu1);
		aszteroidaC.SetKapu(kapu2);
		kapu1.SetParja(kapu2);
		kapu1.SetAszteroida(aszteroidaA);
		kapu2.SetParja(kapu1);
		kapu2.SetAszteroida(aszteroidaB);
	}

	@Override
	public void exec() {
		Main.printer.print("Exec");
		robot.Mozgas(aszteroidaA.SzomszedotAd());		
	}

}