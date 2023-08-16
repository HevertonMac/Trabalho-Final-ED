import java.util.LinkedList;

public class Q1_LinkedList {

    public static void main(String[] args) {
        Leitor aux = new Leitor();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        System.out.println("Numero de palavras splitadas: " + palavras.length);
    }
}
