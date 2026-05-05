public class OperadoresLogicos {
	public static void main(String[] args) {
		

		// Os operadores lógicos são usados para combinar duas ou mais condições:

		// E lógico (&&)
		// OU lógico (||)
		// NÃO lógico (!)

		// Exemplo:

		int a = 10;
		int b  = 20;
		boolean c = true;

		System.out.println(a < b && c); // Saída: true
		System.out.println(a > b || c); // Saída: true
		System.out.println(!c); 		// Saída: false
	}	
}