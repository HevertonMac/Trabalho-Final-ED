import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {

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
}
