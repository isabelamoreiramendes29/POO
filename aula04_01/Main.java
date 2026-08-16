public class Main {

    public static void main(String[] args) {

        Zumbi z1 = new Zumbi();
        z1.nome = "Joao";
        z1.idade = 23;
        z1.estaVivo = false;

        z1.apresentar();
        z1.andar();
        z1.morder("Maria");
    }
}
