package introducao;

public class Aula5Condicao {

    public static void main(String[] args) {
        int idade  = 20;
        boolean isPodeTirarCarta = idade <= 18;

        if(isPodeTirarCarta){
            System.out.println("pode tirar a carteira");
        }

        if(!isPodeTirarCarta){
            System.out.println("entrou no laco");
        }
        System.out.println(isPodeTirarCarta);


        /*
         * se idade < 15 categoria infantil
         * se idade > 15 && idade < 18 categoria juvenil
         * se idade > 18 categoria adulto
         * */


        if (idade <= 15 ){
            System.out.println("Categoria Infantil");
        }else if(idade >15 && idade < 18){
            System.out.println("categoria Juvenil");
        }else{
            System.out.println("Categoria Adulta");
        }
    }
}
