import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa.Builder()
        .nome("Ramon")
        .lastName("Larcher")
        .idade(23)
        .altura(1.70)
        .peso(70.00)
        .build();

        System.out.println(pessoa1.toString());
    }
}
