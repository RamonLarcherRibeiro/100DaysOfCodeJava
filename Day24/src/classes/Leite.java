package classes;

public class Leite extends BebidaDecorator {
    public Leite(Bebida bebida) {
        super(bebida);
    }

    public String getDescricao() {
        return bebida.getDescricao() + ", Leite";
    }

    public double custo() {
        return bebida.custo() + 0.50;
    }
}



