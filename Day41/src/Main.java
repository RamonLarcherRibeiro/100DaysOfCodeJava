import classes.*;
public class Main {
    public static void main(String[] args) {
        Animal myAnimal = getAnimal("dog");
        myAnimal.makeSound(); // Output: Woof!

        Animal unknownAnimal = getAnimal("elephant");
        unknownAnimal.makeSound(); // Não faz nada
    }

    public static Animal getAnimal(String type) {
        if ("dog".equalsIgnoreCase(type)) {
            return new Dog();
        } else if ("cat".equalsIgnoreCase(type)) {
            return new Cat();
        } else {
            return new NullAnimal();
        }
    }
}