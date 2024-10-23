package models;

public class ContaCorrente extends ContaBancaria {
	//Declarando atributos
    private double limite;
    private final double taxa = 2.00;

    //Construtor da classe
    public ContaCorrente(double saldo, double limite) {
        super(saldo);
        this.limite = limite;
    }

    // getter e setter para limite
    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    // Implementação dos métodos abstratos
    @Override
    public String sacar(double valor) {
        double valorComTaxa = valor + taxa;
        
        if (valorComTaxa <= 0) {
            return "Valor inválido para o saque.";
        }
        
        if (getSaldo() + limite >= valorComTaxa) {
            setSaldo(getSaldo() - valorComTaxa);
            if (getSaldo() < 0) {
                return "Saque realizado com sucesso usando o limite" + "\nSaldo atual: " + getSaldo();
            } else {
                return "Saque realizado com sucesso!\nSaldo atual: " + getSaldo();
            }
        } else {
            return "Saldo insuficiente, mesmo com o limite.";
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para o depósito.");
            return;
        }
        
        setSaldo(getSaldo() + valor - taxa);
    }

    @Override
    public double consultar() {
        setSaldo(getSaldo() - taxa); 
        return getSaldo();
    }
}
