import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LerArquivoDeTexto {

    public ArrayList<String> arquivo_txt_para_array(String nomeArquivo) {
        File arquivo = new File(nomeArquivo);
        ArrayList<String> linhas = new ArrayList<String>();

        try {
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                linhas.add(linha);
            }

            bufferedReader.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
        }
        return linhas;
    }
}
