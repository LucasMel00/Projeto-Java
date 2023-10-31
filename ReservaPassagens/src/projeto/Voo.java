package projeto;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Voo {
    public static ArrayList<String> voos = new ArrayList<>();
    public static ArrayList<String> numeroVoo = new ArrayList<>();
    public static ArrayList<String> data = new ArrayList<>();
    public static ArrayList<String> hora = new ArrayList<>();

    public static class voo {
        Aviao aviao;
        String numeroVoo;
        String data;
        String hora;

        public voo(String numeroVoo, Aviao aviao, String data, String hora) {
            this.numeroVoo = numeroVoo;
            this.aviao = aviao;
            this.data = data;
            this.hora = hora;
        }

        public String getNumeroVoo() {
            return numeroVoo;
        }

        public String getData() {
            return data;
        }

        public String getHora() {
            return hora;
        }

        public ArrayList<String> getVoos() {
            return voos;
        }
    }

    public String toString(String numeroVoo, Aeronave aeronave, String data, String hora) {

        return "Voo{" +
                "numeroVoo=" + numeroVoo +
                ", aeronave='" + aeronave + '\'' +
                ", data='" + data + '\'' +
                ", hora='" + hora + '\'' +
                '}';
    }
}
