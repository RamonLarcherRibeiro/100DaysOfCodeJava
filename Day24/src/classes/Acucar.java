package classes;

public class Acucar extends BebidaDecorator {
    public Acucar(Bebida bebida) {
        super(bebida);
    }

    public String getDescricao() {
        return bebida.getDescricao() + ", Açúcar";
    }

    public double custo() {
        return bebida.custo() + 0.20;
    }
}