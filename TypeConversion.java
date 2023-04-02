public class TypeConversion{
    
    static byte byteVar = 127;
    static int integerVal = 256;

    // Implicit conversion
    public static void convertByteToInt() {
        integerVal = byteVar;
        System.out.println("From byte to int : "+integerVal);  
    }

    // Explicit conversion
    public static void convertIntToByte(){
        byteVar = (byte) integerVal;
        System.out.println("From int to byte : "+byteVar);
    }

    public static void main(String[] args) {
        convertByteToInt();
        convertIntToByte();
    }
}