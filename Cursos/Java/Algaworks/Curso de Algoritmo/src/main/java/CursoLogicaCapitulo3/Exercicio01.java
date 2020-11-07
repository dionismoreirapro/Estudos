package CursoLogicaCapitulo3;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1 = leia.nextInt();

        Integer quadrado = numero1 * numero1;

        System.out.println("O quadrado de " + numero1 + " é " + quadrado + " . ");

        leia.close();

    }
}
