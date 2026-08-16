package exercicio04;

    public class Main {

        public static void main(String[] args) {
            Zumbi zumbi1 = new Zumbi();
            Zumbi zumbi2 = new Zumbi();

            zumbi1.nome = "Pedro";
            zumbi1.vida = 4;

            zumbi2.nome = "Antonio";
            zumbi2.vida = 15;


            System.out.println(zumbi1.mostraVida());
            System.out.println(zumbi2.mostraVida());

            boolean deuCerto = zumbi1.transfereVida(zumbi2, 5);
            System.out.println(deuCerto);


        }



    }

