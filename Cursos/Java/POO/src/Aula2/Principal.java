package Aula2;

public class Principal {

	public static void main(String[] args) {
		
		Caneta c1 = new Caneta();
		
		c1.cor = "Azul";
		c1.modelo = "big";
		c1.carga = 50;
		c1.ponta = 1.5;
		c1.tampada = true;
		
		c1.status();
		c1.rabiscar();
		
	
		
		
	}

}
