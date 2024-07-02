import classes.Carro;

public class App {
    public static void main(String[] args) throws Exception {      
        // Criação de um objeto Car original
        Carro original = new Carro("Toyota", "Red");

        // Clonando o objeto original
        try {
            Carro clonado = (Carro) original.clone();

            // Modificando o clone
            clonado.setCor("Blue");

            // Exibindo os detalhes dos carros
            System.out.println("Original : " + original);
            System.out.println("Clonado : " + clonado);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

    }
}
