import classes.*;
public class App {
    public static void main(String[] args) throws Exception {
        Bebida bebida = new Cafe();
        System.out.println(bebida.getDescricao() + " $" + bebida.custo());

        bebida = new Leite(bebida);
        System.out.println(bebida.getDescricao() + " $" + bebida.custo());

        bebida = new Acucar(bebida);
        System.out.println(bebida.getDescricao() + " $" + bebida.custo());
    }
}
