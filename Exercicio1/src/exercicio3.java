import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Entre com a nota");
        int npa = entrada.nextInt();


        if (npa >= 60 ) {
            System.out.print("Aprovado");
        } else if(npa >=30){
            System.out.print("Entre com a nota da NP3: ");
            int np3 = entrada.nextInt();
            int soma = (np3 + npa);
            double media = (double) soma / 2;
            if (media >= 60) {
                System.out.print("Aprovado");
            } else {
                System.out.print("Reprovado");
            }
        }
        else{
            System.out.print("Reprovado");
        }
    }
    }

    //

