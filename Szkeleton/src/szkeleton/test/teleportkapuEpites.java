package szkeleton.test;

import java.util.ArrayList;
import java.util.List;

import szkeleton.game.Main;
import szkeleton.game.Nyersanyag;
import szkeleton.game.Telepes;
import szkeleton.game.Urán;
import szkeleton.game.Vas;
import szkeleton.game.Vízjég;
import szkeleton.game.Útmutató;

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
