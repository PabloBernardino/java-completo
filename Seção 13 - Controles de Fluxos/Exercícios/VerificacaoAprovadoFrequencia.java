import java.util.Scanner;

public class VerificacaoAprovadoFrequencia {
	public static void main(String[] args) {
		
		Scanner print = new Scanner(System.in);

		int nota1, nota2;
		String entrada;

		// Entrada de dados
		System.out.print("Digite a 1º nota: ");
		nota1 = print.nextInt();

		System.out.println();

		System.out.print("Digite a 2º nota: ");
		nota2 = print.nextInt();

		System.out.println();

		print.nextLine(); 

		System.out.print("Digite a frequência do aluno: ");
		entrada = print.nextLine();

		entrada = entrada.replace("%", ""); // remove %

		double frequencia = Double.parseDouble(entrada);

		System.out.println();

		// Processamento
		int media = (nota1 + nota2) / 2;

		if (media >= 7 && frequencia >= 60) {
			System.out.println("Aluno aprovado!");
		} else {
			System.out.println("Aluno reprovado...");
		}

		print.close();
	}
}