import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoverDuplicados {

    public static <T> List<T> removerDuplicados(List<T> lista) {
        Set<T> conjunto = new HashSet<>(lista);
        
        return new ArrayList<>(conjunto);
    }

    public static void main(String[] args) {
        List<Integer> listaComDuplicados = new ArrayList<>();
        listaComDuplicados.add(1);
        listaComDuplicados.add(2);
        listaComDuplicados.add(3);
        listaComDuplicados.add(2);
        listaComDuplicados.add(4);
        listaComDuplicados.add(1);

        System.out.println("Lista original: " + listaComDuplicados);

        List<Integer> listaSemDuplicados = removerDuplicados(listaComDuplicados);

        System.out.println("Lista sem duplicados: " + listaSemDuplicados);
    }
}
