package projeto;

public class Passageiro {
    private String nome;
    private String cpf;
    private String banco;

    public Passageiro(String nome, String cpf, String banco) {
        this.nome = nome;
        this.cpf = cpf;
        this.banco = banco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getBanco() {
        return banco;
    }
}
