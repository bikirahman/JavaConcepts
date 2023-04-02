class Test{
    String str = "First world 1";
    public void show(Test test){
        test.str = this.str;
        System.out.println(test.str);
    }
}
public class StaticConcept {
    public static void main(String[] args) {
        Test test = new Test();
        System.out.println(test.str);
        test.show(test);
    }
}