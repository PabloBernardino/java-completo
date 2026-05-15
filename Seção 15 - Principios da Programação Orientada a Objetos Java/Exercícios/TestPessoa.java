public class TestPessoa {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();

		pessoa.nome = "Pablo Bernardino";

		pessoa.setIdade(23);
		pessoa.setEndereco("São Paulo");
		pessoa.setTelefone(11949092368L);

		System.out.println("Nome: " + pessoa.nome);
		System.out.println("Idade: " + pessoa.getIdade() + " anos");
		System.out.println("Endereço: " + pessoa.getEndereco());
		System.out.println("Telefone: " + pessoa.getTelefone());
	}
}