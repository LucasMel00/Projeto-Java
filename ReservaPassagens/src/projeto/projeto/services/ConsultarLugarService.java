package projeto.services;
import projeto.data.Voo;
import javax.swing.*;

public class ConsultarLugarService {
    public void consultarLugares(Voo voo) {
        StringBuilder arrayStr = new StringBuilder();

        for (int i = 0; i < voo.getAviao().lugares.length; i++) {
            for (int j = 0; j < voo.getAviao().lugares[i].length; j++) {
                arrayStr.append("[").append(voo.getAviao().lugares[i][j]).append("]");

                if (j < voo.getAviao().lugares[i].length - 1) {
                    arrayStr.append(",");
                }
            }

            if (i < voo.getAviao().lugares.length - 1) {
                arrayStr.append("\n");
            }
        }

        showMessageDialog("Lugares do Voo " + voo.getNro() + "\n" + arrayStr);
    }

    private void showMessageDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
}