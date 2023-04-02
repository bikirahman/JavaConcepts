// This is an abstract class, which means it cannot be instantiated
// directly, but must be extended by another class
abstract class Animal {
    // This is an abstract method, which means it has no implementation
    // and MUST BE OVERRIDDEN by any class that extends this abstract class
    public abstract void eat();

    // This is a concrete method, which means it has an implementation
    // and can be used by any class that extends this abstract class
    public void sleep() {
        System.out.println("Animal is sleeping");
    }
}

// This is a concrete class that extends the Animal abstract class
class Dog extends Animal {
    // This overrides the abstract eat() method of the Animal class
    public void eat() {
        System.out.println("Dog is eating");
    }

    // This is a method specific to the Dog class
    public void bark() {
        System.out.println("Dog is barking");
    }
}

// This is the main class that will run when the program is executed
public class AbstractExample {
    public static void main(String[] args) {
        // This is legal because Dog is a concrete class that extends Animal
        Dog dog = new Dog();
        dog.eat(); // This will call the overridden eat() method of the Dog class
        dog.sleep(); // This will call the inherited sleep() method of the Animal class
        dog.bark(); // This will call the bark() method of the Dog class
    }
}
