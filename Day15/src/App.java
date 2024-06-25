import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa("ramon", 23);
        Pessoa pessoa2 = new Pessoa("ramon", 23);
        Pessoa pessoa3 = new Pessoa("maria", 22);


        
        if(pessoa1.equals(pessoa2)){
            System.out.println("pessoa1 = pessoa2");
        }else{
            System.out.println("pessoa1 != pessoa2");
        }

        if (pessoa1.equals(pessoa3)) {
            System.out.println("pessoa1 = pessoa3");
        }else{
            System.out.println("pessoa1 != pessoa3");
        }

        System.out.println("hash pessoa1 : "+ pessoa1.hashCode());
        System.out.println("hash pessoa2 : "+ pessoa2.hashCode());
        System.out.println("hash pessoa3 : "+ pessoa3.hashCode());


    }
}
