import java.util.ArrayList;

import javax.swing.*;
public class App {
   public static void main(String[] args) {

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
                                String modelo = JOptionPane.showInputDialog("Informe o modelo da aeronave: ");
                                Aeronave novaAeronave = new Aeronave(modelo);
                                setAeronave.add(novaAeronave);
                                setModelo(modelo);
                                System.out.println("Aeronaves cadastradas:");
                                for (Aeronave aeronaveLista : setAeronave) {
                                    System.out.println(aeronaveLista.getModelo());
                                }
                                JOptionPane.showMessageDialog(null, "Aeronave cadastrada com sucesso!");
                                System.out.println(modelo);
                            }; 
                            break;
                            case 2:
                                cadastrarAeronave();
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

    private static void parametroDoSistema() {
    }

    public static ArrayList<Aeronave> setAeronave = new ArrayList<Aeronave>();
}