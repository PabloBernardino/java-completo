public class Funcionario_UsoInit {

    String nome;
    String cargo;
    int idade;

    // Este é o construtor
    Funcionario_UsoInit(String nomeInit, String cargoInit, int idadeInit) {

        nome = nomeInit;
        cargo = cargoInit;
        idade = idadeInit;

    }

    public static void main(String[] args) {

        Funcionario_UsoInit funcionario01 = new Funcionario_UsoInit("João", "Desenvolvedor", 30); // Objeto
        //funcionario01.nome = "João";
        //funcionario01.cargo = "Desenvolvedor";
        //funcionario01.idade = 30;

        Funcionario_UsoInit funcionario02 = new Funcionario_UsoInit("Maria", "Gerente", 50); // Objeto
        //funcionario02.nome = "Maria";
        //funcionario02.cargo = "Gerente";
        //funcionario02.idade = 50;

        System.out.println("Nome: " + funcionario01.nome);
        System.out.println("Cargo: " + funcionario01.cargo);
        System.out.println("Idade: " + funcionario01.idade);

        System.out.println("---------------------");

        System.out.println("Nome: " + funcionario02.nome);
        System.out.println("Cargo: " + funcionario02.cargo);
        System.out.println("Idade: " + funcionario02.idade);
    }
}