package datatypes;

// Type Conversion --> Implicit conversion
// Type Casting --> Explicit conversion

public class TypeConversionAndCasting {
    public static void main(String arg[]) {
        int a = 257;
        byte b = 45;

        System.out.println("Value of a: " + a);
        System.out.println("Value of b: " + b);
        
        // Type Conversion
        a = b;
        System.out.println("After storing b into a: " + a);

        // b = a; // error: cannot store a int value into byte as int has greater size

        // Type Casting -> explicitly mention the type you want to convert

        /* Here for this case where we are storing and int value to a byte.
        130 = 10000010 (in an unsigned int representation)
        for singed integer the left most bit decides the sign i.e. 1 -> negative and 0 -> positive
        which means if the left most bit is 1 then it is written as -2^x.
        So 10000010 is calculated as 1*(-128) + (0*64) + (0*32) + (0*16) + (0*8) + (0*4) + (1*2) + (0*1) = -126
         */
        int c = 130;
        b = (byte) c; // what b stores after this operation => only 8 bits of the given number

        System.out.println("After type casting the value of b is " + b);

        float f = 5.6f;
        System.out.println("Value of f is " + f);
        int d = (int) f; // d will contain the integer value of float value

        System.out.println("After converting float into int the value of d is " + d);
    }
}
