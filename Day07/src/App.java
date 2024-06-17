import Classes.Cumprimento;

public class App {
    public static void main(String[] args) throws Exception {
        Cumprimento cumprimento = new Cumprimento(){
            public void dizerOla() {
                System.out.println("Olá mundo!");
            }
        };

        cumprimento.dizerOla();
    }
}
