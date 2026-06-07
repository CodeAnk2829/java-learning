package datatypes;

public class TypePromotion {
    public static void main(String args[]) {
        byte a = 10;
        byte b = 30;

        int result = a * b; // byte * byte will be out of range but java supports it implicitly if you store it into the suitable data type
        System.out.println(result);
        long value = 123L;
        System.out.println(value);

        // byte c = a + b; // Although a and b are bytes, the expression a + b is automatically promoted to int, causing a compile-time error when assigned to a byte

        byte c = (byte)(a + b);
        System.out.println(c);
    }
}
