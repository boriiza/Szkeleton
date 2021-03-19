package szkeleton.test;

public class Print {
	
	private int inc = 0;
	
	public void print(String s) {
		for(int i = 0; i < inc; i++) {
			System.out.print("\t");
		}
		System.out.println(s);
	}
	
	public void inc() {
		inc++;
	}
	
	public void dec() {
		inc--;
	}
}
