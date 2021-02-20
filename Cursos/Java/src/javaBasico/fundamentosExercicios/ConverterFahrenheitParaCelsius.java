package javaBasico.fundamentosExercicios;

import java.util.Scanner;
/**
 * 
 * Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius.
 * Formula: (°F − 32) × 5/9 
 * 
 * */
public class ConverterFahrenheitParaCelsius {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite uma temperatura em Fahrenheit: ");
		double tempFahrenheit = leia.nextDouble();
		
		final int celsius = 32;
			
		double convertTempCelsius = (tempFahrenheit - celsius) * 5/9;
		
		System.out.println("A temperatura em Celsius: " + convertTempCelsius);
		

	}

}
