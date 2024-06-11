package pessoa;
import carteira.Carteira;


public class Pessoa {
    private String Nome;
    private String Email;
    private Carteira Carteira;

    //construtor 
    public Pessoa(){
        this.Carteira = new Carteira();
    }

    //getter carteira
    public Carteira getCarteira(){
        return this.Carteira;
    }

    //getter Nome
    public String getNome(){
        return this.Nome;
    }

    //getter Email
    public String getEmail(){
        return this.Email;
    }

    //setter Nome 
    public void setNome(String nome){
        this.Nome = nome;
        this.Carteira.setPropietario(nome);
    }

    //setter Email
    public void setEmail(String email){
        this.Email = email;
    }





}
