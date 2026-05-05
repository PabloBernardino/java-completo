import java.util.Scanner;

public class DiasNoMes {
	public static void main(String[] args) {
		
		Scanner print = new Scanner(System.in);

		System.out.print("Vamos descobrir quantos dias tem seu mês. Digite o valor: ");
		String mes = print.nextLine();

		System.out.println();

		switch(mes) {
			case "Janeiro":
				System.out.println("o número de dias é 31");
				break;
			case "Fevereiro": 
				System.out.println("o número de dias é 28 (considerando um ano não bissexto)");
				break;
			case "Março":
				System.out.println("o número de dias é 31");
				break;
			case "Abril":
				System.out.println("número de dias é 30");
				break;
			case "Maio":
				System.out.println("o número de dias é 31");
				break;
			case "Junho":
				System.out.println("número de dias é 30");
				break;
			case "Julho":
				System.out.println("o número de dias é 31");
				break;
			case "Agosto":
				System.out.println("o número de dias é 31");
				break;
			case "Setembro":
				System.out.println("número de dias é 30");
				break;
			case "Outubro":
				System.out.println("o número de dias é 31");
				break;
			case "Novembro":
				System.out.println("número de dias é 30");
				break;
			case "Dezembro":
				System.out.println("o número de dias é 31");
				break;				
			default:
				System.out.println("Mês desconhecido!");
				break;
		}

		print.close();
	}
}