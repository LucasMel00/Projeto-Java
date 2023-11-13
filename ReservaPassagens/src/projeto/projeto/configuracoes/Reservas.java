package projeto.configuracoes;
import javax.swing.*;

import projeto.classes.Passageiro;
import projeto.classes.Voo;

public class Reservas {
    private ConsultarLugares consultarLugaresService = new ConsultarLugares();

    public void reservarLugar(Voo voo) {
        consultarLugaresService.consultarLugares(voo);

        try {
            int row = getIntInput("Informe a linha do lugar: ");
            if (row == -1) {
                showMessage("Operação cancelada!");
                return;
            }

            int column = getIntInput("Informe a coluna do lugar:");
            if (column == -1) {
                showMessage("Operação cancelada!");
                return;
            }

            if (isLugarOcupado(voo, row, column)) {
                showMessage("Lugar ocupado!");
            } else {
                Passageiro passageiro = new Passageiro(
                        getStringInput("Informe o nome do passageiro: "),
                        getStringInput("Informe o CPF do passageiro: ")
                );
                voo.getAviao().lugares[row][column] = passageiro;
                showMessage("Lugar reservado com sucesso!");
            }
        } catch (IndexOutOfBoundsException | NumberFormatException e) {
            showMessage("Lugar inválido!");
        }
    }

    private int getIntInput(String message) {
        String input = JOptionPane.showInputDialog(message);
        return (input == null) ? -1 : Integer.parseInt(input);
    }

    private String getStringInput(String message) {
        return JOptionPane.showInputDialog(message);
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private boolean isLugarOcupado(Voo voo, int row, int column) {
        return voo.getAviao().lugares[row][column] != null;
    }
}
