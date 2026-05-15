import empresa.dados.*;

class FolhaDePagamento {
	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario("Arnaldo", 5000.00);
		System.out.println(funcionario.obterInfo()); // Estou chamando o objeto + método, certo?

		funcionario.aumentarSalario(3000.00); // Estou chamando o objeto + passagem por valor, certo?
		System.out.println(funcionario.obterInfo());
	}
}