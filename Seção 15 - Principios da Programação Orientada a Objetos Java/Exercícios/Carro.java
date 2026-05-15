public class Carro {
	
	String marcaDoCarro;
	String modeloDoCarro;
	int anoDoCarro;

	Carro() { // Construtor Default 

        marcaDoCarro = "Desconhecida";
        modeloDoCarro = "Desconhecido";
        anoDoCarro = 0;
	}

	Carro(String marcaDoCarro, String modeloDoCarro) {// Construtor que recebe marca e modelo (Sobrecarga de Construtores)

		this.marcaDoCarro = marcaDoCarro;
		this.modeloDoCarro = modeloDoCarro;
	}

	Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) { // Construtor que recebe marca, modelo e ano (Sobrecarga de Construtores)

		this.marcaDoCarro = marcaDoCarro;
		this.modeloDoCarro = modeloDoCarro;
		this.anoDoCarro = anoDoCarro;
	}

	public void exibirDetalhes() { // Método

		System.out.println("Tabela de detalhamento dos carros");

		System.out.println();

		System.out.println("---------------------------------");

		System.out.println();

		System.out.println("Marca do carro: " + marcaDoCarro);
		System.out.println("Modelo do carro: " + modeloDoCarro);
		System.out.println("Ano do carro: " + anoDoCarro);
	}
}
