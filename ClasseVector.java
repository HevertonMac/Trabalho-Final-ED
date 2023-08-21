import java.util.Vector;

public class ClasseVector {
	public static void main(String[] args) {
		Vector<String> vet = new Vector<String>();
		Bigmax aux = new Bigmax();
		String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
		palavras = aux.eliminaPalavrasRepitidas(palavras);

		// Insercao

		System.out.println("\nIniciando insercao das palavras do arquivo leipzig100k.txt na classe Vector");

		long tempoInicial = System.nanoTime();
		for(String palavra : palavras){
			vet.add(palavra);
		}
		long tempoFinal = System.nanoTime();

		System.out.println("Insercao concluida!");

		long tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de insercao classe Vector: " + tempoTotal + " microsegundos\n");

		// Consulta

		String[] palavrasConsultadas = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};

		System.out.println("Iniciando consulta das palavras: Lisbon, NASA, Kyunghee, Konkuk, Sogang, momentarily, rubella, vaccinations, government, Authorities ");

		tempoInicial = System.nanoTime();
		for(String palavra : palavrasConsultadas){
			if(vet.contains(palavra))
				System.out.println("Palavra " + palavra + " encontrada na classe Vector");
		}
		tempoFinal = System.nanoTime();

		tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de consulta classe Vector: " + tempoTotal + " microsegundos\n");

		// Remocao
		
		System.out.println("Iniciando remocao das palavras: Lisbon, NASA, Kyunghee, Konkuk, Sogang, momentarily, rubella, vaccinations, government, Authorities ");

		tempoInicial = System.nanoTime();
		vet.remove("Lisbon");
		vet.remove("NASA");
		vet.remove("Kyunghee");
		vet.remove("Konkuk");
		vet.remove("Sogang");
		vet.remove("momentarily");
		vet.remove("rubella");
		vet.remove("vaccinations");
		vet.remove("government");
		vet.remove("Authorities");
		tempoFinal = System.nanoTime();

		System.out.println("Remocao concluida!");

		tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de remocao classe Vector: " + tempoTotal + " microsegundos");
	}
}