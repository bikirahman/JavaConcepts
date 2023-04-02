/**
 * This code demonstrates the use of inner classes in Java. The class A has an inner class B, and both have a method called
 * show(). The show() method of class A prints "Showing A.." to the console, while the show() method of class B prints
 * "Showing B..". The InnerClassCalling class creates an instance of class A and calls its show() method, and then creates
 * an instance of class B using the instance of class A and calls its show() method.
 */
class A {
    public void show() {
        System.out.println("Showing A..");
    }

    class B {
        public void show() {
            System.out.println("Showing B..");
        }
    }
}

public class InnerClassCalling {
    public static void main(String[] args) {
        // Create an instance of class A
        A a = new A();
        // Call the show() method of class A
        a.show();

        // Create an instance of class B using an instance of class A
        A.B obj = a.new B();
        // Call the show() method of class B
        obj.show();
    }
}