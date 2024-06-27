import classes.Par;

public class App {
    public static void main(String[] args) throws Exception {
        Par<String ,Integer> par1 = new Par<>( "chave", 10);
        System.out.println("chave do par1 : " + par1.getChave());
        System.out.println("valor do par1 : "+par1.getValor()+"\n");

        Par<Integer , Integer> par2 = new Par<>(10, 20);
        System.out.println("chave do par2 : "  +par2.getChave());
        System.out.println("valor do par2 : "+par2.getValor()+"\n");

        Par<String , String> par3 = new Par<String,String>("chave", "valor");
        System.out.println("chave do par3 : "+par3.getChave());
        System.out.println("chave do par3 : "+par3.getValor() );
    }
}
