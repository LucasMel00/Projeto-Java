package projeto.data;
public class Passageiro {
    private final String nome;
    private final String cpf;

    public Passageiro(String nome, String cpf) {
        if (nome == null || nome.trim().isEmpty() || cpf == null || cpf.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome e CPF não podem ser nulos ou vazios.");
        }
        this.nome = nome.trim();
        this.cpf = cpf.trim();
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return nome + " (" + cpf + ")";
    }
}