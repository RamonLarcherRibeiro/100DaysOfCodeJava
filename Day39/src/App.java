import classes.*;
public class App {
    public static void main(String[] args) throws Exception {
        AbstractClass classA = new ConcreteClassA();
        classA.templateMethod();

        System.out.println();

        AbstractClass classB = new ConcreteClassB();
        classB.templateMethod();
    }
}
