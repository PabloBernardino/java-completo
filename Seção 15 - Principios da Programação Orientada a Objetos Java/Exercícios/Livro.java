public class Livro {

	public String titulo;
	private String autor;
	protected int anoPublicacao;
	double preco; // Default  

	Livro() {

		titulo = "Desconhecido";
		autor = "Desconhecido";
		anoPublicacao = 0;
		preco = 0.0;

	}

	Livro(String tituloInit, String autorInit) {

		titulo = tituloInit;
		autor = autorInit;
		anoPublicacao = 0;
		preco = 0.0;
	}

	Livro(String titulo, String autor, int anoPublicacao, double preco) {

		this.titulo = titulo;
		this.autor = autor;
		this.anoPublicacao = anoPublicacao;
		this.preco = preco;
	}

	@Override
	public String toString() {

		return "Título: " + titulo +
		   		", Autor: " + autor +
		   		", Ano: " + anoPublicacao +
		   		", Preço: " + preco;
	}

}

