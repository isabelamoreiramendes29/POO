import java.util.Scanner;

public class Exercicio1 {


    public static void main(String[] args){


        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com o numero de lanches");
        int lanche1 = entrada.nextInt();
        System.out.print("Entre com o numero de lanches");
        int lanche2 = entrada.nextInt();
        System.out.print("Entre com o numero de lanches");
        int lanche3 = entrada.nextInt();


        int soma = lanche1+lanche2+lanche3;
        double media = (double) soma/3;

        System.out.println("O numero total de lanches é"+ (lanche1+lanche2+lanche3));
        System.out.println("A media é ");
    }

}
