package classes;
// Classe Abstrata
public  abstract class AbstractClass {
    // Método template definindo o esqueleto do algoritmo
    public final void templateMethod() {
        stepOne();
        stepTwo();
        stepThree();
        optionalHook(); // Um "gancho" opcional, que pode ser sobrescrito
    }

    // Métodos que devem ser implementados pelas subclasses
    protected abstract void stepOne();
    protected abstract void stepTwo();
    protected abstract void stepThree();

    // Método gancho opcional com implementação padrão
    protected void optionalHook() {}
}
