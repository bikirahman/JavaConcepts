public class StringsConcept {

    public static void main(String[] args) {
        
        String str = "Hello";
        str.concat("World");
        System.out.println(str);

        String str2 = "Hello1";
        String str3 = str2.concat("World1");
        System.out.println(str3);

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        stringBuffer.append(str3);

        System.out.println(stringBuffer);
    }
}
