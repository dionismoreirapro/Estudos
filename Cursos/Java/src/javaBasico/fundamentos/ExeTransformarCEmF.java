package javaBasico.fundamentos;

public class ExeTransformarCEmF {

	public static void main(String[] args) {
		// (f - 32) x 5/9 = C
		
		final int calculoF =  32;
		final double multicaocaoF = 5 / 9.0;
		
		double fahrenheit = 86;
		
		double celcius = (fahrenheit - calculoF) * multicaocaoF;
		
		System.out.println(celcius);
		
		var b = 4.5;
		
		
		var d = b + 5;
		
		System.out.println(d);

		
		
	}

}
