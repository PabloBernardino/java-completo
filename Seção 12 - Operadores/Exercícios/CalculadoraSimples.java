public class CalculadoraSimples {
    public static void main(String[] args) {
        
        int a = 10;
        int b = 2;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

        //-------------------------------------//
        System.out.println("Operadores de Atribuição");
        System.out.println("_______________________________");

        var numero = 0;

        numero += 3;
        numero -= 2;
        numero *= 4;
        numero /= 2;

        System.out.println(numero);

        //-------------------------------------//
        System.out.println("Incremento e Decremento");
        System.out.println("_______________________________");

        var contador = 5;

        contador++;
        System.out.println(contador);

        contador--;
        System.out.println(contador);

        //-------------------------------------//

        System.out.println("Precedencia Operadores");
        System.out.println("_______________________________");

        numero = 5; // ✅ reutilizando variável

        ++numero;
        numero++;
        --numero;
        numero--;

        System.out.println(numero);
    }
}