public class TestPersonagem {

	public static void main(String[] args) {

		Personagem personagem = new Personagem("Pablo", 100);

		// ANTES
		System.out.println("Nível antes: " + personagem.nivelDePoder); 

		// Tentando alterar valor primitivo
		personagem.tentarAumentarNivelDePoder(personagem.nivelDePoder); 

		// DEPOIS
		System.out.println("Nível depois: " + personagem.nivelDePoder); 

		System.out.println();

		// Nome antes
		System.out.println("Nome antes: " + personagem.nome); 

		// Alterando objeto
		personagem.mudarNome(personagem); 

		// Nome depois
		System.out.println("Nome depois: " + personagem.nome);

		System.out.println();

		// Alterando nível REAL
		personagem.aumentarNivelReal(personagem);

		System.out.println("Novo nível: " + personagem.nivelDePoder);
	}
}