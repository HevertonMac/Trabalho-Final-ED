import java.util.Vector;
public class Q1_Vector {
	public static void main(String[] args) {
		Vector<String> vet = new Vector<String>();
		Bigmax aux = new Bigmax();
		String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
		palavras = aux.eliminaPalavrasRepitidas(palavras);

		long tempoInicial = System.nanoTime();
		for(String palavra : palavras){
			vet.add(palavra);
		}
		long tempoFinal = System.nanoTime();

		long tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de insercao classe Vector: " + tempoTotal + " microsegundos");
	}
}
