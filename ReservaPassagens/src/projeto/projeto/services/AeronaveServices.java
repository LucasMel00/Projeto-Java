package projeto.services;
import javax.swing.*;
import projeto.data.Aeronave;

public class AeronaveServices{
    public Aeronave cadastrarAeronave() {
        String modelo = JOptionPane.showInputDialog("Informe o modelo da aeronave: ");

        if (modelo == null || modelo.isBlank()) {
            JOptionPane.showMessageDialog(null, "Modelo inválido!");
            return cadastrarAeronave();
        }

        return new Aeronave(modelo);
    }
}

