import banco.Banco;
import banco.Conta;
import banco.ContaCorrente;
import banco.ContaPoupanca;
import banco.Cliente;

public class App {
    public static void main(String[] args) {
        // Criando o banco
        Banco banco = new Banco("Digital Innovation One Bank");

        // Criando clientes
        Cliente cliente1 = new Cliente("João Silva", "123.456.789-00");
        Cliente cliente2 = new Cliente("Maria Souza", "987.654.321-00");

        // Criando contas (polimorfismo - tratando ContaCorrente e ContaPoupanca como Conta)
        Conta cc1 = new ContaCorrente(cliente1, 1000);
        Conta cp1 = new ContaPoupanca(cliente1, 0.01);
        Conta cc2 = new ContaCorrente(cliente2, 500);
        Conta cp2 = new ContaPoupanca(cliente2, 0.005);

        // Adicionando contas ao banco
        banco.adicionarConta(cc1);
        banco.adicionarConta(cp1);
        banco.adicionarConta(cc2);
        banco.adicionarConta(cp2);

        // Operações bancárias
        cc1.depositar(1000);
        cc1.sacar(500);
        cc1.transferir(300, cp1);

        cp1.aplicarRendimento();

        cc2.depositar(200);
        cc2.sacar(800); // Deve falhar (saldo + cheque especial insuficiente)

        // Listando todas as contas (polimorfismo)
        banco.listarContas();
    }
}
