public class Funcionario_SobrecargaConstrutores {

    String nome;
    String cargo;
    int idade;

    // Este é o construtor
    Funcionario_SobrecargaConstrutores(int idadeInit, String cargoInit, String nomeInit) {

        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;

    }
    Funcionario_SobrecargaConstrutores(String nomeInit, String cargoInit, int idadeInit) {

        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;

    }

    Funcionario_SobrecargaConstrutores(String nomeInit){

        nome = nomeInit;

    }

    public static void main(String[] args) {

        Funcionario_SobrecargaConstrutores funcionario = 
        new Funcionario_SobrecargaConstrutores("Pablo Bernardino"); // Objeto

        System.out.println("Nome: " + funcionario.nome);
        System.out.println("Cargo: " + funcionario.cargo);
        System.out.println("Idade: " + funcionario.idade);

    }
}