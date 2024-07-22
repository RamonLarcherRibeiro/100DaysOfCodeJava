package classes;

// Subclasse Concreta A
public class ConcreteClassA extends AbstractClass {
    @Override
    protected void stepOne() {
        System.out.println("ConcreteClassA: Step One");
    }

    @Override
    protected void stepTwo() {
        System.out.println("ConcreteClassA: Step Two");
    }

    @Override
    protected void stepThree() {
        System.out.println("ConcreteClassA: Step Three");
    }
}