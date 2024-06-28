package classes;
import java.util.*;

public class Pessoa implements Comparable<Pessoa> {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public int compareTo(Pessoa outraPessoa) {
        return this.idade - outraPessoa.idade; // Ordena por idade (ordem natural)
    }

    // Comparators para diferentes critérios de ordenação
    public static Comparator<Pessoa> nomeComparator = new Comparator<Pessoa>() {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return p1.nome.compareTo(p2.nome); // Ordena por nome
        }
    };

    public static Comparator<Pessoa> idadeDecrescenteComparator = new Comparator<Pessoa>() {
        @Override
        public int compare(Pessoa p1, Pessoa p2) {
            return p2.idade - p1.idade; // Ordena por idade de forma decrescente
        }
    };

    @Override
    public String toString() {
        return "Pessoa{" + "nome='" + nome + '\'' + ", idade=" + idade + '}';
    }

    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice", 30));
        pessoas.add(new Pessoa("Bob", 25));
        pessoas.add(new Pessoa("Charlie", 35));

        // Ordenação pela ordem natural (idade)
        Collections.sort(pessoas);
        System.out.println("Ordenação por idade (ordem natural):");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Ordenação por nome usando Comparator
        Collections.sort(pessoas, Pessoa.nomeComparator);
        System.out.println("Ordenação por nome:");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }

        // Ordenação por idade de forma decrescente usando Comparator
        Collections.sort(pessoas, Pessoa.idadeDecrescenteComparator);
        System.out.println("Ordenação por idade (decrescente):");
        for (Pessoa pessoa : pessoas) {
            System.out.println(pessoa);
        }
    }
}
