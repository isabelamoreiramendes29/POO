public class Zumbi {

    String nome;
    int idade;
    boolean estaVivo;

    public void apresentar() {
        System.out.println("Sou o zumbi " + nome + " e tenho " + idade + " anos.");
    }

    public void andar() {
        System.out.println(nome + " esta andando devagar, arrastando os pes.");
    }

    public void morder(String vitima) {
        System.out.println(nome + " mordeu " + vitima + "!");
    }
}
