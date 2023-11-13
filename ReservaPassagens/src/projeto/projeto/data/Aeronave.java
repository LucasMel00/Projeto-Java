package projeto.data;
public class Aeronave {
    protected final String modelo;

    public Aeronave(String modelo) {
        if (modelo == null || modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("O modelo da aeronave não pode ser nulo ou vazio.");
        }
        this.modelo = modelo.trim();
    }

    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return modelo;
    }
}
