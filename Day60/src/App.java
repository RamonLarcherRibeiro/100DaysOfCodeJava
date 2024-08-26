import java.util.ArrayList;
import java.util.List;

import classes.Pessoa;
public class App {
    public static void main(String[] args) throws Exception {
                
        //lista de pessoas maiores de 18 anos
        List<Pessoa> maioresDeIdade = new ArrayList<>();

        // lista de pessoas
        List<Pessoa> pessoas = new ArrayList<>();

        Pessoa pessoa1 = new Pessoa(23, "Ramon");
        Pessoa pessoa2 = new Pessoa(22, "Ana");
        Pessoa pessoa3 = new Pessoa(27, "Daniele");
        Pessoa pessoa4 = new Pessoa(12, "Lucas");
        Pessoa pessoa5 = new Pessoa(22, "Gabriel");
        Pessoa pessoa6 = new Pessoa(29, "Alice");
        Pessoa pessoa7 = new Pessoa(4, "Laura");
        Pessoa pessoa8 = new Pessoa(5, "Lorena");
        Pessoa pessoa9 = new Pessoa(10, "Bernado");
        Pessoa pessoa10 = new Pessoa(27, "Carol");

        pessoas.add(pessoa1);
        pessoas.add(pessoa2);
        pessoas.add(pessoa3);
        pessoas.add(pessoa4);
        pessoas.add(pessoa5);
        pessoas.add(pessoa6);
        pessoas.add(pessoa7);
        pessoas.add(pessoa8);
        pessoas.add(pessoa9);
        pessoas.add(pessoa10);

        //percorrer todas as pessoas da lista pessoas e adicionar os maiores de idade na lista de maioresDeIdade
        for(Pessoa p : pessoas){
            if(p.idade >= 18){
                maioresDeIdade.add(p);
                System.out.println(p.nome +" é maior de idade :)");
            };
        }
       
    }
}
