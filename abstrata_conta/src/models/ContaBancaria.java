package models;

public abstract class ContaBancaria {
	//Declarando atributos
    private double saldo;

    //Construtor da classe
    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    // getters
    public double getSaldo() {
        return saldo;
    }

    // setters
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos abstratos
    public abstract String sacar(double valor);
    public abstract void depositar(double valor);
    public abstract double consultar();
}
