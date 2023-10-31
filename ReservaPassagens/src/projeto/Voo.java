package projeto;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Voo {
    private String numeroVoo;
    private String data;
    private String hora;

    public Voo(String numeroVoo, String data, String hora) {
        this.numeroVoo = numeroVoo;
        this.data = data;
        this.hora = hora;
    }

    public String getNumeroVoo() {
        return numeroVoo;
    }

    public void setNumeroVoo(String numeroVoo) {
        this.numeroVoo = numeroVoo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    @Override
    public String toString() {
        return "Voo " + numeroVoo + " { "  +"\n"+
                " numeroVoo= " + numeroVoo + "\n" +
                " data= " + data + "\n" +
                " hora= " + hora + "\n" +
                " } ";
    }

    // Método para salvar o voo em um arquivo TXT
    public void salvarEmArquivo(String caminhoArquivo) throws IOException {
        FileWriter fileWriter = new FileWriter(caminhoArquivo);
        fileWriter.write(this.toString() + "\n");
        fileWriter.close();
    }

    // Método para salvar uma lista de voos em um arquivo TXT
    public static void salvarEmArquivo(ArrayList<Voo> voos, String caminhoArquivo) throws IOException {
        FileWriter fileWriter = new FileWriter(caminhoArquivo);
        for (Voo voo : voos) {
            fileWriter.write(voo.toString() + "\n");
        }
        fileWriter.close();
    }

    
}