import java.util.TreeSet;

public class ClasseTreeSet {
    public static void main(String[] args) {
        TreeSet<String> hash = new TreeSet<String>();
        Bigmax aux = new Bigmax();
        String[] palavras = aux.getPalavavrasDoTXT("leipzig100k.txt");
        palavras = aux.eliminaPalavrasRepitidas(palavras);

        // Insercao

        System.out.println("\nIniciando insercao das palavras do arquivo leipzig100k.txt na classe TreeSet");

        long tempoInicial = System.nanoTime();
        for(String palavra : palavras){
            hash.add(palavra);
        }
        long tempoFinal = System.nanoTime();

        System.out.println("Insercao concluida!");

        long tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de insercao classe TreeSet: " + tempoTotal + " microsegundos\n");

        // Consulta

        String[] palavrasConsultadas = {"Lisbon", "NASA", "Kyunghee", "Konkuk", "Sogang", "momentarily", "rubella", "vaccinations", "government", "Authorities"};

        System.out.println("Iniciando consulta das palavras: Lisbon, NASA, Kyunghee, Konkuk, Sogang, momentarily, rubella, vaccinations, government, Authorities");

        tempoInicial = System.nanoTime();
        for(String palavra : palavrasConsultadas){
            if(hash.contains(palavra))
                System.out.println("Palavra " + palavra + " encontrada na classe TreeSet");
        }
        tempoFinal = System.nanoTime();

        tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de consulta classe TreeSet: " + tempoTotal + " microsegundos\n");

        // Remocao

        System.out.println("Iniciando remocao das palavras: Lisbon, NASA, Kyunghee, Konkuk, Sogang, momentarily, rubella, vaccinations, government, Authorities");

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

        System.out.println("Remocao concluida!");

        tempoTotal = (tempoFinal - tempoInicial)/1000;

        System.out.println("Tempo de remocao classe TreeSet: " + tempoTotal + " microsegundos");
    }
}