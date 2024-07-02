import classes.Carro;

public class App {
    public static void main(String[] args) throws Exception {      
        // Criação de um objeto Car original
        Carro original = new Carro("Toyota", "Red");

        // Clonando o objeto original
        try {
            Carro clonedo = (Carro) original.clone();

            // Modificando o clone
            clonedo.setCor("Blue");

            // Exibindo os detalhes dos carros
            System.out.println("Original Car: " + original);
            System.out.println("Cloned Car: " + clonedo);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
