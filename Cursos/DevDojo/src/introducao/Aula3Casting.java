package introducao;

public class Aula3Casting {
    public static void main(String[] args) {
        int idade = (int) 1100000000000000L;
        long numeroGrande = 100000000000000L;
        double salarioDouble = 2000;
        float salarioFloat = 5000F;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char letra = 'a';

        System.out.println("minha idade é " + idade + " anos");
    }
}

