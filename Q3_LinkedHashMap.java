import java.util.LinkedHashMap;

public class Q3_LinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hash = new LinkedHashMap<String, Integer>();
        Bigmax aux = new Bigmax();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        palavras = aux.eliminaPalavrasRepitidas(palavras);

        long tempoInicial = System.nanoTime();
        for(String palavra : palavras){
            hash.put(palavra, 0);
        }
        long tempoFinal = System.nanoTime();

        long tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de insercao classe LinkedHashMap: " + tempoTotal + " microsegundos");
    }
}
