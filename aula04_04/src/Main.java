public class Main {

        public static void main(String[] args) {
            Zumbi zumbi1 = new Zumbi();
            Zumbi zumbi2 = new Zumbi();

            zumbi1.nome = "Pedro";
            zumbi2.nome = "Chico";

            zumbi1.Vida = 5;
            zumbi2.Vida = 4;

            zumbi1.manipularVida();
            zumbi2.manipularVida();

            zumbi1 = zumbi2;

            zumbi1.Vida = 10;
            zumbi2.Vida = 444;

            zumbi1.manipularVida();
            zumbi2.manipularVida();
        }


}
