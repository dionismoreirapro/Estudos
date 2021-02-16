package javaBasico;

public class Cast {

	public static void main(String[] args) {
		double a = 1; //implicito
		
		float b = (float) 902.988883877; //explicita(Cast)
		
		
		System.out.println(a);
		System.out.println(b);
		
		
		int c = 4;
		byte d = (byte) c;
		System.out.println(d);
		
		
		double e = 100.05;
		var f = (int) e;
	}

}
