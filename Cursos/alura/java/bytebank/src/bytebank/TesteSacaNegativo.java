package bytebank;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println("Saldo inicial: " + conta.pegaSaldo());

        conta.deposita(100);
        conta.saca(200);

        System.out.println(conta.pegaSaldo());
    }
}
