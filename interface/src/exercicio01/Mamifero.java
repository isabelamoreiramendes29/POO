package exercicio01;

public abstract class Mamifero {

    protected String nome;
    protected double vida;

    public Mamifero(String nome, double vida) {
        this.vida = vida;
        this.nome = nome;
    }

    public abstract void emitirSom();

    public void mostraInfo(){
        System.out.println("Nome: " + nome);
        System.out.println("Vida: " + vida);
    }
}
