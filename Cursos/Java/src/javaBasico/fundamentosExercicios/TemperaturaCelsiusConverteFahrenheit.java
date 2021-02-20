package javaBasico.fundamentosExercicios;

import java.util.Scanner;

public class TemperaturaCelsiusConverteFahrenheit {

	public static void main(String[] args) {
		//Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
		//°F = °C × 1, 8 + 32
	
	  Scanner leia = new Scanner(System.in);
	  
	  System.out.println("Digite uma temperatura em Celsius: ");
	  double temperaturaCelsius = leia.nextDouble();
	  
	  double conversaoFahrenheit = (temperaturaCelsius * 1.8)+32;
	  System.out.print("A temperatura de Fahrenheit é: " + conversaoFahrenheit );
	  
	  leia.close();
	
	}
}
