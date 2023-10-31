package projeto;

import java.util.ArrayList;

public class Aviao {
    public Passageiro[][] lugares;
    public Aeronave aeronave;

    public Aviao(int linhas, int colunas) {
        lugares = new Passageiro[linhas][colunas];
    }

    public boolean verificarLugarOcupado(int linha, int coluna) {
        return lugares[linha][coluna] != null;
    }

    public Passageiro getPassageiro(int linha, int coluna) {
        return lugares[linha][coluna];
    }

    public void setPassageiro(int linha, int coluna, Passageiro passageiro) {
        lugares[linha][coluna] = passageiro;
    }

    public ArrayList<String> getAeronave (Aeronave aeronave) {
        Aeronave a = new Aeronave();
        return a.getModelos();
    }

    public Aviao(Aeronave aeronave, int linhas, int colunas, Passageiro passageiro) {
        this.aeronave = aeronave;
        lugares = new Passageiro[linhas][colunas];
        setPassageiro(0, 0, passageiro);
    }
}

