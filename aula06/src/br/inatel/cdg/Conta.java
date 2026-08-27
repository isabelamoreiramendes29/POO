package br.inatel.cdg;

public class Conta {

    private int numero;
    private float saldo;
    private float limite;


    public void sacar(float quantia){
        if(this.saldo > quantia){
         this.saldo -= quantia;
        }
        else{
            System.out.println("Operação Invalida");
        }
    }

    public void deposita(float quantia){
        this.saldo +=quantia;

    }
}
