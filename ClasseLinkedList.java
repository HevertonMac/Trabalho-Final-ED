import java.util.LinkedList;

public class ClasseLinkedList {
	public static void main(String[] args) {
		LinkedList<String> lklist = new LinkedList<String>();
		Bigmax aux = new Bigmax();
		String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
		palavras = aux.eliminaPalavrasRepitidas(palavras);

		// Insercao

		System.out.println("\nIniciando insercao das palavras do arquivo leipzig100k.txt na classe LinkedList");

		long tempoInicial = System.nanoTime();
		for(String palavra : palavras){
			lklist.add(palavra);
		}
		long tempoFinal = System.nanoTime();

		System.out.println("Insercao concluida!");

		long tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de insercao classe LinkedList: " + tempoTotal + " microsegundos\n");

		// Consulta
		
		String[] palavrasConsultadas = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};

		System.out.println("Iniciando consulta das palavras: Lisbon, NASA, Kyunghee, Konkuk, Sogang, momentarily, rubella, vaccinations, government, Authorities");

		tempoInicial = System.nanoTime();
		for(String palavra : palavrasConsultadas){
			if(lklist.contains(palavra))
				System.out.println("Palavra " + palavra + " encontrada na classe LinkedList");
		}
		tempoFinal = System.nanoTime();

		tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de consulta classe LinkedList: " + tempoTotal + " microsegundos\n");

		// Remocao

		System.out.println("Iniciando remocao das palavras: Lisbon, NASA, Kyunghee, Konkuk, Sogang, momentarily, rubella, vaccinations, government, Authorities");

		tempoInicial = System.nanoTime();
		lklist.remove("Lisbon");
		lklist.remove("NASA");
		lklist.remove("Kyunghee");
		lklist.remove("Konkuk");
		lklist.remove("Sogang");
		lklist.remove("momentarily");
		lklist.remove("rubella");
		lklist.remove("vaccinations");
		lklist.remove("government");
		lklist.remove("Authorities");
		tempoFinal = System.nanoTime();

		System.out.println("Remocao concluida!");

		tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de remocao classe LinkedList: " + tempoTotal + " microsegundos");
	}
}