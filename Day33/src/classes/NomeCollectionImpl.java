package classes;

public class NomeCollectionImpl implements NomeCollection {
    private String[] nomes;
    private int index;

    public NomeCollectionImpl(String[] nomes) {
        this.nomes = nomes;
        this.index = 0;
    }

    @Override
    public Iterator createIterator() {
        return new NomeIterator();
    }

    // Classe interna que implementa o Iterator
    private class NomeIterator implements Iterator {
        private int position;

        public NomeIterator() {
            this.position = 0;
        }

        @Override
        public boolean hasNext() {
            return position < nomes.length;
        }

        @Override
        public String next() {
            return nomes[position++];
        }
    }
}
