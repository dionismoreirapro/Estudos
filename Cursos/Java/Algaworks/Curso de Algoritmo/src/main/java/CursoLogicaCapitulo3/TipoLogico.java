package CursoLogicaCapitulo3;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class TipoLogico {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        Boolean variavelVerdadeira = true;

        System.out.println("Variavel verdadeira " + variavelVerdadeira);


        boolean variavelFalse = false;

        System.out.println("Variavel falsa" + variavelFalse);

        System.out.println("---------------------------------------------------");

        System.out.println("Digite a sua idade: ");
        Integer idade = leia.nextInt();
        Integer idadeMinimaParaTiraCarteira = 18;

        Boolean podeTirarCarteira = idade >= idadeMinimaParaTiraCarteira;

        if(podeTirarCarteira){
            System.out.println("Parabéns você pode tirar a carteira");
        }else{
            System.out.println("Infelizmente você não pode tirar a carteira");
        }


    }
}
