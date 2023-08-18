import java.util.HashSet;

public class Q2_HashSet {
    public static void main(String[] args) {
        HashSet<String> hash = new HashSet<String>();
        Bigmax aux = new Bigmax();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        palavras = aux.eliminaPalavrasRepitidas(palavras);

        long tempoInicial = System.nanoTime();
        for(String palavra : palavras){
            hash.add(palavra);
        }
        long tempoFinal = System.nanoTime();

        long tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de insercao classe HashSet: " + tempoTotal + " microsegundos");
    }
}