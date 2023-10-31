import java.util.ArrayList;
import java.util.List;

public class Voo {
    private List<voo> voos = new ArrayList<>();

    public List<voo> getVoos() {
        return voos;
    }

    public class voo {
        Aeronave aeronave;
        private int numeroVoo;
        private String data;
        private String hora;

        public voo(int numeroVoo, Aeronave aeronave, String data, String hora) {
            this.numeroVoo = numeroVoo;
            this.aeronave = aeronave;
            this.data = data;
            this.hora = hora;
        }

        public int getNumeroVoo() {
            return numeroVoo;
        }

        public String getData() {
            return data;
        }

        public String getHora() {
            return hora;
        }
    }
}
