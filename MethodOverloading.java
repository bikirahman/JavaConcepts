class DemoData {
    
    public static void show(String str){
        System.out.println(str);
    }
    
    public static void show(String str, String str2){
        System.out.println(str+" : "+str2);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        DemoData.show("Hello First word");
        DemoData.show("Hello second", "World");
    }
}