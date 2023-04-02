/*
 * Note that when we upcast a Dog object to an Animal reference variable, 
 * the animal reference variable can still call the overridden methods of the Dog class. 
 * However, when we downcast the Animal reference variable back to a Dog reference variable, 
 * we can call all of the methods of the Dog class (including the inherited methods from the Animal class).
 */
class Animal {
    public void eat() {
        System.out.println("Animal is eating");
    }

    public void doShow() {
        // empty method
    }

    public void runningAnimal() {
        System.out.println("Animal running..");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog is barking");
    }

    public void doShow() {
        System.out.println("do show in dog");
    }
}

public class DownUpCasting {
    public static void main(String[] args) {
        Animal animal = new Dog(); // Upcasting - creating a new Dog object and assigning it to an Animal reference variable
        animal.doShow(); // Calling the doShow() method of the Dog class through the Animal reference variable

        Dog dog = (Dog) animal; // Downcasting - assigning the Animal reference variable back to a Dog reference variable
        dog.eat(); // This will call the eat() method of the Dog class
        dog.bark(); // This will call the bark() method of the Dog class
        dog.runningAnimal(); // This will call the runningAnimal() method of the Animal class, because it is not overridden in the Dog class
    }
}