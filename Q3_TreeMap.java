import java.util.TreeMap;

public class Q3_TreeMap {
    public static void main(String[] args) {
        TreeMap<String, Integer> hash = new TreeMap<String, Integer>();
        Bigmax aux = new Bigmax();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        palavras = aux.eliminaPalavrasRepitidas(palavras);

        long tempoInicial = System.nanoTime();
        for(String palavra : palavras){
            hash.put(palavra, 0);
        }
        long tempoFinal = System.nanoTime();

        long tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de insercao classe TreeMap: " + tempoTotal + " microsegundos");
    }
}
