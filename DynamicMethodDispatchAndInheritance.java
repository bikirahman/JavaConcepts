class A{

    public void show(){
        System.out.println("Hello A");
    }

    public void playGame1(){
        System.out.println("A playing game 1");
    }
}
class B extends A{

    public void show(){
        System.out.println("Hello B");
    }

    public void playGame2(){
        System.out.println("B playing game 2");
    }
}
class C extends B{

    public void show(){
        System.out.println("Hello C");
    }

    public void playGame3(){
        System.out.println("C playing game 3");
    }
}
public class DynamicMethodDispatchAndInheritance {
    
    public static void main(String[] args) {
        A obj = new A(); 
        obj.show();

        obj = new B();
        obj.show();                 // Dynamic Method Dispatch

        obj = new C();
        obj.show();

        // --------------------------------------------------------------------------------

        C c = new C();
        c.playGame1();              // Inheritance
        c.playGame2();
        c.playGame3();

        A a = new A();
        a.playGame1();
    }
}
