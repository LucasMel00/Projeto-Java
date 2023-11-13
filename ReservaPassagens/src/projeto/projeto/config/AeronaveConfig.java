package projeto.config;
import javax.swing.*;

import projeto.classes.Aeronave;

public class AeronaveConfig{
    public Aeronave cadastrarAeronave() {
        String modelo = JOptionPane.showInputDialog("Informe o modelo da aeronave: ");

        if (modelo == null || modelo.isBlank()) {
            JOptionPane.showMessageDialog(null, "Modelo inválido!");
            return cadastrarAeronave();
        }

        return new Aeronave(modelo);
    }
}

