package projeto;

import java.io.IOException;

import javax.swing.JOptionPane;

public class CadastroVooImpl implements CadastroVoo {

    @Override
    public void cadastrarVoo(String numeroVoo, String dataVoo, String horaVoo) {
        // Valida a entrada
        if (numeroVoo == null || numeroVoo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "O número do voo não pode ser nulo ou vazio!");
            return;
        }

        if (dataVoo == null || dataVoo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A data do voo não pode ser nula ou vazia!");
            return;
        }

        if (horaVoo == null || horaVoo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "A hora do voo não pode ser nula ou vazia!");
            return;
        }

        Voo voo = new Voo(numeroVoo, dataVoo, horaVoo);

        try {
            voo.salvarEmArquivo("voos.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Exibe uma mensagem de confirmação
        JOptionPane.showMessageDialog(null, "Voo cadastrado com sucesso!");

        
    }

}