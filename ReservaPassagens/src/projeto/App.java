package projeto;
import projeto.Aeronave;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
public class App {
   public static void main(String[] args) throws IOException{

    Aeronave aeronave = new Aeronave();

    int opcao = 0;
    do {
        opcao = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n1 - Parametro do Sistema\n2 - Reserva de Passagens\n3 - Sair"));
        switch (opcao) {
            case 1:
                int opcao1 = 0;
                do {
                    opcao1 = Integer.parseInt(JOptionPane.showInputDialog("Selecione uma opção:\n1 - Cadastrar Aeronave\n2 - Cadastrar Voo\n3 - Voltar ao menu principal"));
                    switch (opcao1) {
                        case 1:
                            cadastrarAeronave();
                            {
                                aeronave.carregarModelosDoArquivo("modelos.txt");
                                String model = JOptionPane.showInputDialog("Informe o modelo da aeronave: ");
                                aeronave.getModelos().add(model);
                                System.out.println("Aeronaves cadastradas:" + aeronave.getModelos());
                                JOptionPane.showMessageDialog(null, "Aeronave cadastrada com sucesso!");
                                aeronave.salvarModelosEmArquivo("modelos.txt");


                            };
                            break;
                            case 2:
                                cadastrarVoo();
                                {
                                CadastroVoo cadastroVoo = new CadastroVooImpl();
                                String numeroVoo = JOptionPane.showInputDialog("Informe o número do voo: ");
                                String dataVoo = JOptionPane.showInputDialog("Informe a data do voo: ");
                                String horaVoo = JOptionPane.showInputDialog("Informe a hora do voo: ");
                                cadastroVoo.cadastrarVoo(numeroVoo, dataVoo, horaVoo);

                                }
                                break;
                                case 3:
                                    JOptionPane.showMessageDialog(null, "Saindo...");
                                    break;
                                default:
                                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                                break;
                    }} while (opcao1 != 3);
                case 2:
                    cadastrarAeronave();
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
                    break;
            }
        } while (opcao != 3);
    }


    private static void setModelo(String modelo) {
}


    private static void cadastrarAeronave() {
    }

    private static void cadastrarVoo() {
    }

}