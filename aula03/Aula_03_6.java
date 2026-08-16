import java.util.Random;
import java.util.Scanner;

public class Aula_03_6 {
    public static void main(String[] args) {

        Scanner valorTeclado = new Scanner(System.in);

        Random rand = new Random();

        int x = rand.nextInt(10)+1;

        System.out.print("Tente adivinhar o número");
        int numEscolhido = valorTeclado.nextInt();

        while(x != numEscolhido){
            if(x > numEscolhido){
                System.out.print("Número menor que o gerado");
            }
            else{
                System.out.print("Número maior que o gerado");
            }

            numEscolhido = valorTeclado.nextInt();
        }
        System.out.print("Acertou o número");
    }
}
