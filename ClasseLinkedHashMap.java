import java.util.LinkedHashMap;

public class ClasseLinkedHashMap {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> hash = new LinkedHashMap<String, Integer>();
        Bigmax aux = new Bigmax();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        palavras = aux.eliminaPalavrasRepitidas(palavras);

        // Insercao

        long tempoInicial = System.nanoTime();
        for(String palavra : palavras){
            hash.put(palavra, 0);
        }
        long tempoFinal = System.nanoTime();

        long tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de insercao classe LinkedHashMap: " + tempoTotal + " microsegundos");

        // Consulta 
        
        String[] palavrasConsultadas = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};

        tempoInicial = System.nanoTime();
        for(String palavra : palavrasConsultadas){
            if(hash.containsKey(palavra))
                System.out.println("Palavra " + palavra + " encontrada na classe LinkedHashMap");
        }
        tempoFinal = System.nanoTime();

        tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de consulta classe LinkedHashMap: " + tempoTotal + " microsegundos");

        // Remocao

        tempoInicial = System.nanoTime();
        hash.remove("Lisbon");
        hash.remove("NASA");
        hash.remove("Kyunghee");
        hash.remove("Konkuk");
        hash.remove("Sogang");
        hash.remove("momentarily");
        hash.remove("rubella");
        hash.remove("vaccinations");
        hash.remove("government");
        hash.remove("Authorities");
        tempoFinal = System.nanoTime();

        tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de remocao classe LinkedHashMap: " + tempoTotal + " microsegundos");
    }
}