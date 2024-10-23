package models;

public class ContaPoupanca extends ContaBancaria {
    private final double taxa = 1.50;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    // Implementação dos métodos abstratos
    @Override
    public String sacar(double valor) {
        double valorComTaxa = valor + taxa;
        
        if (valorComTaxa <= 0) {
            return "Valor inválido para saque.";
        }

        if (getSaldo() >= valorComTaxa) {
            setSaldo(getSaldo() - valorComTaxa);
            return "Saque realizado com sucesso!\nSaldo atual: " + getSaldo();
        } else {
            return "Saldo insuficiente para fazer um saque.";
        }
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para depósito.");
            return;
        }

        setSaldo(getSaldo() + valor - taxa);
    }

    @Override
    public double consultar() {
        setSaldo(getSaldo() - taxa); // Aplica a taxa de consulta
        return getSaldo();
    }
}
