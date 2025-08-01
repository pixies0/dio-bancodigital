# 🏦 Desafio Banco Digital (DIO)

## Descrição

Aplicação em Java que simula um sistema bancário digital com contas Corrente e Poupança. O sistema permite:

Cadastro de clientes e abertura de contas;

Operações financeiras: depósito, saque e transferência entre contas.

A implementação reforça os 4 pilares da Orientação a Objetos.

## Estrutura do Projeto

```src/``` — Código-fonte Java, incluindo classes como Cliente, Conta (classe abstrata ou interface IConta), ContaCorrente, ContaPoupanca e Banco como gerenciador central.

```Main.java``` — Classe principal com fluxo de interação no terminal.

Uso de coleções ```(ArrayList)``` para armazenar clientes e contas.

## Principais Funcionalidades

* Criar clientes com dados básicos (nome, CPF);

* Abrir conta corrente ou poupança;

* Realizar depósitos, saques e transferências;

* Consultar saldo e extrato;

* (Opcional) Aplicação de juros em poupança ou uso de limite em conta corrente.

## Pilares da Programação Orientada a Objetos

1. Abstração

A classe Conta representa o conceito genérico de conta bancária, enquanto ContaCorrente e ContaPoupanca implementam funcionalidades específicas.

2. Encapsulamento

Atributos como saldo, agência e número são privados, com métodos públicos (depositar, sacar, transferir) garantindo integridade dos dados.

3. Herança

ContaCorrente e ContaPoupanca estendem a classe Conta ou implementam IConta, aproveitando comportamento comum e especializando métodos.

4. Polimorfismo

Operações são feitas por referência à interface ou classe abstrata, permitindo que métodos funcionem para diferentes tipos de conta sem alteração no código.

# Melhorias Futuras

* Validação e formatação de CPF;

* Registro de transações em uma classe dedicada;

* Funcionalidades adicionais como investimentos e limites de crédito.

## Conclusão

Este repositório segue o desafio da DIO para criar um sistema bancário em Java, aplicando de forma prática os conceitos de abstração, encapsulamento, herança e polimorfismo em um projeto real.