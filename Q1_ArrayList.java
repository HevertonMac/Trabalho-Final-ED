import java.util.ArrayList;
public class Q1_ArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<String>();
        Bigmax aux = new Bigmax();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        palavras = aux.eliminaPalavrasRepitidas(palavras);

        long tempoInicial = System.nanoTime();
        for(String palavra : palavras){
            arrlist.add(palavra);
        }
        long tempoFinal = System.nanoTime();

        long tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de insercao classe ArrayList: " + tempoTotal + " microsegundos");
    }
}
