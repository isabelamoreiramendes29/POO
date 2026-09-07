package br.inatel.cdg;
import java.util.Random;

public class Tabuleiro {

    Campo[][] campos; //Composição: um tabuleiro tem campos
    int bombas; //Atributo

    //Monta o tabuleiro: cria os campos e sorteia as bombas
    void iniciar(int tamanho, int qtdBombas) {

        campos = new Campo[tamanho][tamanho];
        bombas = qtdBombas;

        //Cria a matriz do tabuleiro
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                campos[i][j] = new Campo();
            }
        }

        Random rand = new Random();
        int bombasColocadas = 0; //variável local

        while (bombasColocadas < qtdBombas) {
            int l = rand.nextInt(tamanho);
            int c = rand.nextInt(tamanho);

            if (campos[l][c].temBomba == false) {
                campos[l][c].temBomba = true;
                bombasColocadas++;
            }
        }
    }

    boolean abrirCampo(int linha, int coluna){

        Campo campo = campos[linha][coluna];
        boolean tinhaBomba = campo.abrir();
        return tinhaBomba;
    }

    boolean venceu(){

        for(int i = 0; i < campos.length; i++){
            for(int j = 0; j < campos[i].length; j++){

                if(campos[i][j].temBomba == false && campos[i][j].visitado == false){
                    return false;
                }
            }
        }
        return true;
    }

    void reiniciar(){
        for(int i = 0; i < campos.length; i++){
            for(int j = 0; j < campos[i].length; j++){
                campos[i][j].visitado = false;
            }
        }
    }

    void mostrarTabuleiro(){
        for(int i = 0; i < campos.length; i++){
            for(int j = 0; j < campos[i].length; j++){

                if(campos[i][j].visitado == true){
                    System.out.print("[ x ]");
                }
                else{
                    System.out.print("[   ]");
                }
            }
            System.out.println();
        }
    }
}
