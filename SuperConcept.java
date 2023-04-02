class Animal {
    String name;
    
    Animal(String name) {
        this.name = name;
    }
    
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    String breed;
    
    Dog(String name, String breed) {
        super(name); // call the superclass constructor
        this.breed = breed;
    }
    
    void makeSound() {
        super.makeSound(); // call the superclass method
        System.out.println("Dog barks");
    }
    
    void printDetails() {
        System.out.println("Name: " + super.name); // access the superclass variable
        System.out.println("Breed: " + this.breed);
    }
}

public class SuperConcept {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", "Labrador");
        myDog.makeSound(); // calls the makeSound method in the Dog class
        myDog.printDetails();
    }
}

