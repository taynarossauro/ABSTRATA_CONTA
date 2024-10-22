# Sistema_Bancário

Este projeto implementa uma hierarquia de contas bancárias utilizando classes abstratas e polimorfismo em Java. A classe abstrata `ContaBancaria` define os métodos comuns para diferentes tipos de contas, enquanto `ContaCorrente` e `ContaPoupança` possuem implementações específicas para suas regras de saque, depósito e consulta.

## 🚀 Começando

O objetivo é entender como trabalhar com classes abstratas e métodos abstratos em Java, além de aplicar conceitos de herança e polimorfismo na criação de contas bancárias com comportamentos distintos.

### Características

•⁠  ⁠Classe abstrata `ContaBancaria` com os métodos abstratos:  
    - `saque(double valor)`  
    - `deposito(double valor)`  
    - `consulta()`  

•⁠  ⁠Classe `ContaPoupanca`, que herda de `ContaBancaria`, com as seguintes regras:  
    - Não permite saques maiores que o saldo.  
    - Taxas de saque, depósito e consulta diferenciadas.  

•⁠  ⁠Classe `ContaCorrente`, que herda de `ContaBancaria`, com as seguintes regras:  
    - Permite saques que excedem o saldo, utilizando um limite.  
    - Taxas específicas para saque, depósito e consulta.  

### Exemplo de Execução

1. Criar objetos das classes `ContaCorrente` e `ContaPoupanca`.
2. Testar as operações de saque, depósito e consulta, observando as diferenças no comportamento:

- **ContaPoupanca:**  
    Saldo inicial: R$ 1000  
    Saque permitido: R$ 500  
    Saque não permitido: R$ 1500 (maior que o saldo)

- **ContaCorrente:**  
    Saldo inicial: R$ 1000  
    Saque permitido: R$ 1500 (utilizando limite)

## 🔧 Instalação

1. Clone o repositório.
2. Abra o projeto na sua IDE favorita (Eclipse, IntelliJ, etc.).
3. Execute a classe `Main` para testar as funcionalidades.

## 🛠️ Construído com

•⁠  ⁠Linguagem: `Java`  
•⁠  ⁠IDE: `Eclipse`  

## 📌 Versão

Versão 1.0

**Autor:** Taynara Raquel
