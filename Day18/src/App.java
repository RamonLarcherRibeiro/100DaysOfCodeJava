import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
       List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice", 30));
        pessoas.add(new Pessoa("Bob", 25));
        pessoas.add(new Pessoa("Charlie", 35));

        Collections.sort(pessoas,  Pessoa.idadeDecrescenteComparator); // Ordena pela ordem natural (idade)
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }    
    
    
    }
}
