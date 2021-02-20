package javaBasico.fundamentos;

public class OperadoresLogicos {

	public static void main(String[] args) {

		boolean condicao1 = true;
		boolean condicao2 = false;

		// tabela verdade && (AND)

		System.out.println("\ntabela verdade E");
		System.out.println(condicao1 && condicao1);
		System.out.println(condicao1 && condicao2);
		System.out.println(condicao2 && condicao1);
		System.out.println(condicao2 && condicao2);

		// tabela verdade || (OR)

		System.out.println("\ntabela verdade OU");
		System.out.println(condicao1 || condicao1);
		System.out.println(condicao1 || condicao2);
		System.out.println(condicao2 || condicao1);
    	System.out.println(condicao2 || condicao2);
    	
    	
    	// tabela verdade ! (NOT)
    	
    	System.out.println("\ntabela verdade Negação");
    	System.out.println(!condicao1);
    	System.out.println(!condicao2);

	}

}
