package szkeleton.test;


import szkeleton.game.Main;
import szkeleton.game.Telepes;

public class teleportkapuEpites {
	
	private Telepes t;
	
	public void init() {
		Main.printer.print("Init");
		t = new Telepes();
	}
	
	public void exec() {
		Main.printer.print("Exec");
		t.KapuEpit();
	}
}
