import classes.ConcreteHandlerA;
import classes.ConcreteHandlerB;
import classes.Handler;

public class App {
    public static void main(String[] args) throws Exception {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        
        handlerA.setNextHandler(handlerB);
        
        // Passa a solicitação pela cadeia
        handlerA.handleRequest("RequestA"); 
        handlerA.handleRequest("RequestB"); 
        handlerA.handleRequest("RequestC"); 
  
    }
}
