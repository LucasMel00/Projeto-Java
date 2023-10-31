import java.util.ArrayList;

public class Aeronave {
    public ArrayList<String> modelos = new ArrayList<String>();
    public String modelo;

    public Aeronave(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        if(modelos.isEmpty()){
            return "Não há aeronaves cadastradas";
        } else {
            while (modelos.iterator().hasNext()) {
                return modelos.iterator().next();
            }
        }
        return modelo;
    }

    public void setModelo(String modelo) {
        modelos.add(modelo);
    }
    
}