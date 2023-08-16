import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Vector;

public class Q1_Vector {
    
    public static void main(String[] args) {
        Leitor aux = new Leitor();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        System.out.println("Numero de palavras splitadas: " + palavras.length);
    }
}
