import java.util.Scanner;

public class Aula_03{

            public static void main(String[] args){

                Scanner valorTeclado = new Scanner(System.in);



                System.out.print("Entre com a quantidade de alunos");

                int numAlunos = valorTeclado.nextInt();

                switch(numAlunos){
                    case 10:
                        System.out.print("Sala utilizada I-16");

                    case 20:
                        System.out.print("Sala utilizada I-16");
                        break;

                    case 30:
                        System.out.print("Sala utilizada I-22");
                        break;

                    default:
                        System.out.print("Número não reconhecível");
                }


            }



        }

