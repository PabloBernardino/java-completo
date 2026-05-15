public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEmEstoque;

	public Produto(String nomeInit, double precoInit, int quantidadeEmEstoqueInit) { // Construtor

		nome = nomeInit;
		preco = precoInit;
		quantidadeEmEstoque = quantidadeEmEstoqueInit;
	}

	public void exibirInformações() { // Método

		System.out.println();

		System.out.println("Nome do produto: " + nome);
		System.out.println("Preço do produto: " + preco);
		System.out.println("Quantidades disponivel em estoque: " + quantidadeEmEstoque);
	}

	public static void main(String[] args) {
		
		Produto pd = new Produto("airsoft Ponto 40", 6200.60, 10); // Objeto ou instância 

		pd.exibirInformações();

	}

}