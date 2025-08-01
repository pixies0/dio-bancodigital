package banco;

public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
    }

    public void sacar(double valor){
        if (saldo >= valor){
            saldo -= valor;
            System.out.println("Saque Realizado com Sucesso! Saldo Atual: " + saldo);
        } else {
            System.out.println("Saldo Insuficiente! Saldo Atual: " + saldo);
        }
    }

    public void depositar(double valor){
        saldo += valor;
        System.out.println("Depósito Realizado com Sucesso! Saldo Atual: " + saldo);
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
        System.out.println("Transferência Realizada com Sucesso!");
    }

    // Encapsulamento dos atributos
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", cliente.getNome()));
        System.out.println(String.format("Agência: %d", agencia));
        System.out.println(String.format("Número: %d", numero));
        System.out.println(String.format("Saldo: %.2f", saldo));
    }

    public abstract void imprimirExtrato();

    public void aplicarRendimento(){

    }
}
