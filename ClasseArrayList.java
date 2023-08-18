import java.util.ArrayList;

public class ClasseArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrlist = new ArrayList<String>();
        Bigmax aux = new Bigmax();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        palavras = aux.eliminaPalavrasRepitidas(palavras);

        // Insercao

        long tempoInicial = System.nanoTime();
        for(String palavra : palavras){
            arrlist.add(palavra);
        }
        long tempoFinal = System.nanoTime();

        long tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de insercao classe ArrayList: " + tempoTotal + " microsegundos");

        // Consulta

        String[] palavrasConsultadas = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};

        tempoInicial = System.nanoTime();
        for(String palavra : palavrasConsultadas){
            if(arrlist.contains(palavra))
                System.out.println("Palavra " + palavra + " encontrada na classe ArrayList");
        }
        tempoFinal = System.nanoTime();

        tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de consulta classe ArrayList: " + tempoTotal + " microsegundos");

        // Remocao
        
        tempoInicial = System.nanoTime();
        arrlist.remove("Lisbon");
        arrlist.remove("NASA");
        arrlist.remove("Kyunghee");
        arrlist.remove("Konkuk");
        arrlist.remove("Sogang");
        arrlist.remove("momentarily");
        arrlist.remove("rubella");
        arrlist.remove("vaccinations");
        arrlist.remove("government");
        arrlist.remove("Authorities");
        tempoFinal = System.nanoTime();

        tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de remocao classe ArrayList: " + tempoTotal + " microsegundos");
    }
}