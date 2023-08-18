import java.util.Vector;
public class ClasseVector {
	public static void main(String[] args) {
		Vector<String> vet = new Vector<String>();
		Bigmax aux = new Bigmax();
		String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
		palavras = aux.eliminaPalavrasRepitidas(palavras);

		// Insercao

		long tempoInicial = System.nanoTime();
		for(String palavra : palavras){
			vet.add(palavra);
		}
		long tempoFinal = System.nanoTime();

		long tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de insercao classe Vector: " + tempoTotal + " microsegundos");

		// Consulta

		String[] palavrasConsultadas = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};

		tempoInicial = System.nanoTime();
		for(String palavra : palavrasConsultadas){
			if(vet.contains(palavra))
				System.out.println("Palavra " + palavra + " encontrada na classe Vector");
		}
		tempoFinal = System.nanoTime();

		tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de consulta classe Vector: " + tempoTotal + " microsegundos");

		// Remocao

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

		tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de remocao classe Vector: " + tempoTotal + " microsegundos");
	}
}