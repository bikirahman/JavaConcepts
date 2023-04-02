class A {
    public void show(){
        System.out.println("Showing A..");
    }

    public void show1(){
    }
}
public class AnonymousClass {
    public static void main(String[] args) {
        A a = new A(){
            public void show1(){
                System.out.println("Showing Anonymous B..");
            }
        };

        a.show();
        a.show1();
    }
}
