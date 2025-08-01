package banco;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe que representa o banco.
 * Demonstra POLIMORFISMO ao tratar diferentes tipos de contas (ContaCorrente e ContaPoupanca)
 * como objetos da classe base Conta.
 */
public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome){
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta) {
        contas.add(conta);
    }

    public void listarContas() {
        System.out.println("\n=== Lista de Contas do Banco " + nome + " ===");
        for (Conta conta : contas) {
            // Polimorfismo - chamada do método imprimirExtrato() específico de cada tipo de conta
            conta.imprimirExtrato();
            System.out.println();
        }
    }
}
