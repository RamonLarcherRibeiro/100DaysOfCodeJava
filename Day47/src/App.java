import classes.ExpensiveObject;
import classes.LazyInitialization;

public class App {
    
    public static void main(String[] args) {
        LazyInitialization lazyInitialization = new LazyInitialization();
        System.out.println("Objeto ainda não foi criado.");
        ExpensiveObject obj = lazyInitialization.getExpensiveObject(); // ExpensiveObject será criado aqui
        System.out.println("Objeto criado.");
    }
}
