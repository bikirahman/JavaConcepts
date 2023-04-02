// Define an interface with two abstract methods: show() and config()
interface Test {
    void show();
    void config();
}

// Declare a functional interface with one abstract method: singleInterfaceMethod()
@FunctionalInterface
interface singleInterface {
    void singleInterfaceMethod();
}

// Implement the Test interface in the Demo class
class Demo implements Test {
    @Override
    public void show() {
        System.out.println("In show..");
    }

    @Override
    public void config() {
        System.out.println("In config..");
    }
}

// Create a class that contains the main method
public class InterfaceConcept {
    public static void main(String[] args) {
        // Create an instance of the Demo class
        Demo demo = new Demo();
        
        // Call the show() and config() methods of the Demo instance
        demo.show();
        demo.config();
        
        // Create an instance of the singleInterface interface using a lambda expression
        singleInterface ss = () -> System.out.println("In single interface..");
        
        // Call the singleInterfaceMethod() method of the singleInterface instance
        ss.singleInterfaceMethod();
    }
}