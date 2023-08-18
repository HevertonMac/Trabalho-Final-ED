import java.util.LinkedList;
public class ClasseLinkedList {
	public static void main(String[] args) {
		LinkedList<String> lklist = new LinkedList<String>();
		Bigmax aux = new Bigmax();
		String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
		palavras = aux.eliminaPalavrasRepitidas(palavras);

		// Insercao

		long tempoInicial = System.nanoTime();
		for(String palavra : palavras){
			lklist.add(palavra);
		}
		long tempoFinal = System.nanoTime();

		long tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de insercao classe LinkedList: " + tempoTotal + " microsegundos");

		// Consulta
		// implementar um trecho de código para consultar 10 palavras, a saber: Lisbon, NASA, Kyunghee, Konkuk, Sogang, momentarily, rubella, vaccinations, government, Authorities.
		String[] palavrasConsultadas = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};

		tempoInicial = System.nanoTime();
		for(String palavra : palavrasConsultadas){
			if(lklist.contains(palavra))
				System.out.println("Palavra " + palavra + " encontrada na classe LinkedList");
		}
		tempoFinal = System.nanoTime();

		tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de consulta classe LinkedList: " + tempoTotal + " microsegundos");

		// Remocao

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

		tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de remocao classe LinkedList: " + tempoTotal + " microsegundos");
	}
}