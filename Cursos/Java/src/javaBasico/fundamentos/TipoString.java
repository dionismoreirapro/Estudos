package javaBasico.fundamentos;

public class TipoString {

	public static void main(String[] args) {
		System.out.println("Ola mundo!");
		
		String s = "Boa tarde!";
		
		System.out.println(s.concat(" !!!"));
		System.out.println( s + " !!");
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.endsWith("tarde"));
		System.out.println(s.toUpperCase().startsWith("BOA"));
		System.out.println(s.length());
		System.out.println(s.equals("boa tarde"));
		System.out.println(s.equalsIgnoreCase("BOA TARDE!"));
		System.out.println(s.contentEquals("oa"));
		
		
		
		String nome = "Dionis";
		int idade = 34;
		String sobreNome = "Moreira";
		var salario = 12345.678;
			
		
		System.out.printf("O meu nome é %s %s tenho %d de idade e ganho R$ %.2f", nome, sobreNome, idade,salario);

	}
}