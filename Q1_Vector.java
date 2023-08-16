import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Q1_Vector {
    
    public static void main(String[] args) {
        File arquivo = new File("alunosED_2023.txt");
        long inicio = 0, fim = 0, tempo;
        Vector<String> alunos_vector = new Vector<String>();

        try {
            
            FileReader fileReader = new FileReader(arquivo);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String linha;
            inicio = System.nanoTime();
            while ((linha = bufferedReader.readLine()) != null) {
                alunos_vector.add(linha);
            }
            fim = System.nanoTime();

            bufferedReader.close();
            
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());   
        }

        tempo = fim - inicio;
        System.out.println("Tempo de execução usando Vector: " + tempo + " ns");   
    }
}
