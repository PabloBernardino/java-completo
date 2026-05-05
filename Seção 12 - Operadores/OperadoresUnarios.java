public class OperadoresUnarios {
	public static void main(String[] args) {
		
		// Os operadores unários são usados para operar em um único
		// operando:

		// Incremento (++)
		// Decremento (--)
		// Positivo (+)
		// Negativo (-)
		// Negação lógica (!)

		// Exemplo:

		int a = 10;

		a++; // Equivale a (a = a + 1)

		System.out.println(a); // Saída: 11

		int b = 5;

		// Pré-incremento int b = ++a; // Agora, a é 6 e b também é 6

		++b;
		System.out.println(b);

		// Pós-incremento int c = a++; // Agora, a é 7, mas c é 6 (porque o
		// valor antigo de a foi usado)

		b++;
		System.out.println(b);

		// Pré-decremento int d = --a; // Agora, a é 6 e d também é 6

		--b;
		System.out.println(b);

		// Pós-decremento int e = a--; // Agora, a é 5, mas e é 6 (porque o
		// valor antigo de a foi usado

		b--;
		System.out.println(b);
	}
}