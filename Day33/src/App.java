import classes.*;
public class App {
    public static void main(String[] args) throws Exception {
        String[] nomes = {"Ana", "Carlos", "Bianca", "João"};
        NomeCollection nomeCollection = new NomeCollectionImpl(nomes);
        Iterator iterator = nomeCollection.createIterator();

        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println(nome);
        }    }
}
