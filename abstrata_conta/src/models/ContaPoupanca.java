package models;

public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    // Implementação dos métodos abstratos
    @Override
    public String sacar(double valor) {
        if (getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            return "Seu saque foi realizado com sucesso!!\nSaldo atual: " + getSaldo();
        } else {
            return "Saldo insuficiente para fazer um saque.";
        }
    }

    //Sobrescrevendo os métodos
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + valor);
    }

    @Override
    public double consultar() {
        return getSaldo();
    }
}
