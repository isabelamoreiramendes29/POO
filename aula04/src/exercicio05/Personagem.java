package exercicio05;

public class Personagem {

    String name;
    int pontos;
    Arma arma;

    void usarArma(){
        arma.resistencia -= 2;
    }
    void tomarDano(){
        pontos -= 5;
    }
}
