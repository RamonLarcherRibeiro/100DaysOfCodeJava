import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);
        numeros.add(4);
        numeros.add(2);

        Map<Integer, Integer> frequencia = contarFrequencia(numeros);

        System.out.println("Frequencia de cada numero:");
        for (Map.Entry<Integer, Integer> entry : frequencia.entrySet()) {
            System.out.println("Numero " + entry.getKey() + ": " + entry.getValue() + " vezes");
        }
    }

    public static Map<Integer, Integer> contarFrequencia(List<Integer> numeros) {
        Map<Integer, Integer> frequenciaMap = new HashMap<>();

        for (Integer numero : numeros) {
            if (frequenciaMap.containsKey(numero)) {
                frequenciaMap.put(numero, frequenciaMap.get(numero) + 1);
            } else {
                frequenciaMap.put(numero, 1);
            }
        }

        return frequenciaMap;
    
    }
}
