package javaBasico.fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// O Usario deve digitar  2 numeros e escolher o operador + - * / %, deve fazer os calculos sem os if
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um valor: ");
		double numero1 = leia.nextDouble();
		
		System.out.println("Digite o segundo valor: ");
		double numero2 = leia.nextDouble();
		
		System.out.println("Escolha o operador  +  -  *  / ");
		String operador = leia.next();
		
		double resultado = "+".equals(operador) ? numero1 + numero2 : 0;
		resultado = "-".equals(operador)? numero1 - numero2 : resultado;
		resultado = "*".equals(operador)? numero1 * numero2 : resultado;
		resultado = "/".equals(operador)? numero1 / numero2 : resultado;
		
		System.out.println(resultado);
		
			
		leia.close();
	
	}

}
