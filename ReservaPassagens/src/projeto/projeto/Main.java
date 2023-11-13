package projeto;

import projeto.data.Aeronave;
import projeto.data.Voo;
import projeto.services.AeronaveServices;
import projeto.services.CadastrarVooService;
import projeto.services.ConsultarLugarService;
import projeto.services.MostrarVoosService;
import projeto.services.ReservaService;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    private static final AeronaveServices aeronaveService = new AeronaveServices();
    private static final CadastrarVooService cadastrarVooService = new CadastrarVooService();
    private static final ReservaService reservaService = new ReservaService();
    private static final ConsultarLugarService consultarLugaresService = new ConsultarLugarService();
    private static final MostrarVoosService mostrarVoosService = new MostrarVoosService();

    private static final String[] menuOptions = {
            "Menu Principal",
            "1 - Parametros do Sistema",
            "2 - Reserva de Passagens",
            "3 - Sair"
    };

    private static final String[] paramSistemaOptions = {
            "Parametros do Sistema",
            "1 - Cadastrar Aeronave",
            "2 - Cadastrar Voo",
            "3 - Voltar"
    };

    private static final String[] reservarPassagensOptions = {
            "Reserva de Passagens",
            "1- Fazer reserva",
            "2- Consultar lugares vazios",
            "3- Consultar reservas realizadas",
            "4- Voltar"
    };

    public static void main(String[] args) {
        ArrayList<Aeronave> aeronaves = new ArrayList<>();
        HashMap<Integer, Voo> voos = new HashMap<>();

        int opcaoMenuPrincipal;
        do {
            opcaoMenuPrincipal = showMenu(menuOptions);

            switch (opcaoMenuPrincipal) {
                case 1:
                    handleParamSistema(aeronaves, voos);
                    break;
                case 2:
                    handleReservarPassagens(voos);
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Saindo...");
                    break;
            }
        } while ((opcaoMenuPrincipal >= 1 && opcaoMenuPrincipal != 3) || opcaoMenuPrincipal == 0);
    }

    private static void handleParamSistema(ArrayList<Aeronave> aeronaves, HashMap<Integer, Voo> voos) {
        int opcaoParamSistema;
        do {
            opcaoParamSistema = showMenu(paramSistemaOptions);

            switch (opcaoParamSistema) {
                case 1:
                    Aeronave aeronave = aeronaveService.cadastrarAeronave();
                    if (aeronave != null) {
                        aeronaves.add(aeronave);
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação cancelada!");
                    }
                    break;
                case 2:
                    Voo voo = cadastrarVooService.cadastrarVoo();
                    if (voo != null) {
                        voos.put(voo.getNro(), voo);
                    } else {
                        JOptionPane.showMessageDialog(null, "Operação cancelada!");
                    }
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Voltando...");
                    break;
            }
        } while ((opcaoParamSistema >= 1 && opcaoParamSistema != 3) || opcaoParamSistema == 0);
    }

    private static void handleReservarPassagens(HashMap<Integer, Voo> voos) {
        int opcaoReservarPassagens;
        do {
            opcaoReservarPassagens = showMenu(reservarPassagensOptions);

            switch (opcaoReservarPassagens) {
                case 1:
                    handleFazerReserva(voos);
                    break;
                case 2, 3:
                    handleConsultarLugares(voos);
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Voltando...");
                    break;
            }
        } while (opcaoReservarPassagens >= 1 && opcaoReservarPassagens != 4 || opcaoReservarPassagens == 0);
    }

    private static void handleFazerReserva(HashMap<Integer, Voo> voos) {
        try {
            mostrarVoosService.mostrarVoos(voos);

            String input = JOptionPane.showInputDialog("Digite o número do voo:");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
                return;
            }

            int numVoo = Integer.parseInt(input);
            Voo voo = voos.get(numVoo);
            reservaService.reservarLugar(voo);

        } catch (IndexOutOfBoundsException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Voo não encontrado!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número de voo inválido!");
        }
    }

    private static void handleConsultarLugares(HashMap<Integer, Voo> voos) {
        try {
            mostrarVoosService.mostrarVoos(voos);

            String input = JOptionPane.showInputDialog("Digite o número do voo:");

            if (input == null) {
                JOptionPane.showMessageDialog(null, "Operação cancelada!");
                return;
            }

            int numVoo = Integer.parseInt(input);
            Voo voo = voos.get(numVoo);
            consultarLugaresService.consultarLugares(voo);

        } catch (IndexOutOfBoundsException | NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Voo não encontrado!");

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número de voo inválido!");
        }
    }

    private static int showMenu(String[] options) {
        StringBuilder menu = new StringBuilder();
        for (String menuOption : options) {
            menu.append(menuOption).append("\n");
        }

        String input = JOptionPane.showInputDialog(menu.toString());

        if (input == null) {
            System.exit(0);
        }

        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}