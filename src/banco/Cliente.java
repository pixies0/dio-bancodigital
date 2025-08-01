package banco;

/**
 * Classe que representa um cliente do banco.
 * Demonstra ENCAPSULAMENTO ao proteger os atributos e fornecer métodos de acesso.
 */
public class Cliente {
    private String nome;
    private String cpf;

    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    // Métodos de acesso (getters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    // Método para exibir informações do cliente
    public void exibirInfoCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
    }
}
