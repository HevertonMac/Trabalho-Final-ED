import java.util.LinkedList;
public class Q1_LinkedList {
	public static void main(String[] args) {
		LinkedList<String> lklist = new LinkedList<String>();
		Bigmax aux = new Bigmax();
		String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
		palavras = aux.eliminaPalavrasRepitidas(palavras);

		long tempoInicial = System.nanoTime();
		for(String palavra : palavras){
			lklist.add(palavra);
		}
		long tempoFinal = System.nanoTime();

		long tempoTotal = (tempoFinal - tempoInicial)/1000;

		System.out.println("Tempo de insercao classe LinkedList: " + tempoTotal + " microsegundos");
	}
}
