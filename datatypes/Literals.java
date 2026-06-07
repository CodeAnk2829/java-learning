package datatypes;

// Premitive datatypes

public class Literals {
    public static void main(String a[]) {
    
        // Integer
        int num1 = 9;
        // short = 2 bytes
        short num2 = 558;
        // byte = 1 byte
        // byte num3 = 129; // this will give error as the maximum value of byte is 127
        byte num3 = 127;
        long num4 = 23232l;

        // Float 
        // double = 8 bytes (default value)
        double d = 5.6;

        // float = 4 bytes (we have to put 'f' after the deicimal value)
        float f = 5.6f;

        // char = 2 bytes (UNICODE)
        char ch = 'a';

        // boolean
        // In java 0 or 1 can't be converted into true or false
        // boolean temp = 1; // this will throw error
        boolean b = true;


        // better zero putting
        int value = 1_00_000;
        System.out.println(value);

        int binaryValue = 0b101; // it should give 5
        System.out.println(binaryValue);

        int hexaValue = 0x7E; 
        System.out.println(hexaValue);
    }
}
