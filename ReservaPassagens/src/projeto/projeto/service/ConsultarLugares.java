package projeto.service;
import javax.swing.*;

import projeto.classes.Voo;

public class ConsultarLugares {
    private static final String SEPARATOR_COMMA = ",";
    private static final String SEPARATOR_NEWLINE = "\n";

    public void consultarLugares(Voo voo) {
        StringBuilder arrayStr = new StringBuilder();

        for (int i = 0; i < voo.getAviao().lugares.length; i++) {
            for (int j = 0; j < voo.getAviao().lugares[i].length; j++) {

                if (voo.getAviao().lugares[i][j] != null) {
                    arrayStr.append("[").append(i + 1).append(",").append(j + 1).append("]");
                } else {
                    arrayStr.append("[--]");
                }

                if (j < voo.getAviao().lugares[i].length - 1) {
                    arrayStr.append(SEPARATOR_COMMA);
                }
            }

            if (i < voo.getAviao().lugares.length - 1) {
                arrayStr.append(SEPARATOR_NEWLINE);
            }
        }

        showMessageDialog("Lugares do Voo " + voo.getNro() + SEPARATOR_NEWLINE + arrayStr);
    }

    private void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}
