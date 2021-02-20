package javaBasico.fundamentos;

public class OperadorTernario {

	public static void main(String[] args) {
		
		double media  = 6.0;
		
		String resultado = media> 7.0 ? "Aprovado" : "Reprovado";
		
		System.out.printf("O Aluno esta:  %s", resultado);
		
		
		int idade= 19;
		
		String verificarIdade = idade >=18 ? "Sim" : "Não";
		
		 System.out.println("\nÉ maior de idade: " + verificarIdade);
		
		

	}

}
