package projeto.config;
import javax.swing.*;

import projeto.classes.Voo;

import java.util.Map;

public class MostrarTodosVoos {
    public void mostrarVoos(Map<Integer, Voo> voos) {
        StringBuilder arrayStr = new StringBuilder();

        for (Voo voo : voos.values()) {
            arrayStr.append(voo.getNro()).append(" - ").append(voo).append("\n");
        }

        showMessageDialog("Voos \n" + arrayStr);
    }

    private void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
