import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
        //craindo a primeira lista 
        ArrayList<String> List = new ArrayList<>();
        List.add("Elemento 1");
        List.add("Elemento 2");
        List.add("Elemento 3");
        
        //criando a segunda lista 
        ArrayList<String> List2 = new ArrayList<String>();
        List2.add("Elemento 1 List2");
        List2.add("Elemento 2 List2");
        List2.add("Elemento 3 List2");

        //adicionando os elementos da lista 2 na lista 1
        List2.addAll(List);

        System.out.println("List : "+List);
        System.out.println("List2 : "+List2);


        //criando conjunto de elementos unicos usando hashset
        HashSet<String> set = new HashSet<>();
        set.add("Elemento set 1");
        set.add("Elemento set 1"); // nao sera adicionado porque nao aceita elementos iguais (unicidade)
        set.add("Elemento set 2");
        set.add("Elemento set 3");
        System.out.println("SET : "+set); // Saída: 2


        
        HashMap<String, Integer> map = new HashMap<>();
        map.put("chave1", 10);
        map.put("chave2", 20);
        System.out.println("Map : "+map); 
        System.out.println(map.get("chave1")); 




    }
}
