package CursoLogicaCapitulo3;

import java.util.Scanner;

/**
 * Crie um programa que vai receber do usuário o valor do produto e a quantidade do produto que se deseja.
 * Com essas informações encontre o subtotal que será o valor do produto multiplicado pela quantidade. *
 * Depois você vai precisar usar uma estrutura de decisão. Se a quantidade desejada do produto for maior que 10 unidades,
 * vai ser preciso dar um desconto de 10% em cima do subtotal, mas se for menor que 10, você NÃO aplica desconto algum.
 * Para encontrar o valor referente ao percentual de desconto (que vai ser 0% ou 10%, dependendo da quantidade) você
 * multiplica o subtotal pelo próprio percentual e divide tudo por 100. *
 * Tendo o valor referente ao percentual de desconto, você vai retirar esse valor do subtotal. O que sobrar será o valor
 * total final e deverá ser apresentado no console.
 * */
public class Exercicio04 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.println("Digite o valor do produto: ");
        Double valorProduto = leia.nextDouble();

        System.out.println("Digite a quantidade: ");
        Integer qtdProduto = leia.nextInt();

        Double subTotal = valorProduto * qtdProduto;

        Boolean verificaQuantidadeProduto = qtdProduto > 10;

        Double valorDesconto = (subTotal * 10) / 100;

        double totalComDesconto =  subTotal - valorDesconto;

        if(!verificaQuantidadeProduto){
            System.out.println("O valor da comprar é de: " + subTotal);
        }else{
            System.out.println("O valor da comprar é de: " + totalComDesconto);

        }

        leia.close();

    }
}
