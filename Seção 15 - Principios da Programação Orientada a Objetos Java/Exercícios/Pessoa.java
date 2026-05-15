public class Pessoa {

	public String nome;
	private int idade;
	protected String endereco;
	long telefone; // default

	// GET e SET da idade
	public int getIdade() {

		return idade;
	}

	public void setIdade(int idade) {

		this.idade = idade;

	}

	// GET e SET do endereco
	public String getEndereco() {

		return endereco;
	}

	public void setEndereco(String endereco) {

		this.endereco = endereco;
	}

	// GET e SET do telefone
	public long getTelefone() {

		return telefone;
	}

	public void setTelefone(long telefone) {

		this.telefone = telefone;
	}
}