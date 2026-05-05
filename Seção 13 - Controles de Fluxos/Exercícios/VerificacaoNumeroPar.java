public class VerificacaoNumeroPar {
	public static void main(String[] args) {
		
		// Usando If e Else
		int numero = 10;

		if (numero % 2 == 0) {

			System.out.println("O número é par");

		} else {

			System.out.println("O número é impar");
		}

		System.out.println();

		// Usando o operador ternário

		int number = 5; 

		String resultado = (number % 2 == 0) ? "O numero é par" : "O número é impar";

		System.out.println("O número é: " + resultado);

	}
}