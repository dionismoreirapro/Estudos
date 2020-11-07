package CursoLogicaCapitulo3;

import java.util.Scanner;

/**
 * Crie um programa que lê, do console, o nome e o sobrenome de uma pessoa e depois imprime o nome completo.
 * Para isso, você vai precisar de duas variáveis: a primeira você pode chamar de "nome" e a segunda de "sobrenome".
 * Por último, você vai juntar o nome e o sobrenome em uma única impressão.*/

public class Exercicio02 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.printf("Digite o seu nome: ");
        String nome = leia.nextLine();

        System.out.println("Digite o seu sobrenome");
        String sobrenome = leia.nextLine();


        System.out.printf("Ola " + nome + " " + sobrenome);

    }
}
