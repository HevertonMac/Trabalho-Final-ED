
public class Q1_ArrayList {
    public static void main(String[] args) {
        Bigmax aux = new Bigmax();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        System.out.println("Numero de palavras splitadas: " + palavras.length);
        palavras = aux.eliminaPalavrasRepitidas(palavras);
        System.out.println("Numero de palavras únicas splitadas: " + palavras.length);
    }
}
