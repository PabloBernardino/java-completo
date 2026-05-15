🚗 Sistema de Cadastro de Carros em Java

Projeto simples desenvolvido em Java para praticar conceitos básicos de Programação Orientada a Objetos (POO), construtores e sobrecarga de construtores.

📚 Conceitos praticados
Classes
Objetos
Métodos
Construtores
Construtor Default
Sobrecarga de Construtores
Uso do this
Instanciação de objetos
Organização de código em POO
System.out.println()
📦 Estrutura do Projeto
Classe Carro
public class Carro {

    String marcaDoCarro;
    String modeloDoCarro;
    int anoDoCarro;

    // Construtor Default
    Carro() {

        marcaDoCarro = "Desconhecida";
        modeloDoCarro = "Desconhecido";
        anoDoCarro = 0;

    }

    // Sobrecarga de construtor
    Carro(String marcaDoCarro, String modeloDoCarro) {

        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;

    }

    // Sobrecarga de construtor
    Carro(String marcaDoCarro, String modeloDoCarro, int anoDoCarro) {

        this.marcaDoCarro = marcaDoCarro;
        this.modeloDoCarro = modeloDoCarro;
        this.anoDoCarro = anoDoCarro;

    }

    public void exibirDetalhes() {

        System.out.println("Tabela de detalhamento dos carros");

        System.out.println();

        System.out.println("---------------------------------");

        System.out.println();

        System.out.println("Marca do carro: " + marcaDoCarro);
        System.out.println("Modelo do carro: " + modeloDoCarro);
        System.out.println("Ano do carro: " + anoDoCarro);

        System.out.println();

    }

}
Classe Aplicacao
public class Aplicacao {

    public static void main(String[] args) {

        Carro carro01 = new Carro();
        Carro carro02 = new Carro("BMW", "320i");
        Carro carro03 = new Carro("Porsche", "992 Turbo S", 2024);

        carro01.exibirDetalhes();
        carro02.exibirDetalhes();
        carro03.exibirDetalhes();

    }

}
🚀 O que o programa faz?

O sistema:

cria objetos da classe Carro
utiliza diferentes construtores
exibe as informações dos carros no console
🖥️ Saída esperada
Tabela de detalhamento dos carros

---------------------------------

Marca do carro: Desconhecida
Modelo do carro: Desconhecido
Ano do carro: 0

Tabela de detalhamento dos carros

---------------------------------

Marca do carro: BMW
Modelo do carro: 320i
Ano do carro: 0

Tabela de detalhamento dos carros

---------------------------------

Marca do carro: Porsche
Modelo do carro: 992 Turbo S
Ano do carro: 2024
🎯 Objetivo do exercício

Praticar:

criação de classes
criação de objetos
uso de construtores
sobrecarga de construtores
utilização do this
criação de métodos
organização de código orientado a objetos
🛠️ Tecnologias utilizadas
Java
Sublime Text
📖 Aprendizados

Durante este exercício foi possível aprender:

como funciona um construtor
diferença entre construtor default e sobrecarga
como o Java escolhe construtores automaticamente
como criar e utilizar métodos
como objetos armazenam dados
uso do this para diferenciar atributos e parâmetros
👨‍💻 Autor

Desenvolvido por Pablo Bernardino durante os estudos de Programação Orientada a Objetos em Java.