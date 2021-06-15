package byteBankEncapsulado;

public class TesteGetSetters {
    public static void main(String[] args) {
        Conta conta = new Conta();
        System.out.println(conta.getNumero());
        conta.setNumero(1338);

        System.out.println(conta.getNumero());

        Cliente dionis = new Cliente();

        dionis.setNome("Dionis Rodrigo Moreira");

        System.out.println(dionis.getNome());

    }
}
