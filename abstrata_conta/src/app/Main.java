package app;
import models.*;

public class Main {

    public static void main(String[] args) {
        //Instanciando objetos
        ContaPoupanca cp = new ContaPoupanca(1000);
        ContaCorrente cc = new ContaCorrente(500, 200); 

        // Teste Conta poupança
        System.out.println(cp.sacar(200)); 
        System.out.println(cp.consultar()); 
        cp.depositar(300);
        System.out.println(cp.consultar() + "\n"); 

        // Teste Conta Corrente
        System.out.println(cc.sacar(600)); 
        System.out.println(cc.consultar());
    }
}
