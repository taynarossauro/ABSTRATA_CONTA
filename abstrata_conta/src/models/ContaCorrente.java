package models;

public class ContaCorrente extends ContaBancaria {
    private double limite;

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
        if (getSaldo() + limite >= valor) {
            setSaldo(getSaldo() - valor);
            return "Seu saque foi realizado com sucesso!!\nSaldo atual: " + getSaldo();
        } else {
            return "Saldo insuficiente, mesmo com o limite.";
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
