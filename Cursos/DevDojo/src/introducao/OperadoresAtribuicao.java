package introducao;


public class OperadoresAtribuicao {
    //operadores  = += -= /= *= %=
    public static void main(String[] args) {
        double bonus = 1000;
        bonus += 1000;
        System.out.println(bonus);
        bonus -= 1000;
        System.out.println(bonus);
        bonus *=2;
        System.out.println(bonus);
        bonus /=2;
        System.out.println(bonus);
        bonus %=2;
        System.out.println(bonus);
        System.out.println("--------------------------------------------------------------------------------");

        bonus += 1000;
        bonus ++;

    }
}
