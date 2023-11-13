package projeto.services;
import javax.swing.*;
import projeto.data.Aviao;
import projeto.data.Voo;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class CadastrarVooService {

    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    private static final SimpleDateFormat hourFormat = new SimpleDateFormat("HH:mm");

    private int getIntInput(String message) {
        String input = JOptionPane.showInputDialog(message);
        return (input == null) ? -1 : Integer.parseInt(input);
    }

    private String getStringInput(String message) {
        return JOptionPane.showInputDialog(message);
    }

    private void showErrorDialog(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public Voo cadastrarVoo() {
        try {
            int nro = getIntInput("Informe o número do voo: ");
            if (nro == -1) return null;

            String date = getStringInput("Informe a data do voo (dd/MM/yyyy): ");
            if (date == null) return null;
            dateFormat.parse(date);

            String hour = getStringInput("Informe a hora do voo (HH:mm): ");
            if (hour == null) return null;
            hourFormat.parse(hour);

            String modelo = getStringInput("Informe o modelo do avião: ");
            if (Objects.equals(modelo, "")) {
                showErrorDialog("Modelo inválido!");
                return null;
            }

            int rows = getIntInput("Informe o número de linhas do avião: ");
            if (rows == -1) return null;

            int columns = getIntInput("Informe o número de colunas do avião: ");
            if (columns == -1) return null;

            Aviao aviao = new Aviao(modelo, rows, columns);
            return new Voo(aviao, nro, date, hour);

        } catch (ParseException | NumberFormatException e) {
            showErrorDialog("Data/Hora ou número de voo inválido!");
            return cadastrarVoo();
        }
    }
}