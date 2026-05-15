
public class Aplicacao {

	public static void main(String[] args) {
		
		Carro carro01 = new Carro();
		Carro carro02 = new Carro("BMW", "320i");
		Carro carro03 = new Carro("Porsche", "992 turbo s", 2024);

		carro01.exibirDetalhes();
	}
} 