package classes;

public enum DiasDaSemana{
    DOMINGO(1),
    SEGUNDA(2),
    TERCA(3),
    QUARTA(4),
    QUINTA(5),
    SEXTA(6),
    SABADO(7);

    private int valor;

    private DiasDaSemana(int valor){
        this.valor = valor;
    }

    public int getValor(){
        return valor;
    }

}