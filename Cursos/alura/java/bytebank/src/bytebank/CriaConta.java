package bytebank;

public class CriaConta {

	public static void main(String[] args) {
		
		Conta primeiraConta = new Conta();
		
	//	primeiraConta.pegaSaldo() = 200;
		primeiraConta.deposita(800);
		primeiraConta.saca(300);
		System.out.println(primeiraConta.pegaSaldo());


		Conta contaDionis = new Conta();
		contaDionis.deposita(1000);
		contaDionis.transfere(250,primeiraConta);
		System.out.println("Saldo do valor da conta Dionis é de " + primeiraConta.pegaSaldo());

		
		//System.out.println(primeiraConta.saldo);
		
	}

}
