import java.util.Random;
import java.util.Scanner;

public class Aula_03_5 {

    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);

        Random rand = new Random();

        int x = rand.nextInt(10)+1;

        System.out.print("Tente adivinhar o número");
        int numEscolhido = valorTeclado.nextInt();

        while(x != numEscolhido){
            System.out.print("Número errado, tente novamente");
            numEscolhido = valorTeclado.nextInt();
        }
        System.out.print("Acertou o número");


    }
}
