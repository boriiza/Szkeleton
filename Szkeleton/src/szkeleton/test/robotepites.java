package szkeleton.test;

import szkeleton.game.Aszteroida;
import szkeleton.game.Szén;
import szkeleton.game.Telepes;
import szkeleton.game.Urán;
import szkeleton.game.Vas;
import szkeleton.game.Útmutató;
import szkeleton.game.Main;

public class robotepites implements teszt{
	Telepes telepes;
	Útmutató utmutato;
	Aszteroida aszteroida;
	Vas vas;
	Szén szen;
	Urán uran;
	
	@Override
	public void init() {
		telepes = new Telepes();
		aszteroida = new Aszteroida();
		utmutato = new Útmutató();
		szen = new Szén();
		vas = new Vas();
		uran = new Urán();

		aszteroida.AddEntitas(telepes);
		
		aszteroida.AddEntitas(telepes);
	}

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		
	}

}