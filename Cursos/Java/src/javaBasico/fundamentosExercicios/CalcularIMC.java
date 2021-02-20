package javaBasico.fundamentosExercicios;

import java.util.Scanner;

/**
 * 
 * Criar um programa que leia o peso e a altura do usuário e imprima no console o IMC.
 * IMC = peso/ (altura x altura)
 * 
 * */
public class CalcularIMC {

	public static void main(String[] args) {
		System.out.println("*************************************");
		System.out.println("* Classificação     |     IMC       *");
		System.out.println("* ----------------------------------*");
		System.out.println("*  Abaixo do peso   |  Abaixo 18,5  *");
		System.out.println("*  Peso Normal      |  18,5 - 24,9  *");
		System.out.println("*  SobrePeso        |  25,0 - 29,9  *");
		System.out.println("*  Obesidade grau 1 |  30,0 - 34,9  *");
		System.out.println("*  Obesidade grau 2 |  35,0 - 39,9  *");
		System.out.println("*  Obesidade grau 3 |  Maior  40,0  *");
		System.out.println("************************************* \n");
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite o seu peso: ");
		double peso = leia.nextDouble();
		
		System.out.println("Digite sua altura; ");
		double altura = leia.nextDouble();
		
		
		double IMC =  peso / (altura * altura);
		
		
		
		System.out.printf("O seu IMC é: "+ IMC);
		
		
		
		
		
		
		
		
		
	}
	
	
	

}
