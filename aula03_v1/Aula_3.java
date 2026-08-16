import java.util.Scanner;

public class Aula_3{

    public static void main(String[] args){

        Scanner valorTeclado = new Scanner(System.in);

        int numAlunos = valorTeclado.nextInt();

        System.out.print("Entre com a quantidade de alunos");

        switch(numAlunos){
            case 10:
                System.out.print("Sala utilizada I-16");

            case 20:
                System.out.print("Sala utilizada I-16");
                break;

            case 30:
                System.out.print("Sala utilizada I-22");
                break;

        }


    }



}
