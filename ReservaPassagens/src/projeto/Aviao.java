public class Aviao {
    private Passageiro[][] lugares;

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

    // New constructor that receives a Passageiro object
    public Aviao(int linhas, int colunas, Passageiro passageiro) {
        lugares = new Passageiro[linhas][colunas];
        setPassageiro(0, 0, passageiro);
    }
}

