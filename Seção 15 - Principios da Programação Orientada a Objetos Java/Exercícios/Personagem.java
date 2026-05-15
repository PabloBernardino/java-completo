public class Personagem {

	String nome;
	int nivelDePoder;

	// Construtor
	Personagem(String nome, int nivelDePoder) {

		this.nome = nome;
		this.nivelDePoder = nivelDePoder;
	}

	// Tentando modificar um tipo primitivo
	void tentarAumentarNivelDePoder(int nivel) {

		nivel += 10; // ou seja, (nivel = nivel + 10;)

		System.out.println("Dentro do método: " + nivel);
	}

	// Modificando objeto
	void mudarNome(Personagem personagem) {

		personagem.nome = "Super Pablo";
	}

	// Modificando o nível REAL do objeto
	void aumentarNivelReal(Personagem personagem) {

		personagem.nivelDePoder += 10; // ou seja, (personagem.nivelDePoder = personagem.nivelDePoder + 10;)
	}
}