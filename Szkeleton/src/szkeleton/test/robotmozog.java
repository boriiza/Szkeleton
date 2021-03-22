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
	
	/**
	 * Létrehoztunk egy robotot. A robot az aszteroidaA-n áll. 
	 * Az aszteroidaA közvetlen szomszédja az aszteroidaB.
	 * Az aszteroidaA-ról a robot elérheti az aszteroidaC-t teleportkapun keresztül.
	 * Az aszteroidaA teleportkapuja a kapu1, az aszteroidaC teleportkapuja a kapu2.
	 */
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

	/**
	 * A Telepessel ellentétben a robot nem választhat magának célt. 
	 * Az aszteroidaA szomszédjai közül fog véletlenszerûen helyszínt kapni.
	 */
	@Override
	public void exec() {
		Main.printer.print("Exec");
		robot.Mozgas(aszteroidaA.SzomszedotAd());		
	}

}