import java.util.Scanner;

public class AprovacaoSimplificada {
	public static void main(String[] args) {
		
		Scanner print = new Scanner(System.in);

		int nota1, nota2;

		// Entrada de Dados
		System.out.print("Digite a 1º nota: ");
		nota1 = print.nextInt();

		System.out.print("Digite a 2º nota: ");
		nota2 = print.nextInt();

		int media; 

		media = (nota1 + nota2) / 2;

		if (media < 6) {
			System.out.println("Aluno reprovado...");
		}else if (media >= 6) {
			System.out.println("Aluno Aprovador!");
		};



	}

}