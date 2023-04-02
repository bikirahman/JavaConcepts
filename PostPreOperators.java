public class PostPreOperators {
    static int number = 7;

    public static void postIncrement(){
        System.out.println("Post increment : "+ number++);
    }

    public static void preIncrement(){
        System.out.println("Pre increment : "+ ++number);
    }

    public static void main(String[] args) {
        postIncrement();
        preIncrement();
    }
}
