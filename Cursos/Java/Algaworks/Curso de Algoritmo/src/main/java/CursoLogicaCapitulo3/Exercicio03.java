package CursoLogicaCapitulo3;

import java.util.Scanner;

/**
 * O seu programa deve receber a nota do aluno pelo console e depois você vai fazer uma operação lógica para saber se a
 * nota do aluno é maior que 70. O resultado dessa operação lógica deve ser atribuido a uma variável do tipo Boolean.
 *
 * Por último, você deve utilizar a variável do tipo Boolean com a estrutura de decisão if para imprimir, no console,
 * uma mensagem que vai dizer se o aluno passou ou não passou.
 * */

public class Exercicio03 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite a nota");
        Double notaAluno = leia.nextDouble();

        Double notaMinimaParaPassar = 7.0;

        Boolean aprovado = notaAluno >= notaMinimaParaPassar;

        if(aprovado){
            System.out.println("Parabéns foi aprovado!");
        }else{
            System.out.printf("Foi reprovado");
        }
    }

}
