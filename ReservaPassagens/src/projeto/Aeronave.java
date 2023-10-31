package projeto;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class Aeronave {
    ArrayList<String> modelos;
    public String modelo;

    public Aeronave(String modelo) {
        modelos.add(modelo);
    }

    public Aeronave(){

        modelos = new ArrayList<String>();
    }
        public ArrayList<String> getModelos() {
        return modelos;
        }    
        
        public void salvarModelosEmArquivo(String caminhoArquivo) throws IOException {
        FileWriter fileWriter = new FileWriter(caminhoArquivo);
        for (String modelo : modelos) {
            fileWriter.write(modelo + "\n");
        }

        fileWriter.close();
    }

    public void carregarModelosDoArquivo(String caminhoArquivo) throws IOException {
        FileReader fileReader = new FileReader(caminhoArquivo);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String linha;
        while ((linha = bufferedReader.readLine()) != null) {
            modelos.add(linha);
        }
        bufferedReader.close();
    }
}

