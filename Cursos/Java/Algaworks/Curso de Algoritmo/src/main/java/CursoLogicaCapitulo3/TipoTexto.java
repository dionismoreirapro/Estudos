package CursoLogicaCapitulo3;

import java.util.Scanner;

public class TipoTexto {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Digite seu nome; ");
        String nome = leia.nextLine();

        System.out.println("Olá " + nome + " ! ");

        leia.close();

    }
}
