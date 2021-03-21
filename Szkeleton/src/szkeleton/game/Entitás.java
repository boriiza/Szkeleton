package szkeleton.game;

import java.util.Scanner;

public abstract class Entitás {
	private Aszteroidaöv jatekosok;
	protected Aszteroida aszteroida;
	
	public abstract void Mozgas(Szomszéd a);
	
	public Entitás() {
		Main.printer.print("[" + this + ".Entitas()]");
	}
	
	public void Furas() {
		Main.printer.print("[" + this + ".Furas()]" );
		Main.printer.inc();
		Main.printer.print(">Milyen vastag a kereg?");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		Main.printer.print(">Ertek:" + num);
		if(num > 0) {
			aszteroida.SetKopeny(num);
			Main.printer.inc();
			aszteroida.KeregCsokken();
		}	
		Main.printer.dec();
		//Main.scanner.close();
		
	}
	
	public void SetAszteroida(Aszteroida a) {
		Main.printer.print("[" + this + ".SetAszteroida(" + a + ")]");
		aszteroida=a;
	}
	
	public abstract void Halal();
	
	public abstract void Felrobban();
	
	public abstract void Lep();
}
