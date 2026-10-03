package exercicio01;

public class Main {

    public static void main(String[] args) {

        Mamifero cachorro = new Cachorro("Rex", 100);
        Mamifero boi = new Boi("Mimoso", 150);
        Lontra lontra = new Lontra("Lola", 80);

        cachorro.mostraInfo();
        cachorro.emitirSom();

        boi.mostraInfo();
        boi.emitirSom();

        lontra.mostraInfo();
        lontra.emitirSom();
        lontra.nadar();

    }
}
