package exercicio01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Double> listaDeString = new ArrayList<>();

        listaDeString.add(145.5);
        listaDeString.add(2.56);
        listaDeString.add(245.890);
        Collections.sort(listaDeString, Collections.reverseOrder());

        for (Double elemento : listaDeString){
            System.out.println(elemento);
        }

    }
}
