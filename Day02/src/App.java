import pessoa.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Ramon");
        pessoa1.setEmail("ramon@email.com");

        //depositar valor na carteira 
        pessoa1.getCarteira().depositar(10);

        System.out.println("----------PESSOA----------");
        System.out.println("Nome : " + pessoa1.getNome());
        System.out.println("Email : " + pessoa1.getEmail());
        System.out.println("----------CARTEIRA----------");
        System.out.println("Propietario : " + pessoa1.getCarteira().getPropietario());
        System.out.println("Saldo : " + pessoa1.getCarteira().getSaldo());
        
    }
}
