package byteBankEncapsulado;

public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private String titula;



	public void deposita(double valor){
		this.saldo = this.saldo + valor;
	}

	public boolean saca (double valor){
		if(this.saldo >= valor){
			this.saldo -= valor;
			return true;
		}else{
			return false;
		}
   }
   public boolean transfere(double valor, Conta destino){
		if(this.saldo >= valor){
			this.saldo -= valor;
			destino.deposita(valor);
			System.out.println("Você trasnferiu " + valor + " Para conta " + destino);
			return true;
		}else{
			System.out.println("Você não tem saldo para fazer transferencia");
			return false;
		}
   }
	public double pegaSaldo(){

		return this.saldo;
	}

	public int getNumero(){
		return this.numero;
	}
	public void setNumero(int novoNumero){
		this.numero = novoNumero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
}
