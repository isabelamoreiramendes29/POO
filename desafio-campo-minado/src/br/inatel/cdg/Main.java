package br.inatel.cdg;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Jogador jogador1 = new Jogador();

        System.out.print("Nome: ");
        String nomeDigitado = entrada.nextLine();
        jogador1.nome = nomeDigitado;

        System.out.println("Escolha o nível de dificuldade: ");
        System.out.println("1 - Facil   2 - Medio   3 - Dificil");
        int dificuldade = entrada.nextInt();

        int tamanho = 0;
        int bombas = 0;

        switch(dificuldade){
            case 1:
                tamanho = 2;
                bombas = 1;
                break;
            case 2:
                tamanho = 3;
                bombas = 2;
                break;
            case 3:
                tamanho = 4;
                bombas = 3;
                break;

            default:
                tamanho = 2;
                bombas = 1;
                System.out.println("Opcao invalida!");
                break;
        }
        //Cria o objeto Tabuleiro
        Tabuleiro tabuleiro = new Tabuleiro();
        //Roda o metodo iniciar
        tabuleiro.iniciar(tamanho, bombas);

        while(tabuleiro.venceu() == false){

            tabuleiro.mostrarTabuleiro();

            System.out.print("Digite a linha e a coluna: ");
            int linha = entrada.nextInt();
            int coluna = entrada.nextInt();

            if(linha >= 0 && linha < tamanho && coluna >= 0 && coluna < tamanho){


                boolean explodiu = tabuleiro.abrirCampo(linha, coluna);

                if(explodiu == true){
                    System.out.println("Bomba!");
                    tabuleiro.reiniciar();
                }
            }
            else{
                System.out.println("Posição invalida!");
            }
        }
        tabuleiro.mostrarTabuleiro();
        System.out.println("Parabens " + jogador1.nome + ", voce venceu!");
    }
}
