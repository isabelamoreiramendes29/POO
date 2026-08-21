package exercicio06;

public class Kart {

    String nome;
    Motor motor;
    Piloto piloto;

    public Kart(){
        motor = new Motor();
    }


    void pular(){
        System.out.println("Pular");
    }
    void soltarTurbo(){
        System.out.println("soltarTurbo");
    }
    void fazerDrift(){
        System.out.println("Fazer Drift");
    }

}
