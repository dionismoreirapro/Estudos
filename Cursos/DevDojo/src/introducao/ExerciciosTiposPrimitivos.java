package introducao;
/**
 * Crie variáveis para os campos descritos abaixo entre <>  e imprima a seguinte mensagem
 *
 * Eu <nome>, morando no <endereco> confirmo que recebi o salário de r$ <salario> na data <data>
 */

public class ExerciciosTiposPrimitivos {
    public static void main(String[] args) {
        String nome = "Dionis Moreira";
        String endereco = "Rua Pioneiro José Sergio de Sá";
        double salario = 3000.00;
        String data = "15/06/2021";

        System.out.println("Eu " + nome + ", morando no " + endereco + " confirmo que recebi o salario de R$ " +
                            salario + " na data " + data);
    }
}
