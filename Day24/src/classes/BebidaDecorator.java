package classes;

public abstract class BebidaDecorator implements Bebida {
    protected Bebida bebida;

    public BebidaDecorator(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescricao() {
        return bebida.getDescricao();
    }

    public double custo() {
        return bebida.custo();
    }
}

