package models;

public abstract class ContaBancaria {
    private double saldo;

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
