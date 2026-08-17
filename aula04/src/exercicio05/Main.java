package exercicio05;

public class Main {

    public static void main(String[] args) {

        Personagem personagem1 = new Personagem();
        Personagem personagem2 = new Personagem();

        Arma arma1 = new Arma();
        Arma arma2 = new Arma();

        personagem1.pontos = 15;
        personagem2.pontos = 30;

        arma1.resistencia = 58;
        arma2.resistencia = 30;

        personagem1.arma = arma1;
        personagem2.arma = arma2;

        arma1.descricao = "Arma 1";
        arma2.descricao = "Arma 2";

        personagem1.tomarDano();
        personagem2.tomarDano();

        System.out.println("Tomam dano: ");
        System.out.println(personagem1.pontos);
        System.out.println(personagem2.pontos);

        personagem1.usarArma();
        personagem2.usarArma();

        System.out.println("Usam a arma: ");
        personagem1.arma.mostrainfoArma();
        personagem2.arma.mostrainfoArma();
    }
}
