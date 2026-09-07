package br.inatel.cdg;

public class Campo {

    boolean temBomba;
    boolean visitado;

    boolean abrir(){
        visitado = true;
        return temBomba;
    }
}
