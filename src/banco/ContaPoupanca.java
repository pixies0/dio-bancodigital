package banco;

/**
 * Classe ContaPoupanca que herda de Conta.
 * Demonstra HERANÇA ao estender a classe Conta.
 * Pode implementar comportamentos específicos para poupança.
 */
public class ContaPoupanca extends Conta {
    private double rendimento;

    public ContaPoupanca(Cliente cliente, double rendimento) {
        super(cliente);
        this.rendimento = rendimento;
    }

    @Override
    public void aplicarRendimento() {
        saldo += saldo * rendimento;
        System.out.println("Rendimento aplicado com sucesso!");
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupança ===");
        super.imprimirInfosComuns();
        System.out.println(String.format("Taxa de Rendimento: %.2f", this.rendimento * 100));
    }
}