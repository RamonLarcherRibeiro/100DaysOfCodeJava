package classes;
public class Par<K , V>{
    private K chave;
    private V valor;

    public Par(K chave , V valor){
        this.chave = chave;
        this.valor = valor;   
    }

    public K getChave() {
        return chave;
    }

    public void setChave(K chave) {
        this.chave = chave;
    }

    public V getValor() {
        return valor;
    }

    public void setValor(V valor) {
        this.valor = valor;
    }

}