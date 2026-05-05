public class Switch {
	public static void main(String[] args) {
		
		// Exemplo 1

		int day = 3;

		switch (day) {  

			case 1 -> System.out.println("Segunda"); 

			case 2 -> System.out.println("Terca"); 

			case 3 -> System.out.println("Quarta"); 

			// ...  

			default -> System.out.println("Desconhecido");  
		} 

		// Exemplo 2

		String dia = "Ter.";

		String tipoDeDia = switch (dia) {
			case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia util";
			case "Sabado", "Domingo" -> "Fim de semana";
			default -> "Desconhecido";
		};

		System.out.println(tipoDeDia); // Dia util
	}
}