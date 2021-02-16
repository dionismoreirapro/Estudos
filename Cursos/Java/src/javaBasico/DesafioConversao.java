package javaBasico;


import java.util.Scanner;

public class DesafioConversao {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		String numero1 = leia.nextLine().replace(",", ".");
		
		System.out.println("Digite um numero: ");
		String numero2 = leia.nextLine().replace(",", ".");
		
		System.out.println("Digite um numero: ");
		String numero3 = leia.nextLine().replace(",", ".");
		
		Double salario1 = Double.parseDouble(numero1);
		Double salario2 = Double.parseDouble(numero2);
		Double salario3 = Double.parseDouble(numero3);
		
		
		Double media = (salario1 + salario2 + salario3) / 3;
		
		System.out.println(media);
		
		leia.close();
		 
	}

}
