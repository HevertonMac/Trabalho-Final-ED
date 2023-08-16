import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;

public class Bigmax {

	public String[] getPalavavrasDoTXT(String nomeDoArquivo) {
		File arquivo = new File("leipzig100k.txt");
		String texto = "";

		try {
			FileReader fileReader = new FileReader(arquivo);
			BufferedReader bufferedReader = new BufferedReader(fileReader);

			System.out.println("Lendo o arquivo...");

			String linha;
			while ((linha = bufferedReader.readLine()) != null) {
				texto = texto + linha;
			}

			System.out.println("Arquivo lido com sucesso!");
			bufferedReader.close();

		} catch (IOException e) {
			System.out.println("Ocorreu um erro ao ler o arquivo: " + e.getMessage());
		}

		System.out.println("Iniciando o split...");
		String[] palavras = texto.split("[\\s,.;:!?\"_]+");
		System.out.println("Split finalizado!");
		return palavras;
	}

	public String[] eliminaPalavrasRepitidas(String[] palavras){
		System.out.println("Iniciando a remocao de palavras repetidas...");
		HashSet<String> uniqueWords = new HashSet<>(Arrays.asList(palavras));
		System.out.println("Remocao de palavras repetidas finalizada!");
		return uniqueWords.toArray(new String[0]);
    }
}
