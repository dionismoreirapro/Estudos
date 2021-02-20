package javaBasico.fundamentos;

public class ComparacaoString {

	public static void main(String[] args) {
		
		
		System.out.println("2" == "2");
		
		String n1 = new String("2");
		System.out.println("2" == n1);
		
		System.out.println("2".equals(n1));
		
		String nome = "DIONIS";
		
		System.out.println("dionis".toUpperCase().equals(nome));
	}

}
