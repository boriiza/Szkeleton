package szkeleton.test;

import szkeleton.game.Aszteroida;
import szkeleton.game.Szén;
import szkeleton.game.Telepes;
import szkeleton.game.Urán;
import szkeleton.game.Vas;
import szkeleton.game.Vízjég;

public class banyaszas implements teszt{
	Telepes telepes;
	Aszteroida aszteroida;
	Szén szen;
	Vas vas;
	Vízjég viz;
	Urán uran;
	
	@Override
	public void init() {
		telepes = new Telepes();
		aszteroida = new Aszteroida();
		szen = new Szén();
		vas = new Vas();
		viz = new Vízjég();
		uran = new Urán();
		
		aszteroida.AddEntitas(telepes);
		
	}

	@Override
	public void exec() {
		// TODO Auto-generated method stub
		
	}

}