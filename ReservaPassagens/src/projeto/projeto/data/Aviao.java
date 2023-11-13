package projeto.data;

import java.util.Arrays;

public class Aviao extends Aeronave {
    public Passageiro[][] lugares;

    public Aviao(String modelo, int linhas, int colunas) {
        super(modelo);

        if (linhas <= 0 || colunas <= 0) {
            throw new IllegalArgumentException("O número de linhas e colunas deve ser maior que zero.");
        }

        lugares = new Passageiro[linhas][colunas];
    }

    public Passageiro getPassageiro(int linha, int coluna) {
        return lugares[linha][coluna];
    }

    public void setPassageiro(int linha, int coluna, Passageiro passageiro) {
        lugares[linha][coluna] = passageiro;
    }

    @Override
    public String toString() {
        return super.toString() + " - " + Arrays.deepToString(lugares);
    }
}
