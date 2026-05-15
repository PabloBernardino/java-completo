package empresa.dados;

public class Funcionario {
	private String nome;
	private double salario;

	public Funcionario(String nomeInit, double salarioInit) { // Construtor
		nome = nomeInit;
		salario = salarioInit;
	}

	public String obterInfo() { // Método
		return "Nome: " + nome + ", Salário: " + salario;
	}

	public void aumentarSalario(double aumento) { // Passagem por valor
		salario += aumento; // ou (salario = salario + aumento;)
	}

	
}