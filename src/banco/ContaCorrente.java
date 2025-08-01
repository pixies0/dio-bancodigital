package banco;

/**
 * Classe ContaCorrente que herda de Conta.
 * Demonstra HERANÇA ao estender a classe Conta e herdar seus atributos e métodos.
 */
public class ContaCorrente extends Conta {
    private double chequeEspecial;

    public ContaCorrente(Cliente cliente, double chequeEspecial) {
        super(cliente);
        this.chequeEspecial = chequeEspecial;
    }

    @Override
    public void sacar(double valor) {
        // Polimorfismo - comportamento específico para ContaCorrente
        if(saldo + chequeEspecial >= valor) {
            saldo -= valor;
            System.out.println("Saque Realizado com Sucesso! Saldo Atual: " + saldo);
        } else {
            System.out.println("Saldo Insuficiente! Saldo Atual: " + saldo + ", Cheque Especial: " + chequeEspecial);
        }
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Cheque Especial: %.2f", chequeEspecial));
        System.out.println("==============================");
    }
}