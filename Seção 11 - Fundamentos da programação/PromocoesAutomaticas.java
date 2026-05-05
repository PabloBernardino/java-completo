public class PromocoesAutomaticas {
    public static void main(String[] args) {

        // byte → int
        byte a1 = 10;
        int b1 = a1 + 5;
        System.out.println("byte -> int: " + b1);

        //-------------------------------------------------------

        // int → long
        int a2 = 10;
        long b2 = 15L;
        long c2 = a2 + b2;
        System.out.println("int -> long: " + c2);

        //-------------------------------------------------------

        // int → float
        int a3 = 10;
        float b3 = 1.5f;
        float c3 = a3 * b3;
        System.out.println("int -> float: " + c3);

        //-------------------------------------------------------

        // float → double
        int a4 = 10;
        float b4 = 1.5f;
        double c4 = a4 * b4;
        System.out.println("float -> double: " + c4);
    }
}