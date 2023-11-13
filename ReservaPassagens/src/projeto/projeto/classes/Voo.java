package projeto.classes;

public class Voo {
    private final Aviao aviao;
    private final int nro;
    private final String data;
    private final String hora;

    public Voo(Aviao aviao, int nro, String data, String hora) {
        if (aviao == null || data == null || hora == null) {
            throw new IllegalArgumentException("Os parâmetros não podem ser nulos.");
        }
        this.aviao = aviao;
        this.nro = nro;
        this.data = data;
        this.hora = hora;
    }

    public int getNro() {
        return nro;
    }

    public String getData() {
        return data;
    }

    public String getHora() {
        return hora;
    }

    public Aviao getAviao() {
        return aviao;
    }

    @Override
    public String toString() {
        return "Voo: " + nro + " - " + data + " - " + hora + " - " + aviao;
    }
}
