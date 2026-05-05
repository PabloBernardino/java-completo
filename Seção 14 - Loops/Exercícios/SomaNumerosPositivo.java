import java.util.Scanner;

public class SomaNumerosPositivo {
	public static void main(String[] args) {
		
		Scanner print = new Scanner(System.in);

		int numeroPositivo = 10;
		int soma = 0;
		int numero; 

		do {
			System.out.print("Digite um numero: ");
			numero = print.nextInt();

			if (numero > 0) { 
				soma = soma + numero;
			}

		} while (numero <= numeroPositivo);

		System.out.println("Total da soma dos números digitados: " + soma);
	}
}