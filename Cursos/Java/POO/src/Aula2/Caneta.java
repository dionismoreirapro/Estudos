package Aula2;

public class Caneta {

	String modelo;
	String cor;
	double ponta;
	int carga;
	boolean tampada;
	
	void status() {
		System.out.println("O modelo é: " + this.modelo);
		System.out.println("A cor é: " + this.cor);
		System.out.println("A ponta é: " + this.ponta);
		System.out.println(" A carga é: " + this.carga);
		System.out.println("A Caneta esta tampada: " + this.tampada);
	}
	
	public boolean rabiscar() {
		if(tampada) {
			System.out.println("Rabiscar");
			
		}else {
			System.out.println("Caneta tampada");
		}
		return tampada;
	}
}
