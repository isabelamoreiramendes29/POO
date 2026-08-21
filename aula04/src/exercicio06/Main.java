package exercicio06;

public class Main {

    public static void main(String[] args) {

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        Kart kart1 = new Kart();
        Kart kart2 = new Kart();

        piloto1.nome = "Antonio";
        kart1.nome = "Kart Vermelho";

        piloto2.nome = "Chico";
        kart2.nome = "Kart Azul";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        kart1.motor.cilindradas = "150";
        kart1.motor.velocidadeMaxima = 150;

        kart2.motor.cilindradas = "50";
        kart2.motor.velocidadeMaxima = 90;

        piloto1.soltaSuperPoder();
        kart1.pular();
        kart1.soltarTurbo();
        kart1.fazerDrift();
        kart1.motor.mostraInfo();

    }
}
